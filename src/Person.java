
public class Person {
	private String firstname;
	private String lastname;
	private String mobNum;
	private String email;
	private IMessage msg = null;
	
	public Person (String firstname, String lastname, String mobNum, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobNum = mobNum;
		this.email = email;
	 }
	public Person(IMessage msg){
		this.msg = msg;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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
		return "Person [firstname=" + firstname + ", lastname=" + lastname
				+ ", mobNum=" + mobNum + "]";
	}

	public void sendMessage(String msgFrom, String msgTo, String message){
		
		System.out.println(message);
		
	}
	
		
		
	}
	


