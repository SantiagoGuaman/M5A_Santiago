package controlador;

import java.awt.event.KeyAdapter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import vista.VistaOperaciones;
import ws.Cliente;
import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author Usuario
 */
public class ControladorOperaciones {

    private final VistaOperaciones operaciones_view;
    WSOperaciones_Service service = new WSOperaciones_Service();
    WSOperaciones client = service.getWSOperacionesPort();

    //Constructor para hacer visible el JForm
    public ControladorOperaciones(VistaOperaciones operaciones_view) {
        this.operaciones_view = operaciones_view;
        operaciones_view.setVisible(true);
        operaciones_view.setLocationRelativeTo(null);
    }

    //Controlador - Operaciones
    public void takeControl() {
        operaciones_view.getOp_btn_acction().addActionListener(l -> validOperation());
        validInfo();
    }

    private void validOperation() throws NumberFormatException {
        try {
            Cliente cliente;
            String user = operaciones_view.getLabel_username().getText();
            Double saldo = Double.parseDouble(operaciones_view.getOp_value_txt().getText());

            if (!notNegative(saldo)) {
                JOptionPane.showMessageDialog(operaciones_view, "Ingrese un valor válido");
                return;
            }

            if (operaciones_view.getCheck_deposito().isSelected()) {
                cliente = deposito(user, saldo);
                operaciones_view.getLabel_total().setText(cliente.getSaldo().toString());
            } else if (operaciones_view.getCheck_retiro().isSelected()) {
                cliente = retiro(user, saldo);
                operaciones_view.getLabel_total().setText(cliente.getSaldo().toString());
            } else {
                JOptionPane.showMessageDialog(operaciones_view, "Seleccione una operación");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(operaciones_view, "digite un valor para la operación seleccionada");
        }
    }

    /*
     * Validar no letras en el campo de dígitos
     */
    private void validInfo() {
        addTextKeyListenerNotLetter(operaciones_view.getOp_value_txt(), 20);
    }

    private Boolean notNegative(Double cash) {
        return cash >= 0.0;
    }

    /*
     * Event call - Override
     */
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

    //Operación de retiro call
    private Cliente retiro(String user, Double cash) {
        Cliente cliente = client.foundCliente(user);
        if (client.retiro(user, cash) != null && cliente.getSaldo() >= cash) {
            JOptionPane.showMessageDialog(operaciones_view, "Retiro completado con éxito");
            cliente = client.foundCliente(user);
            return cliente;
        } else {
            JOptionPane.showMessageDialog(operaciones_view, "Saldo insuficiente para realizar la operación");
            return cliente;
        }
    }

    //Operación de depósito call
    private Cliente deposito(String user, Double cash) {
        Cliente cliente = client.foundCliente(user);
        if (client.deposito(user, cash) != null) {
            JOptionPane.showMessageDialog(operaciones_view, "Depósito completado con éxito");
            cliente = client.foundCliente(user);
            return cliente;
        } else {
            JOptionPane.showMessageDialog(operaciones_view, "Falló la operación");
            return cliente;
        }
    }

}
