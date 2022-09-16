package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		/*
		
			System.out.println("Eleman sayısı : " + mesaj.length()); //mesaj textinin uzunluğu
			System.out.println("5. eleman : " + mesaj.charAt(4)); //belirtilen indexteki elemanı bulma
			System.out.println(mesaj.concat(" Yaşasın")); // textin sonuna yeni string eklendi
			
			System.out.println(mesaj.startsWith("A")); //false
			System.out.println(mesaj.startsWith("b")); //false
			System.out.println(mesaj.startsWith("B")); //true
			System.out.println(mesaj.endsWith("l")); //false
			System.out.println(mesaj.endsWith(".")); //true
			
			char[] karakterler = new char[5];
			mesaj.getChars(0, 5, karakterler, 0); //belirtilen index kadar karakterleri diziye aktarır
			System.out.println(karakterler);
			
			System.out.println(mesaj.indexOf("av")); //belirtilen karakterin yada stringin mesaj içerisinde kaçıncı indexte olduğunu bulur (soldan)
			System.out.println(mesaj.lastIndexOf("a")); //belirtilen karakterin yada stringin mesaj içerisinde kaçıncı indexte olduğunu bulur (soldan)
		
		*/
		
		System.out.println(mesaj.replace(" ", "-")); //boşluk karakterlerini - ile değiştirdik
		
		System.out.println(mesaj.substring(2)); //ikinci karakterden sonra geri kalan değerleri aldık
		System.out.println(mesaj.substring(2,10)); //ikinci karakterden başlayarak onuncu karaktere kadar karakterleri aldık
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);  // split ile mesajı boşluk karakterine göre parçaladık
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		String yeniMesaj = "       Bugün hava çok güzel       ";
		System.out.println(yeniMesaj.trim());
		
	}

}
