package delegate;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import javax.naming.CommunicationException;

import beans.*;
import interfaces.ManejoDatos;

public class Delegado {
	
	private static Delegado instancia;
	private ManejoDatos manejoDeDatos;
	
	private Delegado() throws CommunicationException{
		try {
			conexionRemota();
		} catch (MalformedURLException	| NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Delegado getInstancia() throws CommunicationException, MalformedURLException, NotBoundException
	{
		if(instancia == null)
			instancia = new Delegado();
		return instancia;
	}

	private void conexionRemota() throws CommunicationException, MalformedURLException, NotBoundException
	{
		try {
			manejoDeDatos=(ManejoDatos)Naming.lookup("//localhost/SistemaRodamiento");
			System.out.println("Se conecto correctamente con el servidor");
			System.out.println("========================================");
			System.out.println();
		} catch (RemoteException e) {
			throw new CommunicationException("No se pudo conectar con el Server");
		}
	}
	
	//Aca van los metodos
	
	public List<RodamientoBean> obtenerRodamientos(){
		try{
			return manejoDeDatos.obtenerRodamientos();
		} catch(RemoteException e){
			e.printStackTrace();
		}
		return null;
	}

}