import java.util.ArrayList;

public class SMSService implements IMessage {
	private ArrayList<Person> attendees;

	private String message = "Thank you for participating. Best of luck!";

	public void sendMessage(String from, String to, String message) {
		System.out.println(message);
	}

	public void smsToAttendees() {
		String companyNum = "085-111-1111";
		for (Person attendee: attendees) {
			attendee.sendMessage(companyNum, attendee.getMobNum(), message);
		}
	}
}
