import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class GeneralUI {

	GeneralUI() {}

	void init() {
		//TODO Implement getting Events/Attendees from DB, CSV
		AllEvents allEvents = new AllEvents();
		Storage storage = getStorage();
		AttendeesUI AttendeesUI = new AttendeesUI();
		ArrayList<Person> attendees = AttendeesUI.getAttendees();
		Date now = new Date();
		Event event = new Event(attendees, now);
		executeChoices(AttendeesUI, event, allEvents, storage);
	}

	private static Storage getStorage() {
		ArrayList<IStorage> storageItems = new ArrayList<>();
		DB db = new DB();
		CSV csv = new CSV();
		storageItems.add(db);
		storageItems.add(csv);
		return new Storage(storageItems);
	}

	private static void executeChoices(AttendeesUI attendeesUI, Event event, AllEvents allEvents, Storage storage) {
		final String choice = getChoice();

		if (choice.equals("1")) {
			Person attendee = attendeesUI.addAttendee();
			storage.addAttendee(attendee);
			executeChoices(attendeesUI, event, allEvents,storage);
		} else if (choice.equals("2")) {
			event.displayAttendees();
			executeChoices(attendeesUI, event, allEvents, storage);
		} else if (choice.equals("3")) {
			findEvents(allEvents);
			executeChoices(attendeesUI, event, allEvents, storage);
		} else if (choice.equals("4")) {
			completeEvent(attendeesUI, event, allEvents, storage);
		}
	}

	private static void findEvents(AllEvents allEvents) {
		final Scanner input = new Scanner(System.in);
		final String newLine = System.getProperty("line.separator");
		System.out.print("Enter date:" + newLine);
		String dateInput = input.nextLine();
		Event event = allEvents.findEvent(dateInput);
		if (event != null) {
			System.out.print(event);
		}
	}

	private static String getChoice() {
		final Scanner input = new Scanner(System.in);
		final String newLine = System.getProperty("line.separator");
		System.out.print("1 - Enter participants details" + newLine
				+ "2 - Print participants" + newLine
				+ "3 - Search events by date" + newLine
				+ "4 - Complete event" + newLine);
		return input.nextLine();
	}

	private static void completeEvent(AttendeesUI attendeesUI, Event event, AllEvents allEvents, Storage storage) {
		ArrayList<Person> attendees = attendeesUI.getAttendees();
		allEvents.addToEvents(event, storage);

		storage.close();

		SMSService sms = new SMSService();
		sms.smsToAttendees(attendees);

		EmailService email = new EmailService();
		email.emailToAttendees(attendees);
	}
}