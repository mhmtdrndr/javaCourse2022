package classes;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager1;
		CustomerManager customerManager2 = new CustomerManager();
		
		customerManager1 = customerManager2;
		customerManager1.add();
		customerManager1.delete();
		customerManager1.update();

	}

}
