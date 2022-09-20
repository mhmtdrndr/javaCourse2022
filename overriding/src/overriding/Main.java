package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediler = new BaseKrediManager[] {
			new EvKredisi(),
			new TasitKredisi(),
			new CiftciKredisi()
		};
		
		for (BaseKrediManager kredi : krediler) {
			kredi.krediHesapla(10000);
		}
		
		BaseKrediManager manager = new BaseKrediManager();
		manager.krediHesapla(10000);
	}

}
