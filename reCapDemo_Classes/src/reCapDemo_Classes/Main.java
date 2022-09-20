package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem islem = new DortIslem();
		
		int resultTopla = islem.topla(2,5,8);
		System.out.println(resultTopla);
		
		int resultCarpim = islem.carp(2,3);
		System.out.println(resultCarpim);
		
		double resultBolum = islem.bol(10, 2);
		System.out.println(resultBolum);
		
	}

}
