package com.algaworks.osworks.doman.expection;

public class NegocioException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public NegocioException(String message) {
		super(message);
	}
}
