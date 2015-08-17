package vista;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.CommunicationException;

import beans.*;
import delegate.Delegado;

public class ClienteMain {

	public static void main(String[] args) throws CommunicationException, MalformedURLException, NotBoundException {

		List<RodamientoBean> rodamientos = new ArrayList<RodamientoBean>();
		rodamientos = Delegado.getInstancia().obtenerRodamientos();
		
		for(RodamientoBean r : rodamientos){
			System.out.println("Codigo: " +r.getCodigo() + " \t Marca: " +r.getMarca() + " \t Origen: " +r.getOrigen() + " \t Precio: " + r.getPrecio());
		}	

	}

}
