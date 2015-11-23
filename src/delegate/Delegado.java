package delegate;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import javax.naming.CommunicationException;

import dto.ClienteDto;
import dto.ProveedorDto;
import dto.RodamientoDto;
import interfaces.IAdministracionCC;
import interfaces.IAdministracionOV;

public class Delegado {
	
	private static Delegado instancia;
	private IAdministracionOV manejoDeDatos;
	private IAdministracionCC administracionCC;
	
	private Delegado() throws CommunicationException{
	
		try {
			conexionRemota();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
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
			manejoDeDatos = (IAdministracionOV)Naming.lookup("//localhost/SistemaRodamiento");
			administracionCC = (IAdministracionCC) Naming.lookup("//localhost/SistemaRodamiento");
			System.out.println("Se conecto correctamente con el servidor");
			System.out.println("========================================");
			System.out.println();
		} catch (RemoteException e) {
			throw new CommunicationException("No se pudo conectar con el Server");
		}
	}
	
	//Aca van los metodos
	
	@Deprecated
	public List<RodamientoDto> obtenerRodamientos(){
		try{
			return manejoDeDatos.obtenerRodamientos();
		} catch(RemoteException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public void crearCliente(ClienteDto cliente){
		try{
			manejoDeDatos.crearCliente(cliente);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
	
	public void eliminarCliente(ClienteDto cliente){
		try{
			manejoDeDatos.eliminarCliente(cliente);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
	
	public void modificarCliente(ClienteDto cliente){
		try{
			manejoDeDatos.modificarCliente(cliente);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}	
	
	public void crearProveedor(ProveedorDto proveedor){
		try{
			administracionCC.crearProveedor(proveedor);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
	
	public void eliminarProveedor(ProveedorDto proveedor){
		try{
			administracionCC.eliminarProveedor(proveedor);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
	
	public void modificarPRoveedor(ProveedorDto proveedor){
		try{
			administracionCC.eliminarProveedor(proveedor);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
	
}
