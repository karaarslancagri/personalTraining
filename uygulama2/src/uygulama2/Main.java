package uygulama2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
    int sayi1,sayi2,islemler;
    Scanner scanner = new Scanner(System.in); 
	    
        System.out.println("..................");
        System.out.println("1 - Toplama ");
        System.out.println("2 - Cikarma ");
        System.out.println("3 - Carpma ");
        System.out.println("4 - Bolme ");
        System.out.println("..................");
        
        System.out.println("Birinci Sayiyi Giriniz.");
        sayi1 = scanner.nextInt();
        
        System.out.println("ikinci Sayiyi Giriniz.");
        sayi2 = scanner.nextInt();
        
        System.out.println("Islem Seciniz.");
        islemler = scanner.nextInt();
        
        if(islemler==1) {
        	System.out.println("Toplama Isleminin Sonucu = " + (sayi1+sayi2));
        }else if(islemler==2) {
        	System.out.println("Cikarma Isleminin Sonucu = " + (sayi1-sayi2));
        }else if(islemler==3) {
        	System.out.println("Carpma Isleminin Sonucu = " + (sayi1*sayi2));
        }else if(islemler==4) {
        	System.out.println("Bolme Isleminin Sonucu = " + (sayi1/sayi2));
        }else {
        	System.out.println("Gecersiz Islem!");
        }
        
        		
        
        
    
		
	}

}
