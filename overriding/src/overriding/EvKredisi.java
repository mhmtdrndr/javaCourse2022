package overriding;

public class EvKredisi extends BaseKrediManager {
	public void krediHesapla(double tutar) {
		double hesaplananKredi = tutar * 1.1;
		System.out.println("Ev Kredisi hesaplandı : " + hesaplananKredi);
	}
}
