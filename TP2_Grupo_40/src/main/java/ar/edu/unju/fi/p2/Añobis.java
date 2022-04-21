package ar.edu.unju.fi.p2;
import java.util.Scanner;

public class Añobis {
	@SuppressWarnings("resource")

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el año a consultar: ");
		int año=sc.nextInt();
		
	//	para que un año sea bisiesto debe ser divisible por 4  por 400	
		if((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)) {
			System.out.println("El año ingresado es Bisiesto.");
		}
		else {
			System.out.println("El año ingresado NO es un año Bisiesto.");
		}
	}
}
