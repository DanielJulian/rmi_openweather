package edu.undav.pdist.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
	

	public static void main(String[] args) throws Exception {
		
		System.out.println("Servidor levantado");
		
		try {
			//el 1099 es el puerto default de RMI
			LocateRegistry.createRegistry(1099);
			System.out.println("Registro creado");
		} catch (RemoteException e) {
			System.out.println("Registro ya existe");
		}
		
		ServerOpenWeatherInterface server = new ServerOpenWeather();
		
		Naming.rebind("servidor_clima", server);
		System.out.println("Servidor registrado");
	}

}
