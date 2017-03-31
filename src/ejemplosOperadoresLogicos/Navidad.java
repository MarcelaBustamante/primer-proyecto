package ejemplosOperadoresLogicos;

import java.util.*;

public class Navidad {
	
	public static void main(String[] ar){
		Scanner teclado=new Scanner(System.in);
        int dia,mes,año;
        System.out.print("Ingrese nro de día:");
        dia=teclado.nextInt();
        System.out.print("Ingrese nro de mes:");
        mes=teclado.nextInt();
        System.out.print("Ingrese nro de año:");
        año=teclado.nextInt();
        if(dia==25 &&mes==12)System.out.print("Es navidad");   
	}

}
