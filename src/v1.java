import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class v1 {
    private JPanel panel;
    private JButton SIGUIENTEButton;
    private JFormattedTextField Peso;
    private JTextField Altura;
    private JLabel labelRespuesta;
    public v1() {
        SIGUIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String peso = Peso.getText();
               String altura = Altura.getText();
               double imcpeso = Double.parseDouble(peso);
               double imcaltura = Double.parseDouble(altura);
               double formula=Math.pow(imcaltura,2)/imcpeso;
               String imc = String.format("%.2f",formula);
                labelRespuesta.setText("SU PESO ES: " + imc );
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("v1");
        frame.setContentPane(new v1().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
