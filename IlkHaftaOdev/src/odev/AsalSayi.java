package odev;

public class AsalSayi {

	public static void main(String[] args) {
		int sayi = 10;
		boolean asalMi = true;
		if (sayi == 1) {
			System.out.println("Sayı asal değildir.");
			return;
		}
		if (sayi == 0) {
			System.out.println("Geçersiz sayı");
			return;
		}
		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				asalMi = false;
			}
		}
		if (asalMi == false) {
			System.out.println("Sayı asal değildir.");
		} else {
			System.out.println("Sayı asaldır.");
		}

	}

}
