import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;


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

	public void addAttendees(Person attendee) {
		try {
			this.stnt = connection.createStatement();
			//TODO Implement add Attendee to DB
			String insertPerson = "INSERT INTO Person(firstName, lastName, mobNum, email, "
					+ "salary, dateOfBirth, jobTitle, contact"
					+ "VALUES(ez.firstName, e.lastName, e.mobNum, e.email, e.salary,"
					+ " e.dateOfBirth, e.jobTitle, e.contact);";
			stnt.executeUpdate(insertPerson);

		} catch (Exception e) {
			System.out.println("Error" + e.getMessage());
		}
	}

	public void addEvent(Event event) {
		//TODO Implement add event to database
	}

	public void close() {
		try {
			this.connection.close();
		} catch (Exception e) {
			System.out.print("Unable to close connection: " + e.getMessage());
		}

	}
}

		


		



