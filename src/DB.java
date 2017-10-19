import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DB implements IStorage {
	private Connection connection = null;
	private Statement stnt = null;

	DB() {
		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:Registration.sqlite");
			System.out.println("Connected to the DB!");

		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
	}

	public void addPerson() {
		try {
			this.stnt = connection.createStatement();

			String insertPerson = "INSERT INTO Person(firstName, lastName, mobNum, email, "
					+ "salary, dateOfBirth, jobTitle, contact"
					+ "VALUES(e.firstName, e.lastName, e.mobNum, e.email, e.salary,"
					+ " e.dateOfBirth, e.jobTitle, e.contact);";
			stnt.executeUpdate(insertPerson);

		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
	}

	public void closeConnection() {
		try {
			connection.close();
		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
	}
}

		


		



