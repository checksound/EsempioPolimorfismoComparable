package it.esempiosorter.comparable;

import java.util.Arrays;

public class TestSorter {

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
