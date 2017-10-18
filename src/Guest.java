
public class Guest extends Person {
	private String company;
	private String contact;

	public Guest(String firstname, String lastname, String mobNum, String email,
			String company, String contact) {
		super(firstname, lastname, mobNum, email);
		
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
