package ejemplosOperadoresLogicos;

import java.util.*;

public class Navidad {
	
	public static void main(String[] ar){
		Scanner teclado=new Scanner(System.in);
        int dia,mes,a�o;
        System.out.print("Ingrese nro de d�a:");
        dia=teclado.nextInt();
        System.out.print("Ingrese nro de mes:");
        mes=teclado.nextInt();
        System.out.print("Ingrese nro de a�o:");
        a�o=teclado.nextInt();
        if(dia==25 &&mes==12)System.out.print("Es navidad");   
	}

}
