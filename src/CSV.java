import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CSV implements IStorage {
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static FileWriter fileWriter = null;


	public void addAttendees(Person attendee) {
		final String fileName = "registration.csv";

		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.append(NEW_LINE_SEPARATOR);

			fileWriter.append(attendee.getFirstName());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(attendee.getLastName());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(attendee.getMobNum());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(attendee.getEmail());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(NEW_LINE_SEPARATOR);

			if (attendee instanceof Contractor) {
				Contractor contractor = (Contractor) attendee;
				fileWriter.append(contractor.getCompany());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(contractor.getDateOfBirth());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(contractor.getContact());
				fileWriter.append(COMMA_DELIMITER);
			}

			if (attendee instanceof Guest) {
				Guest guest = (Guest) attendee;
				fileWriter.append(guest.getCompany());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(guest.getContact());
				fileWriter.append(COMMA_DELIMITER);
			}

			if (attendee instanceof Employee) {
				Employee employee = (Employee) attendee;
				fileWriter.append(String.valueOf(employee.getSalary()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(employee.getDateOfBirth()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(employee.getJobTitle());
				fileWriter.append(COMMA_DELIMITER);
			}
			fileWriter.append(NEW_LINE_SEPARATOR);

			System.out.println("CSV file was created successfully!");
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter!");
				e.printStackTrace();
			}
		}
	}

	public void addEvent(Event event) {
		final String fileName = "events.csv";

		try {
			fileWriter = new FileWriter(fileName);
			//TODO Implement write event to csv
			System.out.println("CSV file was created successfully!");
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter!");
				e.printStackTrace();
			}
		}
	}

	public void close() {
		try {
			fileWriter.close();
		} catch (Exception e) {
			System.out.println("Error closing CSV " + e.getMessage());
		}
	}
}
