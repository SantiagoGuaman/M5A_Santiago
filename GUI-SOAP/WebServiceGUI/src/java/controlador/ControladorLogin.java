package controlador;

import javax.swing.JOptionPane;
import vista.VistaLogin;
import vista.VistaOperaciones;
import vista.VistaRegistro;
import ws.Cliente;
import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author Usuario
 */
public class ControladorLogin {

    private final VistaLogin login_view;
    WSOperaciones_Service service = new WSOperaciones_Service();
    WSOperaciones client = service.getWSOperacionesPort();

    //Constructor para hacer visible el JForm - recibe el JForm como parámetro
    public ControladorLogin(VistaLogin login_view) {
        this.login_view = login_view;
        login_view.setVisible(true);
        login_view.setLocationRelativeTo(null);
    }

    //Controlador del login para las acciones
    public void takeControl() {
        login_view.getLogin_btn().addActionListener(l -> validInformation());
        login_view.getRegister_log_btn().addActionListener(l -> showRegister());
    }

    private void validInformation() {
        String user = login_view.getLogin_name_txt().getText().trim();
        char[] passwordkey = login_view.getLogin_password_txt().getPassword();
        String password = new String(passwordkey);
        if (!client.login(user, password)) {
            JOptionPane.showMessageDialog(login_view, "Verifique las credenciales");
        } else {
            JOptionPane.showMessageDialog(login_view, "Bienvenido");
            Cliente cliente = client.foundCliente(user);
            login_view.dispose();
            showOperaciones(cliente.getUser(), cliente.getSaldo().toString());
        }
    }

    //Call Register view method - Button Registro clic action
    private void showRegister() {
        VistaRegistro reg = new VistaRegistro();
        ControladorRegistro ctr = new ControladorRegistro(reg);
        login_view.dispose();
        ctr.takeControl();
    }

    //Call Operaciones view method - Login correcto 
    private void showOperaciones(String user, String saldo) {
        VistaOperaciones vop = new VistaOperaciones();
        ControladorOperaciones cto = new ControladorOperaciones(vop);
        vop.getLabel_username().setText(user);
        vop.getLabel_total().setText(saldo);
        cto.takeControl();
    }
}
