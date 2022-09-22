package odev;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar =new int[] {1,2,3,4,5,6,7,8,9};
		int aranacak=1;
		boolean varMi=false;
		for(int sayi:sayilar)
		{
			if(sayi==aranacak)
			{
				varMi=true;
				break;
			}
		}
		if(varMi==true)
		{
		System.out.println("Sayı mevcuttur.");
		}
		else
		{
			System.out.println("Sayı mevcut değildir.");
		}
	}

}
