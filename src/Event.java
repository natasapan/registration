import java.util.ArrayList;
import java.util.Date;


public class Event {
	private ArrayList<Person> attendees;
	private Date date;

	public Event(ArrayList<Person> attendees, Date date) {
		this.attendees = attendees;
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void displayAttendees() {
		for (Person attendee: attendees) {
			System.out.println(attendee);
		}
	}
}


	

