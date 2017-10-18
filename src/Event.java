import java.util.ArrayList;


public class Event {
	public ArrayList<Person> attendies;

	public Event(ArrayList<Person> attendies) {
		this.attendies = attendies;
	}
	
	public Event(){
		
	}
	
	public void displayAttendies() {
		for (Person attendie : attendies) {
			System.out.println(attendie);
		}
	}
}


	

