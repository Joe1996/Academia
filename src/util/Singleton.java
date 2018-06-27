package util;

import model.impl.Administrador;

public class Singleton {
	
	private static Singleton instance = null;
	
	private Administrador administrador;
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
	
}
