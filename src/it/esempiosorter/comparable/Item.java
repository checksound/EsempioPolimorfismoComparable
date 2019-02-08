package it.esempiosorter.comparable;

public class Item implements Comparable {
	
	private String nomeProdotto;
	private int prezzo;
	
	public Item(String nomeProdotto, int prezzo) {
		super();
		this.nomeProdotto = nomeProdotto;
		this.prezzo = prezzo;
	}

	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public int getPrezzo() {
		return prezzo;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
