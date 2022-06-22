import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("SEPARA NUM 5 CIFRAS");
		System.out.println("---------------------");
		
		System.out.println("Introduce el num: ");
		int num=teclado.nextInt();		
		System.out.println(num%10);
		System.out.println(num%100);
		System.out.println(num%1000);		
		System.out.println(num%10000);
		System.out.println(num);

	}

}
