package abstractsDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager manager = new CustomerManager();
		manager.databaseManager = new SqlDatabaseManager();
		manager.getCustomers();
	}

}
