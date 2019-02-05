package it.esempiosorter.general;

import java.util.Comparator;

public class PersonaComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		if(o1.getAltezza() == o2.getAltezza())
			return 0;
		if(o1.getAltezza() > o2.getAltezza())
			return 1;
		
		return -1;
	}

}
