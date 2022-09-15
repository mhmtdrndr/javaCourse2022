/**
 * 
 */
package switchDemo;

/**
 * @author mehmet.derindere
 *
 */
public class Main {


	public static void main(String[] args) {
		
		char notHarf ='D';
		
		switch (notHarf) {
		case 'A':
			System.out.println("Geçtiniz... Derece Mükemmel");
			break;
		case 'B':
			System.out.println("Geçtiniz... Derece Çok İyi");
			break;
		case 'C':
			System.out.println("Geçtiniz... Derece İyi");
			break;
		case 'D':
			System.out.println("Geçtiniz... Derece Fena değil");
			break;
		case 'F':
			System.out.println("KALDINIZ... Derece Kötü");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz");
			break;
		}

	}

}
