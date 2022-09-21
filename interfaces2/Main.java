package interfaces2;

public class Main {
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager(new MySqlCustomerDal());
        manager.add();
    }
    
}
