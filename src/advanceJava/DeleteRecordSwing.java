package advanceJava;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class DeleteRecordSwing {
    public static void main(String[] args) {
        // Create JFrame
        JFrame f = new JFrame("Delete Record");
        f.setSize(400, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label
        JLabel label = new JLabel("Enter Name to Delete:");
        label.setBounds(20, 20, 150, 30);
        f.add(label);

        // Text Field
        JTextField textField = new JTextField();
        textField.setBounds(170, 20, 180, 30);
        f.add(textField);

        // Button
        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(120, 70, 150, 40);
        f.add(deleteButton);

        // ActionListener for the button
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                if (!name.isEmpty()) {
                    deleteRecord(name);
                } else {
                    JOptionPane.showMessageDialog(f, "Please enter a name!");
                }
            }
        });

        f.setVisible(true);
    }

    // JDBC Delete Method
    public static void deleteRecord(String name) {
        String url = "jdbc:mysql://localhost:3306/college"; // Change database name
        String username = "root"; // MySQL Username
        String password = "root"; // MySQL Password
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            // Load Driver
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare DELETE Query
            String sql = "DELETE FROM tb WHERE name = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, name);

            // Execute Query
            int rowsAffected = pst.executeUpdate();

            // Show Message
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Record deleted successfully!");
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
