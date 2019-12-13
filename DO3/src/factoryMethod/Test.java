package factoryMethod;

public class Test {

	public static void main(String[] args) {
		BillFactory billFactory = new BillFactory();
		Bill electricityBill = billFactory.createBill("electricity");
		electricityBill.calculateTotal();

	}

}
