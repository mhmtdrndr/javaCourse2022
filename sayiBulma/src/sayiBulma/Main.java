package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {3,5,7,9,12,14,16,18,25,29,31,33,36};
		int aranacak = 33;
		boolean find = false;
		
		for(int number : numbers) {
			if (number == aranacak) {
				find = true;
				break;
			}
		}
		
		if(find) {
			System.out.println("Aranan sayı mevcuttur");
		} else {
			System.out.println("Aranan sayı mevcut değil");
		}

	}

}
