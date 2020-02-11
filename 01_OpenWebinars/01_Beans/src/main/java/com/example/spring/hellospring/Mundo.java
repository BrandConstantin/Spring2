package com.example.spring.hellospring;

public class Mundo {
	private String mensaje;

	public Mundo(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public Mundo() {}
}
