import java.util.ArrayList;


public class EmailService implements IMessage {
	public ArrayList<Person> attendees;
	private String message = "Thank you for participating. Best of luck!";

	
	public void sendMessage(String msgFrom, String msgTo, String message) {
		System.out.println(message);	
	}

	public void emailToAttendees() {
		for (Person attendee : attendees) {
			attendee.sendMessage("companyEmail", attendee.getEmail(), message);
		}
	}
}
