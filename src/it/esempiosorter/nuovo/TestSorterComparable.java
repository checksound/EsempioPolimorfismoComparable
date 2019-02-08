package it.esempiosorter.nuovo;

import java.util.Arrays;

import it.esempiosorter.comparable.Persona;

public class TestSorterComparable {

	public static void main(String[] args) {
		
		Persona[] persone = {
				new Persona("Massimo", 175),
				new Persona("Luca", 159),
				new Persona("Chiara", 120),
				new Persona("Stefano", 180),
				new Persona("Eliseo", 160)
		};
		
		System.out.println("PRIMA: " + Arrays.toString(persone));
		
		Sorter.sort(persone, true);
		
		System.out.println("DOPO: " + Arrays.toString(persone));
		
	}
}
