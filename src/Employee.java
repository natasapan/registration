
public class Employee extends Person{
	
	private double salary;
	private long dateOfBirth;
	private String jobTitle;

	public Employee(String firstName, String lastName, String mobNum, String email,
			double salary, long dateOfBirth, String jobTitle) {
		super(firstName, lastName, mobNum, email);
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(long dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
