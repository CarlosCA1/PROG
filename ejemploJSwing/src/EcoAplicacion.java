import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcoAplicacion  extends JFrame {
    public JTextField cadroTexto;

    public EcoAplicacion(){
        super();
        //super ("Primera aplicación con Swing");
        setTitle("Primera aplicación con Swing");

        JComponent botoneira = creaBotons();
        JComponent panelCadroTexto = creaPanelCadro();
        cadroTexto = (JTextField) panelCadroTexto;

        JSplitPane panelPrincipal = new JSplitPane(JSplitPane.VERTICAL_SPLIT, botoneira, panelCadroTexto);
        getContentPane().add(panelPrincipal);
        pack();
        setVisible(true);
    }

    private JComponent creaBotons(){
        JPanel botoneira = new JPanel();
        JButton btnHola = new JButton("Di ola!");

        btnHola.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        cadroTexto.setText("Ola a todos!");
                    }
                }
        );

        botoneira.add(btnHola);

        return botoneira;
    }

    private JComponent creaPanelCadro(){
        JTextField txtCadro = new JTextField();
        return txtCadro;
    }
}
