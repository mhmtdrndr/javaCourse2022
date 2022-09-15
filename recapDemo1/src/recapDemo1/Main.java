package recapDemo1;

public class Main {

	public static void main(String[] args) {
		
		int sayi1 = 200;
		int sayi2 = 30;
		int sayi3 = 40;
		
		int enBuyukSayi = sayi1;
		
		if(enBuyukSayi < sayi2) {
			enBuyukSayi = sayi2;
		}
		
		if(enBuyukSayi < sayi3) {
			enBuyukSayi = sayi3;
		}
		
		System.out.println("En büyük sayı =  " + enBuyukSayi);

	}

}
