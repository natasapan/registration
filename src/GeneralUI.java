import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class GeneralUI {

	GeneralUI() {}

	void init() {
		AttendeesUI AttendeesUI = new AttendeesUI();
		ArrayList<Person> attendees = AttendeesUI.getAttendees();
		Date date = new Date();
		Event event = new Event(attendees, date);
		AllEvents allEvents = new AllEvents();
		DB db = new DB();
		showMainMenu(AttendeesUI, event, allEvents, db);
	}

	private static void showMainMenu(AttendeesUI AttendeesUI, Event event, AllEvents allEvents, DB db) {
		Scanner input = new Scanner(System.in);
		String newLine = System.getProperty("line.separator");
		System.out.print("1 - Enter participants details" + newLine
				+ "2 - Print participants" + newLine
				+ "3 - Search events by date" + newLine
				+ "4 - Complete event" + newLine);
		String choice = input.nextLine();

		if (choice.equals("1")) {
			AttendeesUI.addAttendee();
		} else if (choice.equals("2")) {
			event.displayAttendees();
		} else if (choice.equals("3")) {
			System.out.print("Enter date:" + newLine);
			String dateInput = input.nextLine();
			allEvents.findEvent(dateInput);
		} else if (choice.equals("4")) {
			ArrayList<Person> attendees = AttendeesUI.getAttendees();

			AllEvents store = new AllEvents();
			store.addToEvents(event);
			//TODO: insert into db here
			db.closeConnection();

			SMSService sms = new SMSService();
			sms.smsToAttendees(attendees);

			EmailService email = new EmailService();
			email.emailToAttendees(attendees);
		}
		showMainMenu(AttendeesUI, event, allEvents, db);
	}
}