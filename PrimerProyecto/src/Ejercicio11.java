import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("SEPARA NUM 3 CIFRAS");
		System.out.println("---------------------");
		
		System.out.println("Introduce el num: ");
		int num=teclado.nextInt();
		
		int c1,c2,c3;
		
		c1=num/100;
		c2=num%100/10;
		c3=num%10;
		
		System.out.printf("Los números son %d, %d, %d",c1,c2,c3);

	}

}
