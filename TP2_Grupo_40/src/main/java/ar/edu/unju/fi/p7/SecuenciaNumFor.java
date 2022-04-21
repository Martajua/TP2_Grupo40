package ar.edu.unju.fi.p7;

public class SecuenciaNumFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
package ar.edu.unju.fi.aplicacion.p7;

import java.util.Scanner;
public class Punto7 {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
       int j=40;
       int k=0;
        for (int i=2; i<=j; i++) {
        	i=i++;
        	k=j+i-1;	
        	
        if (i % 2 != 0)  {
        		//System.out.println("impar"+ i);
        		//System.out.println(k);
        		
        	 k=k+i;
        		System.out.println(k);
        	} 
        	else {
        		//System.out.println("IMPAR"+i);
        	}
        }
	}
}