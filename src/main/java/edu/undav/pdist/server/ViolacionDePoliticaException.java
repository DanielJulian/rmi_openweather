package edu.undav.pdist.server;

public class ViolacionDePoliticaException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ViolacionDePoliticaException(String message) {
		super(message);
	}

}
