package observer2;

import java.util.Observable;

public class CryptoCurrencyPrice extends Observable{
	private double bitcoinPrice;
	private double etherPrice;
	
	public double getBitcoinPrice() {
		return bitcoinPrice;
	}
	
	public void setBitcoinPrice(double bitcoinPrice) {
		this.bitcoinPrice = bitcoinPrice;
		setChanged();
		notifyObservers();
	}
	
	public double getEtherPrice() {
		return etherPrice;
	}
	
	public void setEtherPrice(double etherPrice) {
		this.etherPrice = etherPrice;
		setChanged();
		notifyObservers();
	}
	
	
	

}
