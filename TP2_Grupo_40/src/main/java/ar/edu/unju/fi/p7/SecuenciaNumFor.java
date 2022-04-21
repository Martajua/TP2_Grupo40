
package ar.edu.unju.fi.aplicacion.p7;

import java.util.Scanner;
public class SecuenciaNumFor {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
       int j=40;
        for (int i=2; i<0; i++) {
        	i=i++;
        	j=j+i-1;	
        if (i % 2 != 0)  {
        		//System.out.println("impar"+ i);
        		//System.out.println(k);
        		
        	 j=j+i;
        		System.out.println(k);
        	} 
        	else {
        		//System.out.println("IMPAR"+i);
        	}
        }
	}
}