package strategy;

public class CryptoCurrencyPayment implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("CryptoCurrency payment of amount: " + amount);
		
	}

}
