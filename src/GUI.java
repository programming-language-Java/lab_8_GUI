import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GUI extends JFrame {
    private JTextField textField1;
    private JButton sinXButton;
    private JButton cosXButton;
    private JTextField textField2;
    private JPanel MainPanel;
    private JTextArea textArea1;
    private JLabel labelField;

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        setContentPane(MainPanel);
        setTitle("GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);

        sinXButton.addActionListener(e -> {
            String sid = "^[0-9]\\d*$";
            Pattern pattern = Pattern.compile(sid);
            String valueTextField1 = textField1.getText();
            Matcher matcher = pattern.matcher(valueTextField1);
            if (matcher.matches()) {
                double degree = Double.parseDouble(valueTextField1);
                String result = String.valueOf(Math.sin(degree));
                textField2.setText(result);
                String operation = "sin(" + degree + ") = " + result;
                if (textArea1.getText().isEmpty()) {
                    textArea1.append(operation);
                } else {
                    textArea1.append("\n" + operation);
                }
            } else {
                JOptionPane.showMessageDialog(null, "В поле \"" + labelField.getText() + "\" вводится число");
            }
        });

        cosXButton.addActionListener(e -> {
            String sid = "^[0-9]\\d*$";
            Pattern pattern = Pattern.compile(sid);
            String valueTextField1 = textField1.getText();
            Matcher matcher = pattern.matcher(valueTextField1);
            if (matcher.matches()) {
                double degree = Double.parseDouble(valueTextField1);
                String result = String.valueOf(Math.cos(degree));
                textField2.setText(result);
                String operation = "cos(" + degree + ") = " + result;
                if (textArea1.getText().isEmpty()) {
                    textArea1.append(operation);
                } else {
                    textArea1.append("\n" + operation);
                }
            } else {
                JOptionPane.showMessageDialog(null, "В поле \"" + labelField.getText() + "\" вводится число");
            }
        });
    }
}
