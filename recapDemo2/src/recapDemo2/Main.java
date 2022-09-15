package recapDemo2;

public class Main {

	public static void main(String[] args) {

		double[] myList = { 1.1, 5.7, 9.3, 8.5, 6.9 };
		
		double total = 0;
		double max = myList[0]; 
		
		for (double number : myList) {
			System.out.println(number);
			if(number > max) {
				max = number;
			}
			total += number;
		}
		System.out.println("Toplam : " + total);
		System.out.println("En büyük : " + max);
	}

}
