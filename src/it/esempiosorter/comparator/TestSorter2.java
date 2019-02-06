package it.esempiosorter.comparator;

import java.util.Arrays;

import it.esempiosorter.custom.SorterComparator;

public class TestSorter2 {
	
	public static void main(String[] args) {
		
		Persona[] persone = {
				new Persona("Massimo", 175),
				new Persona("Luca", 159),
				new Persona("Chiara", 120),
				new Persona("Stefano", 180),
				new Persona("Eliseo", 160)
		};
		
		System.out.println("PRIMA: " + Arrays.toString(persone));
		
		SorterComparator.sort(persone, true, new PersonaComparator());
		
		System.out.println("DOPO: " + Arrays.toString(persone));
		
	}
}
