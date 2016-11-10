package edu.undav.pdist.entities;

import java.io.Serializable;

import edu.undav.pdist.server.Politica;
import edu.undav.pdist.server.ViolacionDePoliticaException;

public class PoliticaNoIdCero implements Politica, Serializable {
	private static final long serialVersionUID = 3891169171081225288L;

	@Override
	public void chequearValidez(Ciudad ciudad) throws ViolacionDePoliticaException {
		if (ciudad.getId() != null && ciudad.getId().equals("0"))
			throw new ViolacionDePoliticaException("No se permite ID 0");
	}
}
