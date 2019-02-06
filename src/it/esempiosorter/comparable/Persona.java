package it.esempiosorter.comparable;

import it.esempiosorter.custom.Comparable;

public class Persona implements Comparable {
	
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
	public int compareTo(Object o) {
		Persona pers = (Persona) o;
		if(this.altezza > pers.altezza)
			return 1;
		if(this.altezza == pers.altezza)
			return 0;
		
		return -1;
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", altezza=" + altezza + "]";
	}
	
	

}
