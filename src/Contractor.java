
public class Contractor extends Person {
	
	private String company;
	private long dateOfBirth;
	private String contact;
	
	Contractor(String firstName, String lastName, String mobNum, String email,
			String company, long dateOfBirth, String contact) {
		super(firstName, lastName, mobNum, email);
		this.company = company;
		this.dateOfBirth = dateOfBirth;
		this.contact = contact;
		
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public long getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(long dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
