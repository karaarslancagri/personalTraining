package sayiTahminEtme;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//pin olustur
		int istenenSayi =8556;
		
	
       
        	
    		
        System.out.println("4 Haneli Pini giriniz");       	
        
        
        for (int i = 0; i < 3; i++) {

			int input = scanner.nextInt();

			if (9999 < input || input < 1000) {
				System.out.println("---Gecersiz Sayi.--- ");
				
			}

			if (input == istenenSayi) {
				System.out.println("---Dogru---Cevabiniz : " + input);
				break;
			}

			  else if (i < 1) {
				System.out.println(" Yanlis.Lutfen Dogru Cevabi Giriniz! " + "Kalan hakkiniz=2 ");
			} else if (i < 2) {
				System.out.println(" Kalan hakkiniz=1 ");
			} else if (i < 3) {
				System.out.println(" Hakkiniz doldu !!! ");
			}
			

		}
		

	}
}
