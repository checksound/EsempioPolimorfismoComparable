package it.esempiosorter.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSorter {

	public static void main(String[] args) {
		
		List<Persona> persone = new ArrayList<>();
		
		persone.add(new Persona("Massimo", 175));
		persone.add(new Persona("Luca", 159));
		persone.add(new Persona("Chiara", 120));
		persone.add(new Persona("Stefano", 180));
		persone.add(new Persona("Eliseo", 160));
		
		// Errore compilazione
		//Collections.sort(persone);
		
		System.out.println("PRIMA SORTING: " + persone);
		
		// OK, utilizzando un comparator
		Collections.sort(persone, new PersonaComparator());
		
		System.out.println("DOPO SORTING: " + persone);
		
		List<PersonaC> personeC = new ArrayList<>();
		personeC.add(new PersonaC("Massimo", 175));
		personeC.add(new PersonaC("Luca", 159));
		personeC.add(new PersonaC("Chiara", 120));
		personeC.add(new PersonaC("Stefano", 180));
		personeC.add(new PersonaC("Eliseo", 160));
		
		Collections.sort(personeC);
		
		System.out.println("SORTING PersonaC: " + personeC);
	}

}
