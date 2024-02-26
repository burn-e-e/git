import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame {

    private JTextField textField;
    private JButton button;

    public UI() {
        setTitle("Todo list by Burn-e-e");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Create and configure text field
        textField = new JTextField(20);
        textField.setFont(new Font("Arial", Font.PLAIN, 14));
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        textField.setBorder(border);

        // Center the text field using a layout manager
        setLayout(new FlowLayout(FlowLayout.CENTER)); // Center alignment
        add(textField);
        getContentPane().setBackground(Color.white);
        button = new JButton("ADD");
        button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             String enteredText = textField.getText();
             System.out.println("User entered: " + enteredText);
         }
        });
        add(button);

        // Handle user input (optional)
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredText = textField.getText();
                System.out.println("User entered: " + enteredText);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new UI();
    }
}
