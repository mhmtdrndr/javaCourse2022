package recapRegex2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {	
		
		
		System.out.println("E-Mail adresinizi giriniz : ");
		Scanner s = new Scanner(System.in);
		String email = s.nextLine().trim();
		
		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.matches()) {
			System.out.println("Email formatı doğru. E mail :" + email);
		} else {
			System.out.println("Email formatı hatalı");
		}
		
		
		s.close();

	}
	
	

}
