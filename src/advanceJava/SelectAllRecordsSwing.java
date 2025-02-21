package advanceJava;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class SelectAllRecordsSwing {
    public static void main(String[] args) {
        // Create JFrame
        JFrame f = new JFrame("Select All Records");
        f.setSize(500, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Button to fetch data
        JButton fetchButton = new JButton("Fetch All Records");
        fetchButton.setBounds(150, 20, 200, 40);
        f.add(fetchButton);

        // Text Area to display records
        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(20, 80, 440, 250);
        resultArea.setEditable(false);

        // Scroll Pane
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setBounds(20, 80, 440, 250);
        f.add(scrollPane);

        // Button Action Listener
        fetchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String result = selectAllRecords();
                resultArea.setText(result);
            }
        });

        f.setVisible(true);
    }

    // JDBC Select All Method
    public static String selectAllRecords() {
        String url = "jdbc:mysql://localhost:3306/college"; // Change database name
        String username = "root"; // MySQL Username
        String password = "root"; // MySQL Password
        String driver = "com.mysql.cj.jdbc.Driver";
        StringBuilder result = new StringBuilder("ID\tName\n----------------------\n");

        try {
            // Load Driver
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);

            // Prepare SELECT Query
            String sql = "SELECT * FROM tb";
            PreparedStatement pst = con.prepareStatement(sql);

            // Execute Query
            ResultSet rs = pst.executeQuery();

            // Fetch and Append Data
            while (rs.next()) {
                result.append((rs.getString("name")));
            }

            // Close Resources
            rs.close();
            pst.close();
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }

        return result.toString();
    }
}

