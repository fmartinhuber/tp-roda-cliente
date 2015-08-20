package vista;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.CommunicationException;

import delegate.Delegado;
import dto.RodamientoDto;

public class ClienteMain {

	public static void main(String[] args) throws CommunicationException, MalformedURLException, NotBoundException {

		List<RodamientoDto> rodamientos = new ArrayList<RodamientoDto>();
		rodamientos = Delegado.getInstancia().obtenerRodamientos();
		
//		for(RodamientoDto r : rodamientos){
//			System.out.println("Codigo: " +r.getCodigo() + " \t Marca: " +r.getMarca() + " \t Origen: " +r.getOrigen() + " \t Precio: " );
//		}	

	}

}
