import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("NUMERO MAGICO");
		System.out.println("---------------------");
		
		System.out.println("Introduce el dia: ");
		int dia=teclado.nextInt();
		
		System.out.println("Introduce el mes: ");
		int mes=teclado.nextInt();
		
		System.out.println("Introduce el año: ");
		int ano=teclado.nextInt();
		
		int suma=dia+mes+ano;
		int numSuerte=suma/1000;
		int resto = suma%1000;

		numSuerte =numSuerte+ resto/100;
		resto=resto%100;
		numSuerte =numSuerte+ resto/10;
		numSuerte =numSuerte+ resto%10;
		
		System.out.println("El número de la suerte es: "+numSuerte);
		}

}
