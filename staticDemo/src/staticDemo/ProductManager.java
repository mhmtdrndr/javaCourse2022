package staticDemo;

public class ProductManager {
	public void add(Product product) {
		if(ProductValidator.isValid(product)) {
			System.out.println("Ürün eklendi : " + product.name);
		} else {
			System.out.println("Ürün bilgileri geçersiz ... ");
		}
	}
}
