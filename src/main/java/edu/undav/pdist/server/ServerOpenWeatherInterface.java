package edu.undav.pdist.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import edu.undav.pdist.entities.Ciudad;

public interface ServerOpenWeatherInterface extends Remote {

	void agregarCiudad(Ciudad ciudad) throws RemoteException;

	List<Ciudad> getCiudades() throws RemoteException;

	Politica getPolicy() throws RemoteException;

	String getClima(String id) throws RemoteException;

}
