package controlador;

import java.awt.event.KeyAdapter;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import vista.VistaOperaciones;
import ws.Cliente;
import vista.VistaRegistro;
import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author Usuario
 */
public class ControladorRegistro {

    private final VistaRegistro register_view;
    WSOperaciones_Service service = new WSOperaciones_Service();
    WSOperaciones client = service.getWSOperacionesPort();
    List<Cliente> list = new ArrayList<>();

    //Constructor que permite hacer visible el JForm - necesita una instancia de JFrame
    public ControladorRegistro(VistaRegistro register_view) {
        this.register_view = register_view;
        register_view.setVisible(true);
        register_view.setLocationRelativeTo(null);
    }

    //Controlador para eventos en los botones y llamadas a los métodos
    public void takeControl() {
        register_view.getReg_btn().addActionListener(l -> registerOperation());
        validInfo();
    }

    private void registerOperation() {
        try {
            String user = register_view.getReg_user_txt().getText().trim();
            char[] passwordkey = register_view.getReg_pass_txt().getPassword();
            String password = new String(passwordkey);
            char[] repasswordkey = register_view.getReg_repass_txt().getPassword();
            String repassword = new String(repasswordkey);
            Double saldo = Double.parseDouble(String.valueOf(register_view.getReg_saldo_txt().getText().trim()));

            if (!EmptyField(user, password)) {
                JOptionPane.showMessageDialog(register_view, "Llene todos los campos");
                return;
            }

            if (!confirmPassword(password, repassword)) {
                JOptionPane.showMessageDialog(register_view, "Las contraseñas no coinciden");
                return;
            }

            if (!notNegative(saldo)) {
                JOptionPane.showMessageDialog(register_view, "Ingrese un valor válido");
                return;
            }
            
            Cliente cliente = new Cliente(password, saldo, user);
            
            if (client.register(cliente) == null) {
                JOptionPane.showMessageDialog(register_view, "No se pudo registrar, verifique los datos");
            } else {
                JOptionPane.showMessageDialog(register_view, "Registro completado...");
                list.add(cliente);
                showOperaciones(cliente.getUser(), cliente.getSaldo());
                register_view.dispose();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(register_view, "Llene todos los campos");
        }
    }

    /*
     * Validadores
     */
    //Evita el uso de letras en el campo de saldo
    private void validInfo() {
        addTextKeyListenerNotLetter(register_view.getReg_saldo_txt(), 20);
    }

    /*Crea el evento con una sobreescritura al método de keyTyped - extrae ASCI y verifica que no sea una letra y controla
    el tamaño máximo*/
    private void addTextKeyListenerNotLetter(JTextField text, int maxLength) {
        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char m = evt.getKeyChar();
                if (Character.isLetter(m) || text.getText().trim().length() >= maxLength) {
                    evt.consume();
                }
            }
        });
    }

    //Valida que las contraseñas sean iguales - contraseña y confirmación de la misma
    private Boolean confirmPassword(String password, String confirm) {
        return password.equals(confirm);
    }

    private Boolean notNegative(Double cash) {
        return cash >= 0.0;
    }
    
    //¿Working?
    private Boolean exitsClient(String user) {
        Boolean exists = (client.foundCliente(user) != null);
        return exists;
    }

    //Valida los campos no vacíos
    private Boolean EmptyField(String user, String password) {
        return !(user.trim().isEmpty() || password.trim().isEmpty());
    }

    //Call Operaciones view method
    private void showOperaciones(String user, Double saldo) {
        VistaOperaciones vop = new VistaOperaciones();
        ControladorOperaciones cto = new ControladorOperaciones(vop);
        vop.getLabel_username().setText(user);
        vop.getLabel_total().setText(String.valueOf(saldo));
        cto.takeControl();
    }
}
