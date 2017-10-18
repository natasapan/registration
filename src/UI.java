import java.util.ArrayList;
import java.util.Scanner;


public class UI {

	private String answer;
	ArrayList<Person> attendies = new ArrayList<Person>();
	Scanner input = new Scanner(System.in);

	public UI() {
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void personDetails() {

		System.out
				.print("Which type of atendee do you wish to enter? employee,"
						+ " contractor or guest?");
		answer = input.nextLine();

		if (answer.equals("employee")) {

			System.out.print("Enter first name: ");
			String fname = input.nextLine();
			System.out.print("Enter last name: ");
			String lname = input.nextLine();
			System.out.print("Enter mobile number: ");
			String mnum = input.nextLine();
			System.out.print("Enter e-mail: ");
			String e_mail = input.nextLine();
			System.out.print("Enter salary: ");
			double salary = input.nextDouble();
			System.out.print("Enter the date of birth: ");
			long dob = input.nextLong();
			System.out.print("Enter job title: ");
			String jobt = input.nextLine();
			Employee e = new Employee(fname, lname, mnum, e_mail, salary, dob,
					jobt);
			attendies.add(e);

		} else if (answer.equals("contractor")) {

			System.out.print("Enter first name: ");
			String fname = input.nextLine();
			System.out.print("Enter last name: ");
			String lname = input.nextLine();
			System.out.print("Enter mobile number: ");
			String mnum = input.nextLine();
			System.out.print("Enter e-mail: ");
			String e_mail = input.nextLine();
			System.out.print("Enter the date of birth: ");
			long dob = input.nextLong();
			System.out.print("Enter Company: ");
			String comp = input.nextLine();
			System.out.print("Enter Contact: ");
			String cont = input.nextLine();
			Contractor e1 = new Contractor(fname, lname, mnum, e_mail, cont, dob, comp);
			attendies.add(e1);

		} else if (answer.equals("guest")) {

			System.out.print("Enter first name: ");
			String fname = input.nextLine();
			System.out.print("Enter last name: ");
			String lname = input.nextLine();
			System.out.print("Enter mobile number: ");
			String mnum = input.nextLine();
			System.out.print("Enter e-mail: ");
			String e_mail = input.nextLine();
			System.out.print("Enter company: ");
			String comp = input.nextLine();
			System.out.print("Enter contact: ");
			String cont = input.nextLine();
			
			Guest e2 = new Guest(fname, lname, mnum, e_mail, comp, cont);
			attendies.add(e2);

		}
	}

}
