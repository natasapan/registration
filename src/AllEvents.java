import java.security.KeyStore.Entry;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;


public class AllEvents {
	Hashtable<Date,ArrayList<Person>> events = new Hashtable<Date,ArrayList<Person>>();
	ArrayList<Person> attendies;
	private java.sql.Date Date;
	
	public static void Date() {
		   Calendar cal = Calendar.getInstance();
		    	int year = cal.get(Calendar.YEAR);
		    	int month = cal.get(Calendar.MONTH);      
		    	int day = cal.get(Calendar.DAY_OF_MONTH);
		    	System.out.println(year + "/" + (month+1) +  "/" + day);
		   }
	public void addToEvents(){
		events.put(Date, new ArrayList<Person>(attendies));
	}
	public void displayEvents(){
	    for (java.util.Map.Entry<java.sql.Date, ArrayList<Person>> entry : events.entrySet()) {
	        System.out.print(entry.getKey()+" | ");
	        for(Person att : entry.getValue()){
	            System.out.print(att+" ");
	        }
	        System.out.println();
	    }	
	}
}
	      

		
	