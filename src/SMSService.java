import java.util.ArrayList;

public class SMSService implements IMessage {
	public ArrayList<Person> attendies;
	private String companyNum = "085-111-1111";
	private String message = "Thank you for participating. Best of luck!";

	public void sendMessage(String From, String To, String message) {
		System.out.println(message);
	}

	public void sMSToAttendies() {

		for (Person attendie : attendies) {
			attendie.sendMessage(companyNum, attendie.getMobNum(), message );
		}
	}
}
