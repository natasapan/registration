import java.util.Scanner;


public class UIGeneral {

	public UIGeneral() {}

	public void choice() {
		UI ui = new UI();
		Event event = new Event();
		AllEvents events = new AllEvents();
		DB db = new DB();

		Scanner input = new Scanner(System.in);
		String newLine = System.getProperty("line.separator");
		System.out.print("1 - Enter participants details" + newLine
				+ "2 - Print participants" + newLine
				+ "3 - Search events by date" + newLine
				+ "4 - Complete event");
		String choice = input.nextLine();

		if (choice.equals("1")) {
			ui.addAttendee();
		} else if (choice.equals("2")) {
			event.displayAttendees();
		} else if (choice.equals("3")) {
			events.displayEvents();
		} else if (choice.equals("4")) {

			db.closeConnection();

			AllEvents store = new AllEvents();
			store.addToEvents();

			SMSService sms = new SMSService();
			sms.smsToAttendees();

			EmailService email = new EmailService();
			email.emailToAttendees();
		}
	}
}