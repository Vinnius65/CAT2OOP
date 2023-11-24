import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm extends JFrame {
    private JTextField nameField, usernameField, emailField, phoneField, addressField;
    private JPasswordField passwordField, confirmPasswordField;

    public RegisterForm() {

        setTitle("Register Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JLabel titleLabel = new JLabel("Register Form");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel nameLabel = new JLabel("Name:");
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel phoneLabel = new JLabel("Phone:");
        JLabel addressLabel = new JLabel("Address:");

        nameField = new JTextField(20);
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        confirmPasswordField = new JPasswordField(20);
        emailField = new JTextField(20);
        phoneField = new JTextField(20);
        addressField = new JTextField(20);

        JButton submitButton = new JButton("Submit");
        JButton resetButton = new JButton("Reset");
        JButton closeButton = new JButton("Close");


        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(titleLabel, gbc);


        gbc.gridwidth = 1;
        gbc.gridy++;
        mainPanel.add(nameLabel, gbc);
        gbc.gridy++;
        mainPanel.add(usernameLabel, gbc);
        gbc.gridy++;
        mainPanel.add(passwordLabel, gbc);
        gbc.gridy++;
        mainPanel.add(confirmPasswordLabel, gbc);
        gbc.gridy++;
        mainPanel.add(emailLabel, gbc);
        gbc.gridy++;
        mainPanel.add(phoneLabel, gbc);
        gbc.gridy++;
        mainPanel.add(addressLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        mainPanel.add(nameField, gbc);
        gbc.gridy++;
        mainPanel.add(usernameField, gbc);
        gbc.gridy++;
        mainPanel.add(passwordField, gbc);
        gbc.gridy++;
        mainPanel.add(confirmPasswordField, gbc);
        gbc.gridy++;
        mainPanel.add(emailField, gbc);
        gbc.gridy++;
        mainPanel.add(phoneField, gbc);
        gbc.gridy++;
        mainPanel.add(addressField, gbc);


        gbc.gridy++;
        gbc.gridx = 0;
        mainPanel.add(submitButton, gbc);
        gbc.gridx++;
        mainPanel.add(resetButton, gbc);
        gbc.gridx++;
        mainPanel.add(closeButton, gbc);


        mainPanel.setBackground(Color.GRAY);
        getContentPane().add(mainPanel);


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(RegisterForm.this, "Registration Successful!");
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private void clearFields() {
        nameField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        emailField.setText("");
        phoneField.setText("");
        addressField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }
}
