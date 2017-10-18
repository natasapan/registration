import java.util.ArrayList;


public class EmailService implements IMessage{
	public ArrayList<Person> attendies;
	private String message = "Thank you for participating. Best of luck!";

	
	public void sendMessage(String msgFrom, String msgTo, String message) {
		System.out.println(message);	
	}
	public void emailToAttendies() {

		for (Person attendie : attendies) {
			attendie.sendMessage("companyEmail", attendie.getEmail(), message);
		}
	}
}
