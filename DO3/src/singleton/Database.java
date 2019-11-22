package singleton;

public class Database {
	//eager loading
	private static Database instance = new Database();
	
	private Database() {
		
	}
	
	public static Database getInstance() {
		return instance;
	}
	
	//lazy loading
	private static Database instanceLazy;
	
	public static Database getInstanceLazy() {
		if (instanceLazy == null) {
			synchronized(Database.class) {
				if(instanceLazy == null){
					instanceLazy = new Database();
				}
			}
		}
		return instanceLazy;
	}

}
