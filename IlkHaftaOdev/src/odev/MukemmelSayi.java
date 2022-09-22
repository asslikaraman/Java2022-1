package odev;

public class MukemmelSayi {

	public static void main(String[] args) {
		// 6=>1,2,3
		// 28=>1,2,4,7,14
		int sayi = 6;
		int toplam = 0;
		if (sayi == 1 || sayi == 0) {
			System.out.println("Geçersiz sayı.");
		}
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i;
			}
		}
		if (toplam == sayi) {
			System.out.println("Mükemmel sayıdır.");
		} else {
			System.out.println("Mükemmel sayı değildir.");
		}

	}

}
