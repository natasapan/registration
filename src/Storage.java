import java.util.ArrayList;

/**
 * Created by info on 21/10/2017.
 */
public class Storage  {
	private ArrayList<IStorage> storageItems;

	Storage(ArrayList<IStorage> storageItems) {
		this.storageItems = storageItems;
	}

	void addAttendee(Person attendee) {
		if (attendee != null) {
			for (IStorage storageItem : this.storageItems) {
				storageItem.addAttendees(attendee);
			}
		}
	}

	void addEvent(Event event) {
		if (event != null) {
			for (IStorage storageItem : this.storageItems) {
				storageItem.addEvent(event);
			}
		}
	}

	void close() {
		for(IStorage storageItem: this.storageItems) {
			storageItem.close();
		}
	}
}
