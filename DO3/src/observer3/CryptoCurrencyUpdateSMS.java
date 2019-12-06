package observer3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CryptoCurrencyUpdateSMS implements PropertyChangeListener{
	private double bitcoinPrice;
	private double etherPrice;

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
		if (arg0.getPropertyName().equals("bitcoinPrice")) {
			this.bitcoinPrice = (double)arg0.getNewValue();
			sendSMS();
		}
		if (arg0.getPropertyName().equals("etherPrice")) {
			this.etherPrice = (double)arg0.getNewValue();
			sendSMS();
		}
		
		
	}
	
	public void sendSMS() {
		System.out.println("Bitcoin price: " + bitcoinPrice);
		System.out.println("Ether price: " + etherPrice);
	}

}
