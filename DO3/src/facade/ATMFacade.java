package facade;

public class ATMFacade {
	private Funds funds;

	public ATMFacade(int accountNumber, int pinNumber) {
		funds = new Funds(accountNumber, pinNumber);
	}

	public void withdrawFunds(int amount) {
		funds.withdraw(amount);
	}

	public void depositFunds(int amount) {
		funds.deposit(amount);
	}

}