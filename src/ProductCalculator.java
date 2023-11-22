import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductCalculator extends JFrame {
    private JPanel MainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton exitButton;
    private JTextArea textArea1;
    private JButton priceButton;
    private JTextField textField4;
    private JTextField textField5;
    private JLabel labelField2;
    private JLabel labelField3;
    private int sum;

    public static void main(String[] args) {
        new ProductCalculator();
    }

    public ProductCalculator() {
        setContentPane(MainPanel);
        setTitle("GUI");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        sum = 0;

        priceButton.addActionListener(e -> {
            String sid = "^[0-9]\\d*$";
            Pattern pattern = Pattern.compile(sid);
            String valueTextField2 = textField2.getText();
            String valueTextField3 = textField3.getText();
            Matcher matcher = pattern.matcher(valueTextField2 + valueTextField3);
            if (matcher.matches()) {
                int price = Integer.parseInt(valueTextField2) * Integer.parseInt(valueTextField3);
                String messageResult = textField1.getText() + "=" + valueTextField2 + "*" + valueTextField3 + "=" + price;
                if (textArea1.getText().isEmpty()) {
                    textArea1.append(messageResult);
                } else {
                    textArea1.append("\n" + messageResult);
                }
                sum += price;
                textField4.setText(Integer.toString(price));
                textField5.setText(Integer.toString(sum));
            } else {
                JOptionPane.showMessageDialog(null, "В поля \"" + labelField2.getText() + "\", \"" + labelField3.getText() + "\" вводятся числа");
            }
        });

        exitButton.addActionListener(e -> System.exit(0));
    }
}
