public class Person {
	private String firstName;
	private String lastName;
	private String mobNum;
	private String email;
	private IMessage msg = null;

	public Person(String firstName, String lastName, String mobNum, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobNum = mobNum;
		this.email = email;
	}

	public Person(IMessage msg) {
		this.msg = msg;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobNum() {
		return mobNum;
	}

	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public IMessage getMsg() {
		return msg;
	}

	public void setMsg(IMessage msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", mobNum=" + mobNum + "]";
	}

	public void sendMessage(String msgFrom, String msgTo, String message) {
		System.out.println(message);
	}
}
	


