import java.util.ArrayList;
import java.util.Scanner;


public class AttendeesUI {
	private ArrayList<Person> attendees = new ArrayList<Person>();
	private Scanner input = new Scanner(System.in);

	AttendeesUI() {}

	public ArrayList<Person> getAttendees() {
		return attendees;
	}

	public void setAttendees(ArrayList<Person> attendees) {
		this.attendees = attendees;
	}

	public Person addAttendee() {
		final String firstNameQuestion = "Enter first name: ";
		final String lastNameQuestion = "Enter last name: ";
		final String mobileNumberQuestion = "Enter mobile number: ";
		final String emailQuestion = "Enter e-mail: ";
		System.out.print("Which type of attendee do you wish to enter? employee, contractor or guest?");
		String answer = input.nextLine();

		if (this.isValidAnswer(answer)) {
			System.out.print(firstNameQuestion);
			String firstName = input.nextLine();
			System.out.print(lastNameQuestion);
			String lastName = input.nextLine();
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
				String jobTitle = input.nextLine();
				Employee employee = new Employee(firstName, lastName, mnum, eMail, salary, dob, jobTitle);
				attendees.add(employee);
				return employee;

			} else if (answer.equals("contractor")) {
				System.out.print("Enter the date of birth: ");
				String dob = input.nextLine();
				System.out.print("Enter Company: ");
				String company = input.nextLine();
				System.out.print("Enter Contact: ");
				String contact = input.nextLine();
				Contractor contractor = new Contractor(firstName, lastName, mnum, eMail, contact, dob, company);
				attendees.add(contractor);
				return contractor;

			} else if (answer.equals("guest")) {
				System.out.print("Enter company: ");
				String company = input.nextLine();
				System.out.print("Enter contact: ");
				String contact = input.nextLine();

				Guest guest = new Guest(firstName, lastName, mnum, eMail, company, contact);
				attendees.add(guest);
				return guest;
			}
		} else {
			System.out.println("Invalid choice, please try again");
			this.addAttendee();
		}
		return null;
	}

	private boolean isValidAnswer(String answer) {
		return answer.equals("employee") || answer.equals("contractor") || answer.equals("guest")	;
	}
}
