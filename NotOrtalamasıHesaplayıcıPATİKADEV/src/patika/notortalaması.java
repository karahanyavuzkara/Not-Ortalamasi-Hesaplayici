package patika;
import java.util.Scanner;
public class notortalaması {

	
	public static void main(String[]args) {

		//Değişkenler
int mat, business, ata111, programming, algorithms;


       //Scanner sınıfımızı tanımla
Scanner inp  = new Scanner(System.in);
 
      //Kullanıcıdan not al
 System.out.print("Matematik notunuzu giriniz: ");
mat = inp.nextInt();

 System.out.print("Business notunuzu giriniz: ");
business = inp.nextInt();

  System.out.print("ATA111 notunuzu giriniz: ");
 ata111 = inp.nextInt();
 
	System.out.print("Programming notunuzu giriniz: ");
programming = inp.nextInt();

    System.out.print("Algorithms notunuzu giriniz: ");
 algorithms = inp.nextInt();
	
   int toplam = (mat + business + ata111 + programming + algorithms);
   double ortalama = toplam/5 ;
   
   System.out.print("Not ortalamanız "+ ortalama);
	
	}
}