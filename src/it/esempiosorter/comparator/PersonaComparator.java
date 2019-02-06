package it.esempiosorter.comparator;

import it.esempiosorter.custom.Comparator;

public class PersonaComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Persona p1 = (Persona) o1;
		Persona p2 = (Persona) o2;
		
		if(p1.getAltezza() > p2.getAltezza())
			return 1;
		
		if(p1.getAltezza() == p2.getAltezza())
			return 0;
		
		return -1;
	}

}
