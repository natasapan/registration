import java.util.ArrayList;

public interface IStorage {
	public void addAttendees(Person attendee);
	public void addEvent(Event event);
	public void close();
}
