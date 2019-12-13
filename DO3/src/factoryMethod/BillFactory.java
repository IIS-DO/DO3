package factoryMethod;

public class BillFactory {
	
	public Bill createBill(String type) {
		if(type.equals("electricity")) {
			return new ElectricityBill();
		} else if (type.equals("gas")) {
			return new GasBill();
		} else {
			return null;
		}
	}

}
