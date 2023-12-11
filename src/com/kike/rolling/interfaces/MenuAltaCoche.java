package com.kike.rolling.interfaces;

import java.util.Scanner;

import com.kike.rolling.entidades.Cliente;
import com.kike.rolling.entidades.Coche;

public class MenuAltaCoche {
	
	public Coche muestraMenu(Scanner sc) {
		
		System.out.println("Dígame la marca del coche");
		String marca = sc.nextLine();
		System.out.println("Digame el año de antiguedad del coche");
		Integer anno = Integer.parseInt(sc.nextLine());

		
		Coche coche = new Coche(marca, anno);
		return coche;
	}

}
