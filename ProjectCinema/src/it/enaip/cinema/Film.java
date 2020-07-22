package it.enaip.cinema;

public class Film {
	
	private String titolo;
	private String autore;
	private String produttore;
	private String genere;
	private String durata;
	
	public Film(String titolo, String autore, String produttore, String genere, String durata) {
		this.titolo = titolo;
		this.autore = autore;
		this.produttore = produttore;
		this.genere = genere;
		this.durata = durata;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getProduttore() {
		return produttore;
	}
	public void setProduttore(String produttore) {
		this.produttore = produttore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getDurata() {
		return durata;
	}
	public void setDurata(String durata) {
		this.durata = durata;
	}
	
	
}
