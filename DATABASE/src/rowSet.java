import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class rowSet {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost/java";
    private static final String JDBC_USER = "root"; // replace with your DB username
    private static final String JDBC_PASSWORD = ""; // replace with your DB password

    public static void main(String[] args) {
        // Using try-with-resources to ensure resources are closed
        try (CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet()) {
            // Set JDBC properties
            rowSet.setUrl(JDBC_URL);
            rowSet.setUsername(JDBC_USER);
            rowSet.setPassword(JDBC_PASSWORD);

            // Set SQL command to execute
            rowSet.setCommand("SELECT * FROM students");

            // Execute the command
            rowSet.execute();

            // Process the RowSet
            System.out.println("ID\tName\t\tLevel\tAddress");
            System.out.println("------------------------------------------------");

            while (rowSet.next()) {
                int id = rowSet.getInt("id");
                String name = rowSet.getString("name");
                String level = rowSet.getString("level");
                String address = rowSet.getString("address");
                System.out.println(id + "\t" + name + "\t" + level + "\t" + address);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
