import java.sql.Date;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;


public class AllEvents {
	Hashtable<Date,ArrayList<Person>> events = new Hashtable<Date,ArrayList<Person>>();
	private ArrayList<Person> attendees;
	
	public static void getDateString() {
		   Calendar calendar = Calendar.getInstance();
		    	int year = calendar.get(Calendar.YEAR);
		    	int month = calendar.get(Calendar.MONTH);
		    	int day = calendar.get(Calendar.DAY_OF_MONTH);
		    	System.out.println(year + "/" + (month + 1) +  "/" + day);
		   }

	public void addToEvents() {
		events.put(getDateString(), new ArrayList<Person>(attendees));
	}

	public void displayEvents() {
	    for (Entry<Date, ArrayList<Person>> entry: events.entrySet()) {
	        System.out.print(entry.getKey() + " | ");

	        for(Person att : entry.getValue()){
	            System.out.print(att + " ");
	        }
	        System.out.println();
	    }	
	}
}
	      

		
	