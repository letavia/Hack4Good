import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao{
	private Connection con;

	public Dao(Connection con) {
		this.con=con;
	}

	public Connection connectDB () throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hack4good","root","");
		return con;
	}
}