package model;

import java.util.Objects;

public class Palavra {
	public String verbete;
	public String significado;
	
	public Palavra() {
		super();
	}

	public Palavra(String verbete, String significado) {
		this.verbete = verbete;
		this.significado = significado;
	}

	@Override
	public String toString() {
		return "Palavra [verbete=" + verbete + ", significado=" + significado + "]";
	}

	@Override
	public int hashCode() {
		char c = verbete.toLowerCase().charAt(0);
		int ch = c - 97;
		return ch;
	}



}
