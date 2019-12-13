package factoryMethod2;

public class Test {

	public static void main(String[] args) {
		ProcessBillFactory processBillFactory = new ProcessBillFactory();
		processBillFactory.storeBill("gas");

	}

}
