package com.tiendaonline;

import java.util.Scanner;
public class ProductoOperaciones {
	Scanner sc = new Scanner(System.in);
	public void BajaProducto() {
		int codigo;
		String nombre;
		System.out.println("Dame el codigo del producto");		
		codigo=sc.nextInt();
		
		System.out.println(" O dame el nombre del producto");		
		nombre=sc.next();
	}

}
