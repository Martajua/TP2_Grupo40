package ar.edu.unju.fi.p6;

	import java.util.Scanner;

		public class NotaAlumo {
			public static int nota;
			
			@SuppressWarnings("resource")
			public static void main(String[] args) {
				
		     Scanner sc = new Scanner (System.in);
		     
		     do {
		     System.out.println("Ingrese nota:");
		     
		     nota= sc.nextInt();
		     
		     if (nota==6) {
		    	 
		     	System.out.println("Alumno regularizado");	 
		      }
		     else {
		    	 if (nota>=7 && nota<=10 ){
		       System.out.println("Alumno promocionado");
		    	 }
		     else{
		        if (nota>=1 && nota<6) {    	
		    		System.out.println("Alumno desaprobado"); 
		    		}
		        else {System.out.println("El rango permitido es del 1-10");}
		    	 }
		    
		     }
		     }
		     while (!(nota<0));
		     System.out.println("valor no permitido");
		}
		}


}
