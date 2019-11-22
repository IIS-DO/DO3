package singleton;

public class Test {

	public static void main(String[] args) {
		Database instance = Database.getInstance();
		Database instance2 = Database.getInstance();
		
		System.out.println(instance);
		System.out.println(instance2);
		
		Database instanceLazy = Database.getInstanceLazy();
		Database instanceLazy2 = Database.getInstanceLazy();
		
		System.out.println(instanceLazy);
		System.out.println(instanceLazy2);

	}

}
