import java.util.Scanner;


public class UIGeneral {
	private String choice;
	Scanner input = new Scanner(System.in);

public UIGeneral(){
	
}
public void choice(){
	
	String newLine = System.getProperty("line.separator");
	System.out.print("1 - Enter participants details" + newLine + "2 - Print participants" + newLine
			+ "3 - Search events by date" + "4 - End of the event");
	    choice = input.nextLine();

	if (choice.equals("1")){
		UI det = new UI();
		det.personDetails();}
	
	else if (choice.equals("2")){
		Event event = new Event();
		event.displayAttendies();		
}
	else if (choice.equals("3")){
		AllEvents events = new AllEvents();
		events.displayEvents();
	}
	else if (choice.equals("4")){
		DB close = new DB();
		close.closeConnection();
		
		AllEvents store = new AllEvents();
		store.addToEvents();
		
		SMSService sms = new SMSService();
		sms.sMSToAttendies();
		
		EmailService email = new EmailService();
		email.emailToAttendies();
		
		
		
	}
}
}