package observer3;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CryptoCurrencyPrice {
	private double bitcoinPrice;
	private double etherPrice;
	
	private PropertyChangeSupport propertyChangeSupport;
	
	public CryptoCurrencyPrice() {
		propertyChangeSupport = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		propertyChangeSupport.addPropertyChangeListener(pcl);
	}
	
	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		propertyChangeSupport.removePropertyChangeListener(pcl);
	}
	
	
	public void setBitcoinPrice(double bitcoinPrice) {
		propertyChangeSupport.firePropertyChange("bitcoinPrice", this.bitcoinPrice, bitcoinPrice);
		this.bitcoinPrice = bitcoinPrice;
	}
	public void setEtherPrice(double etherPrice) {
		propertyChangeSupport.firePropertyChange("etherPrice", this.etherPrice, etherPrice);
		this.etherPrice = etherPrice;
	}
	
	

}
