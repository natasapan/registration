
public class Employee extends Person{
	
	private double selary;
	private long dateOfBirth;
	private String jobTitle;

	public Employee(String firstname, String lastname, String mobNum, String email,
			double selary, long dateOfBirth, String jobTitle) {
		super(firstname, lastname, mobNum, email);
		
	}

	public double getSelary() {
		return selary;
	}

	public void setSelary(double selary) {
		this.selary = selary;
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
