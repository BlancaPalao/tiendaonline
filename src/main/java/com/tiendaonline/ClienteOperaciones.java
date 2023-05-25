package com.tiendaonline;

import java.util.ArrayList;

/**TAREA:
 * Crear una clase con el nombre ClienteOperaciones.java el método para dar de baja 
 * a un cliente en la tienda online (permitir buscar al cliente o por dni o por teléfono)
 * 
 * @author alumno
 *
 */


public class ClienteOperaciones {
	
	/**Este método recibe una lista de clientes y el cliente que se quiere borrar de dicha lista.
	 * A continuación entra en el método clienteExiste() para comprobar si existe el cliente que recibimos,
	 * si existe, lo borra y devuelve true, si no, devuelve false.
	 * 
	 * @param lista_clientes
	 * @param c
	 * @return
	 */
	public boolean bajaCliente(ArrayList<Cliente> lista_clientes, Cliente c) {
		if(clienteExiste(lista_clientes,c)) {
			lista_clientes.remove(c);
			return true;
		}
		return false;
	}
	
	public boolean clienteExiste(ArrayList<Cliente> lista_clientes,Cliente c) {
		
		return lista_clientes.contains(c);
	}
}
