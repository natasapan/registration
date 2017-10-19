import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CSV implements IStorage {
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static FileWriter fileWriter = null;
	private static ArrayList<Person> attendees;

	public void addPerson() {
		final String fileName = "registration.csv";

		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.append(NEW_LINE_SEPARATOR);
			for (Person attendee : attendees) {
				fileWriter.append(attendee.getFirstName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attendee.getLastName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attendee.getMobNum());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attendee.getEmail());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(NEW_LINE_SEPARATOR);
				fileWriter.append(attendee.getCompany());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attendee.getLastName());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attendee.getGender());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(attendee.getAge()));
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			System.out.println("CSV file was created successfully !!!");
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out
						.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}
		}
	}
}
