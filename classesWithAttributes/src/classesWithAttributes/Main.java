package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.id = 1;
		product.name = "Monitör";
		product.description = "Samsung 27\" Mönitör";
		product.price = 6000;
		product.stockAmount = 20;
		
		ProductManager manager = new ProductManager();
		manager.add(product);

	}

}
