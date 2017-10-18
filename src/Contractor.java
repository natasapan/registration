
public class Contractor extends Person {
	
	private String company;
	private long dateOfBirth;
	private String contact;
	
	public Contractor(String firstname, String lastname, String mobNum, String email,
			String company, long dateOfBirth,String contact) {
		super(firstname, lastname, mobNum, email);
		
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
