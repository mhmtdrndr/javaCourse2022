package overriding;

public class TasitKredisi extends BaseKrediManager{
	public void krediHesapla(double tutar) {
		double hesaplananKredi = tutar * 1.12;
		System.out.println("Taşıt Kredisi hesaplandı : " + hesaplananKredi);
	}
}
