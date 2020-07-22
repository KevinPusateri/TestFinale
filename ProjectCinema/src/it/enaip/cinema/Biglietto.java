package it.enaip.cinema;

public class Biglietto {

	private int posizione;
	private float prezzo;
	
	public Biglietto(int posizione) {
		this.posizione = posizione;
		this.prezzo = 10;
	}

	public void applicaRiduzioneAnziani() {
		prezzo = prezzo - (prezzo * 10 / 100);
	}
	
	public void calcolaRiduzioneBambini() {
		prezzo = prezzo - (prezzo * 50 / 100);

	}
	
	public int getPosizione() {
		return posizione;
	}

	public void setPosizione(int posizione) {
		this.posizione = posizione;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
}
