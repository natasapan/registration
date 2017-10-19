import java.util.ArrayList;
import java.util.Scanner;


public class UI {
	private ArrayList<Person> attendees = new ArrayList<Person>();
	private Scanner input = new Scanner(System.in);

	UI() {}

	public ArrayList<Person> getAttendees() {
		return attendees;
	}

	public void setAttendees(ArrayList<Person> attendees) {
		this.attendees = attendees;
	}

	public void addAttendee() {
		final String firstNameQuestion = "Enter first name: ";
		final String lastNameQuestion = "Enter last name: ";
		final String mobileNumberQuestion = "Enter mobile number: ";
		final String emailQuestion = "Enter e-mail: ";
		System.out.print("Which type of attendee do you wish to enter? employee, contractor or guest?");
		String answer = input.nextLine();

		System.out.print(firstNameQuestion);
		String fname = input.nextLine();
		System.out.print(lastNameQuestion);
		String lname = input.nextLine();
		System.out.print(mobileNumberQuestion);
		String mnum = input.nextLine();
		System.out.print(emailQuestion);
		String eMail = input.nextLine();

		if (answer.equals("employee")) {
			System.out.print("Enter salary: ");
			double salary = input.nextDouble();
			System.out.print("Enter the date of birth: ");
			long dob = input.nextLong();
			System.out.print("Enter job title: ");
			String jobt = input.nextLine();
			Employee employee = new Employee(fname, lname, mnum, eMail, salary, dob, jobt);
			attendees.add(employee);

		} else if (answer.equals("contractor")) {
			System.out.print("Enter the date of birth: ");
			long dob = input.nextLong();
			System.out.print("Enter Company: ");
			String comp = input.nextLine();
			System.out.print("Enter Contact: ");
			String cont = input.nextLine();
			Contractor contractor = new Contractor(fname, lname, mnum, eMail, cont, dob, comp);
			attendees.add(contractor);

		} else if (answer.equals("guest")) {
			System.out.print("Enter company: ");
			String comp = input.nextLine();
			System.out.print("Enter contact: ");
			String cont = input.nextLine();
			
			Guest guest = new Guest(fname, lname, mnum, eMail, comp, cont);
			attendees.add(guest);
		}

	}

}
