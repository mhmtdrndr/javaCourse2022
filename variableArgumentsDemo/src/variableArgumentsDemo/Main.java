package variableArgumentsDemo;

public class Main {

	public static void main(String[] args) {
		int result = sum(3, 6, 9);
		System.out.println(result);
	}

	public static int sum(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

}
