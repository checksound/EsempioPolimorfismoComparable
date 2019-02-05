package it.esempiocomparator.uno;

public class PersonaC implements Comparable<PersonaC> {
	
	private final String name;
	private final int altezza;
	
	public PersonaC(String name, int altezza) {
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
	public int compareTo(PersonaC o) {
		if(this.altezza > o.altezza)
			return 1;
		if(this.altezza == o.altezza)
			return 0;
		
		return -1;
	}

	@Override
	public String toString() {
		return "PersonaC [name=" + name + ", altezza=" + altezza + "]";
	}
	
	

}
