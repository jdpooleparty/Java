package yourworkhere;

public class CheckingAccount {
	private String accountId;
	private String firstName;
	private String lastName;
	
	public CheckingAccount(String accountId, String firstName, String lastName) {
		super();
		this.accountId = accountId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public CheckingAccount() {
		this.accountId="89067";
		this.firstName="John";
		this.lastName="Doe";
	}
	
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
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

	void display() {
		System.out.println("Account ID:"+accountId+"\nFirst Name:"+firstName+"\nLast Name:"+lastName);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount ca1=new CheckingAccount();
		ca1.display();
		CheckingAccount ca2=new CheckingAccount("12345","Sundar","Pichai");
		ca2.display();
	}

}
