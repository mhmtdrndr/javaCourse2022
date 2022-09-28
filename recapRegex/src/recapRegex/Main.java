package recapRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		String text = "bir berber bir BERbere gel beraber bir berber dükkanı açalışm demiş";
		
		Pattern pattern = Pattern.compile("ber", Pattern.CASE_INSENSITIVE);
		Pattern pattern2 = Pattern.compile("b.r");

		Matcher matcher = pattern.matcher(text);
		Matcher matcher2 = pattern2.matcher(text);
		
		int sayac =0;
		while (matcher.find()) {
			sayac += 1;			
		}
		
		System.out.println(sayac);
		
		int sayac2 =0;
		while (matcher2.find()) {
			sayac2 += 1;			
		}
		
		System.out.println(sayac2);

	}

}
