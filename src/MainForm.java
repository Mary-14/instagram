import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JRadioButton сложениеRadioButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    public JPanel rp;
    private JRadioButton делениеRadioButton;


    public MainForm() {
        textField3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1;
                    int num2;
                    num1 = Integer.parseInt(textField1.getText());
                    num2 = Integer.parseInt(textField2.getText());
                    int sum = 0;
                    if (сложениеRadioButton.isSelected()) {
                        sum = num1 + num2;
                    } else if (делениеRadioButton.isSelected()) {
                        sum = num1 / num2;
                    }

                } catch (Exception e1) {

                }
            }
        });
    }
}