package uygulama3;

import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[100];
		
		for(int i=0; i<100; i++) {
			Random random = new Random();
			int sayi = random.nextInt(10000);
			sayilar[i] = sayi;
		}
		double ort = ortalama(sayilar);
		System.out.println("Ortalama : " + ort);
		
				
	}
	public static double ortalama(int[] dizi) {
		double toplam = 0;
		for(int i=0;i<100;i++) {
			toplam+=dizi[i];
		}
		return toplam/100;
	}

}
