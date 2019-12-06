package observer3;

public class Test {

	public static void main(String[] args) {
		CryptoCurrencyPrice cryptoCurrencyPrice = new CryptoCurrencyPrice();
		CryptoCurrencyUpdateSMS currencyUpdateSMS = new CryptoCurrencyUpdateSMS();
		cryptoCurrencyPrice.addPropertyChangeListener(currencyUpdateSMS);
		
		cryptoCurrencyPrice.setBitcoinPrice(20000);

	}

}
