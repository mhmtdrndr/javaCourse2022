package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = 84;
		boolean isPrime = true;
		
		if (number <= 1) {
			System.out.println("Geçerli bir sayı girilmelidir.");
		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(number + " sayısı ASALDIR");
		} else {
			System.out.println(number + " sayısı ASAL DEĞİLDİR");
		}
	}

}
