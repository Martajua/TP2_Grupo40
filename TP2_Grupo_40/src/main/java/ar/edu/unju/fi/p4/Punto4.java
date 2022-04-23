package ar.edu.unju.fi.p4;
import java.util.Scanner;
public class Punto4 {
@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un número: ");
		int num=sc.nextInt();

		if(num>=1 && num<=12) {
			if(num == 1) {
				System.out.println("Enero");
			}//cierra el segundo if
			else {
				if(num == 2) {
					System.out.println("Febrero");
				} //cierra el 3er if
				else {
					if(num == 3) {
						System.out.println("Marzo");
					} //4to if
					else {
						if(num == 4) {
							System.out.println("Abril");
						}//cierra 5to if
						else {
							if(num == 5) {
								System.out.println("Mayo");
							} //cierra el 6to if
							else {
								if(num == 6) {
									System.out.println("Junio");
								} //7to if
								else {
									if(num == 7) {
									System.out.println("Julio");
									}//8vo if
									else {
										if(num == 8) {
										System.out.println("Agosto");
										} //cierra el 9no if
										else {
											if(num == 9) {
											System.out.println("Septiembre");
											} //10mo if
											else {
												if(num == 10) {
													System.out.println("Octubre");
												} //11vo if
												else {
													if(num == 11) {
														System.out.println("Noviembre");
													}//12vo if
													else {
														System.out.println("Diciembre");
													} //ultimo else
												} //penunltimo else
											} //7mo else
										}//8vo else
									}
								}
							}
						}
					}
				}//2do else
			} //cierra el primer else
		} //cierra el primer if
		else {
			System.out.println("El numero ingresado NO corresponde a un mes del año");
			}

	} //metodo main
} //clase principal
