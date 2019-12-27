package strategy;

public class Test {

	public static void main(String[] args) {
		Payment card = new CreditCardPayment();
		Payment crypto = new CryptoCurrencyPayment();
		
		PaymentManager manager = new PaymentManager(card);
		
		manager.pay(100);
		
		manager.setPayment(crypto);
		manager.pay(200);
		

	}

}
