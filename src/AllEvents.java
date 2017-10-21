import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class AllEvents {
	private ArrayList<Event> events = new ArrayList<Event>();

	public void addToEvents(Event event, Storage storage) {
		events.add(event);
		storage.addEvent(event);
	}

	public Event findEvent(String dateInput) {
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
					return event;
				}
			}
		}
		return null;
	}
}
	      

		
	