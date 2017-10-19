import java.util.ArrayList;

public class SMSService implements IMessage {

	public void sendMessage(String from, String to, String message) {
		System.out.println(message);
	}

	public  void smsToAttendees(ArrayList<Person> attendees) {
		final String message = "Thank you for participating. Best of luck!";
		final String companyNum = "085-111-1111";
		for (Person attendee: attendees) {
			this.sendMessage(companyNum, attendee.getMobNum(), message);
		}
	}
}
