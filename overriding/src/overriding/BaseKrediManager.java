package overriding;

public class BaseKrediManager {
	public void krediHesapla(double tutar) {
		double hesaplananKredi = tutar*1.18;
		System.out.println("Kredi hesaplandı : " + hesaplananKredi);
	}
}
