package com.kike.rolling.interfaces;

import com.kike.rolling.entidades.Cliente;
import com.kike.rolling.entidades.Coche;
import com.kike.rolling.entidades.Neumaticos;

public class MenuCreacionFactura {
	
	public void creaFactura(Cliente cliente, Coche coche, Neumaticos neumaticos) {
		System.out.println("******************FACTURA**********************************");
		System.out.println("Factura emitida al cliente " + cliente.getNombre() + " con DNI: " + cliente.getDni());
		System.out.println("Neumáticos sustuidos: " + neumaticos.getMarca());
	
		
		System.out.println("Precio Total: " +   neumaticos.getPrecio() *(1-cliente.calculaDescuento()));
		System.out.println("******************FACTURA**********************************");
	}

}
