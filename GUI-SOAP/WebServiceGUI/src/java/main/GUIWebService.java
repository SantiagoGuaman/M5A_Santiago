package main;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vista.VistaLogin;
import controlador.ControladorLogin;
import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author Usuario
 */
public class GUIWebService {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
            WSOperaciones_Service service = new WSOperaciones_Service();
            WSOperaciones client = service.getWSOperacionesPort();
            client.cargarClientes();
            VistaLogin vl = new VistaLogin();
            ControladorLogin ctl = new ControladorLogin(vl);
            ctl.takeControl();
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
        }
    }
}
