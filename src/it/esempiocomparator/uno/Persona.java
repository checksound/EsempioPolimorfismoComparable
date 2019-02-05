package it.esempiocomparator.uno;

public class Persona {
	
	private final String name;
	private final int altezza;
	
	public Persona(String name, int altezza) {
		this.name = name;
		this.altezza = altezza;
	}

	public String getName() {
		return name;
	}

	public int getAltezza() {
		return altezza;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", altezza=" + altezza + "]";
	}
	
	

}
