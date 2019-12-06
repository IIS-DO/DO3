package observer2;

import java.util.Observable;
import java.util.Observer;

public class CryptoCurrencyUpdateSMS implements Observer{
	private double bitcoinPrice;
	private double etherPrice;

	@Override
	public void update(Observable arg0, Object arg1) {
		CryptoCurrencyPrice cryptoCurrencyPrice = (CryptoCurrencyPrice)arg0;
		this.bitcoinPrice = cryptoCurrencyPrice.getBitcoinPrice();
		this.etherPrice = cryptoCurrencyPrice.getEtherPrice();
		sendSMS();
	}
	
	public void sendSMS() {
		System.out.println("Bitcoin price: " + bitcoinPrice);
		System.out.println("Ether price: " + etherPrice);
	}

}
