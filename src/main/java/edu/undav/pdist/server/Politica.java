package edu.undav.pdist.server;

import edu.undav.pdist.entities.Ciudad;

public interface Politica {
	
	void chequearValidez(Ciudad empleado)
	        throws ViolacionDePoliticaException;

}
