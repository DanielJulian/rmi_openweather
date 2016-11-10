package edu.undav.pdist.client;

import java.rmi.Naming;

import org.json.JSONObject;

import edu.undav.pdist.entities.Ciudad;
import edu.undav.pdist.server.Politica;
import edu.undav.pdist.server.ServerOpenWeatherInterface;
import edu.undav.pdist.server.ViolacionDePoliticaException;
public class Cliente {

	public static void main(String[] args) throws Exception {

		ServerOpenWeatherInterface servidor= (ServerOpenWeatherInterface) Naming.lookup("servidor_clima");
		Politica policy = servidor.getPolicy();

		Ciudad ciudad = new Ciudad("moscu", "1");
		try {
			policy.chequearValidez(ciudad);
			//Agrego una ciudad
			servidor.agregarCiudad(ciudad);
			System.out.println("Ciudad agregada");

			//Veo las ciudades disponibles
			System.out.println("Ciudades disponibles: "+servidor.getCiudades());

			//Consulto el clima de una ciudad
			String clima =  servidor.getClima("2643743");
			clima= clima.substring((clima.indexOf("temp")+6),(clima.indexOf("temp")+11));
			System.out.println("Clima de Londres: "+ (Double.parseDouble(clima)-273.15)+"ºC");


		} catch (ViolacionDePoliticaException ex) {
			System.out.println(
					"La ciudad " + ciudad.getNombre() + " no cumple con los requerimientos." + ex.getMessage());
		}
	}
}
