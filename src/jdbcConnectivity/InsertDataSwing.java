package jdbcConnectivity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class InsertDataSwing extends JFrame {
    private JTextField nameField, cityField, emailField, passwordField;
    private JButton insertButton;

    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/demo";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public InsertDataSwing() {
        setTitle("Insert User Data");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        // Create input fields
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("City:"));
        cityField = new JTextField();
        add(cityField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        // Insert button
        insertButton = new JButton("Insert");
        add(insertButton);

        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertData();
            }
        });

        setVisible(true);
    }

    private void insertData() {
        String name = nameField.getText();
        String city = cityField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();

        // Insert query
        String query = "INSERT INTO users (name, city, email, password) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setString(3, email);
            pstmt.setString(4, password);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "User inserted successfully!");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error inserting user.");
        }
    }

    public static void main(String[] args) {
        new InsertDataSwing();
    }
}
