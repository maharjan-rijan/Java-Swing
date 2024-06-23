import java.sql.*;

public class product {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost/java";
    private static final String JDBC_USER = "root"; // replace with your DB username
    private static final String JDBC_PASSWORD = ""; // replace with your DB password

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Establish the database connection
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Create a statement
            statement = connection.createStatement();

            // SQL query to count the number of records in the products table
            String query = "SELECT COUNT(*) AS total FROM ecommerce";

            // Execute the query
            resultSet = statement.executeQuery(query);

            // Process the result set
            if (resultSet.next()) {
                int count = resultSet.getInt("total");
                System.out.println("Number of records in the products table: " + count);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
