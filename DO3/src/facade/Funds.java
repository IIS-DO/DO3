package facade;

public class Funds {
	private double funds = 100;

	private Account account;
	private Pin pin;

	public Funds(int accountNumber, int pinNumber) {
		account = new Account(accountNumber);
		pin = new Pin(pinNumber);
	}

	public boolean hasFunds(int amount) {
		return (funds >= amount) ? true : false;
	}

	public void withdraw(int amount) {
		if (hasFunds(amount) && account.isActive() && pin.isValid())
			funds -= amount;
		System.out.println("Current funds after withdrawal: " + funds);
	}

	public void deposit(int amount) {
		if (account.isActive() && pin.isValid()) {
			funds += amount;
			System.out.println("Current funds after deposit: " + funds);
		}
	}

}
