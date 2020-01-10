package facade;

public class TestFacade {
	public static void main(String[] args) {
		ATMFacade atm = new ATMFacade(12345, 1111);

		atm.depositFunds(100);
		atm.withdrawFunds(50);
	}

}
