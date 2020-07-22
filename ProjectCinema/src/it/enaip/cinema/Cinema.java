package it.enaip.cinema;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

	private List<SalaCinematografica> sala;
	
	public Cinema(){
		sala = new ArrayList<>();
	}
	
	public void aggiungiSala(int dimensione,Film film) {
		sala.add(new SalaCinematografica(dimensione, film));
	}
	
	public float getIncassoCinema() {
		float prezzo = 0f;
		for (SalaCinematografica salaCinematografica : sala) {
			prezzo+=salaCinematografica.calcolaIncasso();
		}
		return prezzo;
	}

	public List<SalaCinematografica> getSala() {
		return sala;
	}

	public void setSala(List<SalaCinematografica> sala) {
		this.sala = sala;
	}
	
	
	
	
}
