import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class logindb extends JFrame {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost/java";
    private static final String JDBC_USER = "root"; // replace with your DB username
    private static final String JDBC_PASSWORD = ""; // replace with your DB password
    
    // UI Components
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel statusLabel;

    public logindb() {
        // Set up the frame
        setTitle("Login Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create UI components
        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        // Add action listener to the button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                String password = new String(passwordField.getPassword());
                if (validateLogin(username, password)) {
                    statusLabel.setText("Login Successful!");
                } else {
                    statusLabel.setText("Invalid username or password.");
                }
            }
        });
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("User Name:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userTextField = new JTextField(20);
        userTextField.setBounds(100, 20, 165, 25);
        panel.add(userTextField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(40, 80, 80, 25);
        panel.add(loginButton);

        statusLabel = new JLabel("");
        statusLabel.setBounds(10, 110, 250, 25);
        panel.add(statusLabel);
    }

    private boolean validateLogin(String username, String password) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            // Connect to database
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            
            // SQL query to check if username and password match
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            
            resultSet = statement.executeQuery();
            
            // Return true if there is a result
            return resultSet.next();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Run the GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new logindb().setVisible(true);
            }
        });
    }
}
