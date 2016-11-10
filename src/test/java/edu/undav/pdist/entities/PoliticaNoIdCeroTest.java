package edu.undav.pdist.entities;

import org.junit.Test;

import edu.undav.pdist.server.Politica;
import edu.undav.pdist.server.ViolacionDePoliticaException;

public class PoliticaNoIdCeroTest {


	@Test
	public void chequearValidez() {
		Politica politica = new PoliticaNoIdCero();
		politica.chequearValidez(new Ciudad("moscu", "1"));
			}

	@Test(expected = ViolacionDePoliticaException.class)
	public void chequearValidezOtroNombre() {
		Politica politica = new PoliticaNoIdCero();
		politica.chequearValidez(new Ciudad("groenlandia", "0"));
	}


}
