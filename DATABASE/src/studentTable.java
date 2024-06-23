import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class studentTable extends JFrame {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost/java";
    private static final String JDBC_USER = "root"; // replace with your DB username
    private static final String JDBC_PASSWORD = ""; // replace with your DB password

    // UI Components
    private JTable table;
    private DefaultTableModel tableModel;

    public studentTable() {
        // Set up the frame
        setTitle("Student Details");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize the JTable
        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);

        // Add columns to the table model
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Level");
        tableModel.addColumn("Address");

        // Fetch and load student details into the table
        loadStudentDetails();

        // Add the table to a scroll pane and then to the frame
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void loadStudentDetails() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Connect to the database
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Create and execute a SQL statement to retrieve student details
            statement = connection.createStatement();
            String query = "SELECT * FROM students";
            resultSet = statement.executeQuery(query);

            // Process the result set and add rows to the table model
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String level = resultSet.getString("level");
                String address = resultSet.getString("address");
                tableModel.addRow(new Object[]{id, name, level, address});
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
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
                new studentTable().setVisible(true);
            }
        });
    }
}
