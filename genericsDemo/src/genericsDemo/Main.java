package genericsDemo;

import genericsDemo.entity.Customer;
import genericsDemo.util.Validator;

public class Main {

	public static void main(String[] args) {
		
		Validator validator = new Validator();
		Customer customer = new Customer();
		validator.validate(customer);

	}

}
