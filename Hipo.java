package HipotenüsPro;
import java.util.Scanner;

public class Hipo {

	public static void main(String[] args) {
		double x,y,z;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Birinci dik kenarı giriniz:");
		x=scan.nextDouble();
		System.out.print("İkinci dik kenarı giriniz:");
		y=scan.nextDouble();
		
		z=Math.sqrt(x*x+y*y);
		
		System.out.printf("\nHipotenüs:%.2f",z);



	}

}
