package advanceJava;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateRecordSwing {
    public static void main(String[] args) {
        // Create JFrame
        JFrame f = new JFrame("Update Record");
        f.setSize(400, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label for old name
        JLabel oldNameLabel = new JLabel("Old Name:");
        oldNameLabel.setBounds(20, 20, 150, 30);
        f.add(oldNameLabel);

        // Text field for old name
        JTextField oldNameField = new JTextField();
        oldNameField.setBounds(120, 20, 200, 30);
        f.add(oldNameField);

        // Label for new name
        JLabel newNameLabel = new JLabel("New Name:");
        newNameLabel.setBounds(20, 70, 150, 30);
        f.add(newNameLabel);

        // Text field for new name
        JTextField newNameField = new JTextField();
        newNameField.setBounds(120, 70, 200, 30);
        f.add(newNameField);

        // Button
        JButton updateButton = new JButton("Update");
        updateButton.setBounds(120, 120, 150, 40);
        f.add(updateButton);

        // ActionListener for the button
        updateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String oldName = oldNameField.getText();
                String newName = newNameField.getText();

                if (!oldName.isEmpty() && !newName.isEmpty()) {
                    updateRecord(oldName, newName);
                } else {
                    JOptionPane.showMessageDialog(f, "Please enter both old and new names!");
                }
            }
        });

        f.setVisible(true);
    }

    // JDBC Update Method
    public static void updateRecord(String oldName, String newName) {
        String url = "jdbc:mysql://localhost:3306/college"; // Change database name
        String username = "root"; // MySQL Username
        String password = "root"; // MySQL Password
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            // Load Driver
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare UPDATE Query
            String sql = "UPDATE tb SET name = ? WHERE name = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, newName);
            pst.setString(2, oldName);

            // Execute Query
            int rowsAffected = pst.executeUpdate();

            // Show Message
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Record updated successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No record found with the given name.");
            }

            // Close Resources
            pst.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}

