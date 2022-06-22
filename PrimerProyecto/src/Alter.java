import java.util.Scanner;

public class Alter {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("CAMBIO");
		System.out.println("-------");
		
		System.out.println("Precio articulo: ");
		float precio=teclado.nextFloat();
		
		System.out.println("Importe pagado: ");
		float pagado=teclado.nextFloat();
		
		float cambio,decimal;
		int m2,m1,m50,m20,m10,m5,m2c,m1c,ent;
		
		cambio=pagado-precio;
		cambio = (float) (Math.round(cambio*100d)/100d);
		ent = (int) cambio;
		
		decimal = cambio - ent;
		decimal=decimal*100;
		decimal = (int) (decimal);
		
		m2 = (int) (cambio/2);
		m1 = (int) (cambio%2);
		
		m50 = (int) (decimal/50);	
		m20 =(int) (decimal%50/20);
		
		m10=(int) ((decimal%50)%20)/10;
		m5=(int)  ( ( (decimal%50)%20)%10) /5;
		
		m2c= (int) ( ( ( (decimal%50)%20)%10) %5)/2;
		m1c= (int) ( ( ( (decimal%50)%20)%10) %5)%2;
		
		System.out.println("El cambio es " + cambio);
		System.out.println(m2 + " monedas de 2");
		System.out.println(m1 + " monedas de 1");
		System.out.println(m50 + " monedas de 50c");
		System.out.println(m20+ " monedas de 20c");
		System.out.println(m10+ " monedas de 10c");
		System.out.println(m5+ " monedas de 5c");
		System.out.println(m2c+ " monedas de 2c");
		System.out.println(m1c+ " monedas de 1c");
		
	}

}