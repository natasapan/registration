import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DB implements IStorage {

	Connection c = null;
	Statement stnt = null;

	DB() {

		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:Registration.sqlite");
			System.out.println("Connected to the DB!");

		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
	}

	public void addPerson() {

		try {
			this.stnt = c.createStatement();

			String insertPerson = "INSERT INTO Person(firstname, lastname, mobNum, email, "
					+ "selary, dateOfBirth, jobTitle, contact"
					+ "VALUES(e.firstname, e.lastname, e.mobNum, e.email, e.selary,"
					+ " e.dateOfBirth, e.jobTitle, e.contact);";
			stnt.executeUpdate(insertPerson);

		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
	}

	public void closeConnection() {
		try {
			c.close();
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
	}
}

		


		



