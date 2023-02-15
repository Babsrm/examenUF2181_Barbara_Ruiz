package main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import libs.Funciones;

public class Ppal {

	public static void main(String[] args) {
		
			Funciones f = new Funciones();

			Scanner teclado = new Scanner(System.in);
		
		try {
			System.out.println("Introduce un número:");
			int num1 = teclado.nextInt();
			
			System.out.println("Introduce otro número:");
			int num2 = teclado.nextInt();
			
			System.out.println("Introduce otro:");
			int num3 = teclado.nextInt();
			
			System.out.println("El número que está en medio es "
			                  +f.devuelveCentral(num1,num2,num3));
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
