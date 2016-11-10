package edu.undav.pdist.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.undav.pdist.entities.Ciudad;
import edu.undav.pdist.entities.PoliticaNoIdCero;
import edu.undav.pdist.entities.PoliticaNoIdCeroTest;


public class ServerOpenWeather extends UnicastRemoteObject implements ServerOpenWeatherInterface {

	private static final long serialVersionUID = 1L;

	private Map<String, Ciudad> ciudades;

	protected ServerOpenWeather() throws RemoteException {
		super();
		this.ciudades = new HashMap<>();
		String id = "2643743";
		this.ciudades.put(id, new Ciudad("Londres", id));
	}

	@Override
	public void agregarCiudad(Ciudad ciudad) throws RemoteException {
		this.ciudades.put(ciudad.getId(), ciudad);
	}

	@Override
	public List<Ciudad> getCiudades() throws RemoteException {
		return new ArrayList<>(ciudades.values());
	}

	@Override
	public Politica getPolicy() throws RemoteException {
		return new PoliticaNoIdCero();
	}


	public String getClima(String id) throws RemoteException{
		String clima = null;
		try {
			clima = CallApi.sendGet(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clima;
	}


}
