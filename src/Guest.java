
public class Guest extends Person {
	private String company;
	private String contact;

	public Guest(String firstName, String lastName, String mobNum, String email,
			String company, String contact) {
		super(firstName, lastName, mobNum, email);
		this.company = company;
		this.contact = contact;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
