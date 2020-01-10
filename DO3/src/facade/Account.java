package facade;

public class Account {
	private int accountNumber;

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public boolean isActive() {
		return (accountNumber == 12345) ? true : false;
	}

}
