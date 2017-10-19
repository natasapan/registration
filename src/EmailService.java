import java.util.ArrayList;


public class EmailService implements IMessage {
	public void sendMessage(String msgFrom, String msgTo, String message) {
		System.out.println(message);	
	}

	public void emailToAttendees(ArrayList<Person> attendees) {
		final String message = "Thank you for participating. Best of luck!";
		for (Person attendee : attendees) {
			this.sendMessage("companyEmail", attendee.getEmail(), message);
		}
	}
}
