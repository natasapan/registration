import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CSV implements IStorage {

	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	static FileWriter fileWriter = null;
	private static ArrayList<Person> attendies;
	private static String fileName = "registration.csv";
	

	public void addPerson() {

		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.append(NEW_LINE_SEPARATOR);
			for (Person attendie : attendies) {
				fileWriter.append(attendie.getFirstname());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attendie.getLastname());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attendie.getMobNum());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attendie.getEmail());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(NEW_LINE_SEPARATOR);
				fileWriter.append(attendie.getCompany());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attendie.getLastname());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(attendie.getGender());
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(attendie.getAge()));
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
