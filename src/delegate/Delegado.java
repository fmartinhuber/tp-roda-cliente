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
	private IAdministracionOV manejoDeDatosOV;
	private IAdministracionCC manejoDeDatosCC;
	
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
			manejoDeDatosOV = (IAdministracionOV) Naming.lookup("//localhost:1099/SistemaRodamientoOV");
			manejoDeDatosCC = (IAdministracionCC) Naming.lookup("//localhost:1099/SistemaRodamientoCC");
			System.out.println("Se conecto correctamente con el servidor");
			System.out.println("========================================");
			System.out.println();
		} catch (RemoteException e) {
			throw new CommunicationException("No se pudo conectar con el Server");
		}
	}
	
	//Aca van los metodos
	
//	@Deprecated
//	public List<RodamientoDto> obtenerRodamientos(){
//		try{
//			//TODO: Rama fijate que esto tira error
//			//return manejoDeDatos.obtenerRodamientos();
//		} catch(RemoteException e){
//			e.printStackTrace();
//		}
//		return null;
//	}
	
	public void crearCliente(ClienteDto cliente){
		try{
			manejoDeDatosOV.crearCliente(cliente);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
	
	public void eliminarCliente(ClienteDto cliente){
		try{
			manejoDeDatosOV.eliminarCliente(cliente);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
	
	public void modificarCliente(ClienteDto cliente){
		try{
			manejoDeDatosOV.modificarCliente(cliente);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}	
	
	public void crearProveedor(ProveedorDto proveedor){
		try{
			manejoDeDatosCC.crearProveedor(proveedor);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
	
	public void eliminarProveedor(ProveedorDto proveedor){
		try{
			manejoDeDatosCC.eliminarProveedor(proveedor);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
	
	public void modificarPRoveedor(ProveedorDto proveedor){
		try{
			manejoDeDatosCC.eliminarProveedor(proveedor);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}
	
}
