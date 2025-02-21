package jdbcConnectivity;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class InsertDataSwing {

    private static final String URL = "jdbc:mysql://localhost:3306/demo";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public void createGUI() {
        JFrame frame = new JFrame("Insert User Data");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        JTextField nameField = new JTextField();
        JTextField cityField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton insertButton = new JButton("Insert");

        frame.add(new JLabel("Name:")); frame.add(nameField);
        frame.add(new JLabel("City:")); frame.add(cityField);
        frame.add(new JLabel("Email:")); frame.add(emailField);
        frame.add(new JLabel("Password:")); frame.add(passwordField);
        frame.add(insertButton);

        insertButton.addActionListener(e -> insertData(nameField, cityField, emailField, passwordField, frame));

        frame.setVisible(true);
    }

    private void insertData(JTextField nameField, JTextField cityField, JTextField emailField,
                            JPasswordField passwordField, JFrame frame) {
        String name = nameField.getText();
        String city = cityField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        String query = "INSERT INTO users (name, city, email, password) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setString(3, email);
            pstmt.setString(4, password);

            JOptionPane.showMessageDialog(frame, pstmt.executeUpdate() > 0
                    ? "User inserted successfully!" : "Insertion failed.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(frame, "Database error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InsertDataSwing().createGUI());
    }
}
