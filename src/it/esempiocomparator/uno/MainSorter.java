package it.esempiocomparator.uno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainSorter {

	public static void main(String[] args) {
		
		List<Persona> persone = new ArrayList<>();
		
		// Errore compilazione
		//Collections.sort(persone);
		
		// OK, utilizzando un comparator
		Collections.sort(persone, new PersonaComparator());
		
		List<PersonaC> personeC = new ArrayList<>();
		
		Collections.sort(personeC);
	}

}
