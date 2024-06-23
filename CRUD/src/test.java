import java.sql.*;
public class test {
	static final String DB_URL = "jdbc:mysql://localhost/java"; //DataBase Location
	static final String USER = "root";
	static final String PASS = "";
	static final String QUERY = "SELECT * FROM students"; //DataBase Name
	
	public static void main(String[] args) {
	try {
		Connection conn = DriverManager.getConnection(DB_URL ,USER, PASS);
		Statement stmt = conn.createStatement();
		
		Read(stmt);
		Update(stmt);
//		Insert(stmt);
//		Delete(stmt);
		
	} catch (SQLException e) {
		System.out.println(e);
	}
	}
//	Read Data
	public static void Read(Statement stmt) {
		try {
			ResultSet rs = stmt.executeQuery(QUERY);
			
			while(rs.next()) {
				System.out.print(" ID: " + rs.getInt("id"));
				System.out.print(" Name: " + rs.getString("name"));
				System.out.print(" Level: " + rs.getString("level"));
				System.out.print(" Address: " + rs.getString("address"));
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
//Update Data
public static void Update(Statement stmt) {
	String sql = "Update students set name = 'Sunaina' where id = 6";
	try {
		stmt.executeUpdate(sql);
	} catch(SQLException e) {
		System.out.println(e);	
	}
}

//	Insert Data
//public static void Insert(Statement stmt) {
//	String sql = "INSERT INTO students VALUES (null, 'Suhana', 'BBS', 'Kisipide')";
//	try {
//		stmt.executeUpdate(sql);
//	} catch(SQLException e) {
//		System.out.println(e);	
//	}
//}

//Delete Data	
//public static void Delete(Statement stmt) {
//	String sql = "DELETE FROM students where id = 3";
//	try {
//		stmt.executeUpdate(sql);
//	} catch(SQLException e) {
//		System.out.println(e);	
//	}
//}
}