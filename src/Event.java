import java.util.ArrayList;


public class Event {
	public ArrayList<Person> attendees;

	public Event(ArrayList<Person> attendees) {
		this.attendees = attendees;
	}
	
	public void displayAttendees() {
		for (Person attendee: attendees) {
			System.out.println(attendee);
		}
	}
}


	

