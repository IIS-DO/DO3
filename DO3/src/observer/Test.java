package observer;

public class Test {

	public static void main(String[] args) {
		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		CryptoCurrencyUpdateSMS cryptoCurrencyUpdateSMS = new CryptoCurrencyUpdateSMS();
		cryptoCurrencyPrice.addObserver(cryptoCurrencyUpdateSMS);
		
		cryptoCurrencyPrice.setBitcoinPrice(20000);

	}

}
