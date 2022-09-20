package overriding;

public class CiftciKredisi extends BaseKrediManager{
	public void krediHesapla(double tutar) {
		double hesaplananKredi = tutar * 1.05;
		System.out.println("Çiftçi Kredisi hesaplandı : " + hesaplananKredi);
	}
}
