import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class AllEvents {
	private ArrayList<Event> events = new ArrayList<Event>();

	public void addToEvents(Event event) {
		events.add(event);
	}

	public void findEvent(String dateInput) {
		final DateFormat format = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
		Date date = null;
		try {
			date = format.parse(dateInput);
		} catch (Exception e) {
			System.out.print("Couldn't parse the Date. Please try again");
		}

		if (date != null) {
			for (Event event : this.events) {
				if (event.getDate().equals(date)) {
					System.out.println(event);
				}
			}
		}
	}
}
	      

		
	