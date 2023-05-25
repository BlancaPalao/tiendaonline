package com.tiendaonline.Clases;

import java.util.HashMap;

public class Dto {
	
	private static HashMap<String, Cliente> bbdd = new HashMap<>();
	
	/**Este método comprueba si el cliente ya existia y si no existia lo añade en la base de datos
	 * 
	 * @param dni
	 * @param c
	 * @return
	 */
	public static boolean darAlta(String dni,Cliente c) {
		
		
		if(!clienteExiste(dni)) {
			bbdd.put(dni, c);
			return true;
		}
		
		return false;
	}
	
	
	/**Este metodo sirve para comprobar si el dni (clave) existia anteriormente en la base de datos
	 * 
	 * @param dni
	 * @return
	 */
	public static boolean clienteExiste(String dni) {
		return bbdd.containsKey(dni);
	}
}
