package staticDemo;

public class Main {

	public static void main(String[] args) {
		Product urun1 = new Product();
		urun1.id = 1;
		urun1.name = "Mouse";
		urun1.price = 10;

		ProductManager manager = new ProductManager();
		manager.add(urun1);
	}

}
