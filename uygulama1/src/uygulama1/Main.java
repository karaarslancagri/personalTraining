package uygulama1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   String password = "4545";
	   System.out.println("Lutfen Sifreyi Giriniz.");
	   Scanner scanner = new Scanner(System.in);
	   String userpassword = scanner.nextLine();
	   
	   if(userpassword.equals(scanner)) {
		   System.out.println("Giris Basarili.");
	   }else {
		   System.out.println("Giris Basarisiz.");
	   }
	   

	}

}
