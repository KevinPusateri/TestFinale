package it.enaip.cinema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalaCinematografica {

	private List<Spettatore> spettatori;
	private Film film;
	private int dimensione;
	
	public SalaCinematografica(int dimensione, Film film) {
		spettatori = new ArrayList<Spettatore>();
		this.dimensione = dimensione;
		this.film = film;
	}
	
	public void aggiungiSpettatore(int idSpettatore, String nome, String cognome, Date dataNascita, Biglietto biglietto) {
		spettatori.add(new Spettatore(idSpettatore, nome, cognome, dataNascita, biglietto));
	}
	
	public void svuotaSala() {
		spettatori.clear();
	}
	
	public void consentiIngresso(Spettatore spettatore) throws Exception {
		if(spettatori.size() < dimensione) {
			spettatori.add(spettatore);
		}else {
			throw new Exception("Non ci sono posti disponibili");		
		}
		
		for (Spettatore spett : spettatori) {
			if(spett.minorenne() && spett.getAge()<14 
					&& "horror".equalsIgnoreCase(film.getGenere())) {
				throw new Exception("Film Vietato");		
			}
		}
	}
	
	public float calcolaIncasso() {
		float totale = 0f;
		for (Spettatore spettatore : spettatori) {
			totale = spettatore.getBiglietto().getPrezzo();
		}
		
		return totale;
	}

	public List<Spettatore> getSpettatori() {
		return spettatori;
	}

	public void setSpettatori(List<Spettatore> spettatori) {
		this.spettatori = spettatori;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public int getDimensione() {
		return dimensione;
	}

	public void setDimensione(int dimensione) {
		this.dimensione = dimensione;
	}
	
	
	
	
}
