package interfaces2;

public class MySqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("MySQL veri tabanına eklendi.");        
    }
    
}
