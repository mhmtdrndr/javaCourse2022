package forLoopDemo;

public class Main {

	public static void main(String[] args) {
		
		String text = "Java World!";
		for (int i = 0 ; i < 5; i++) {
			System.out.println(text);
		}
		System.out.println("1. döngü bitti");
		
		for (int x = 0; x <= 10; x++) {
			System.out.println(x);
		}
		System.out.println("2. döngü bitti");
		
		for (int x = 0; x <= 10; x+=2) {
			System.out.println(x);
		}
		System.out.println("3. döngü bitti");

	}

}
