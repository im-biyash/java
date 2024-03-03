import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldComparisonApp extends JFrame implements ActionListener {
    private JTextField textField1, textField2;
    private JButton compareButton;

    TextFieldComparisonApp() {
        JPanel panel = new JPanel(); // Create a JPanel
        panel.setLayout(new GridLayout(3, 1));
        panel.setSize(300,400);

        textField1 = new JTextField();
        textField2 = new JTextField();
        compareButton = new JButton("Compare");

        // Add components to the JPanel
        panel.add(textField1);
        panel.add(textField2);
        panel.add(compareButton);

        // Add the JPanel to the frame
        add(panel);

        compareButton.addActionListener(this);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String content1 = textField1.getText();
        String content2 = textField2.getText();

        if (content1.equals(content2)) {
            getContentPane().setBackground(Color.GREEN);
        } else {
            getContentPane().setBackground(Color.RED);
        }

        // Force a repaint to ensure the color change is visible
        repaint();
    }

    public static void main(String[] args) {
        new TextFieldComparisonApp();


    }
}
