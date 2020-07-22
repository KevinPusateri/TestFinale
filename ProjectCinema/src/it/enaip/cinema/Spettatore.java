package it.enaip.cinema;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Spettatore {

	private int idSpettatore;
	private String nome;
	private String cognome;
	private Date dataNascita;
	private Biglietto biglietto;

	public Spettatore(int idSpettatore, String nome, String cognome, Date dataNascita,Biglietto biglietto) {
		this.idSpettatore = idSpettatore;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.biglietto = biglietto;
	}
	
	
	public boolean minorenne() {
		int age = getAge();
		boolean minore = true;
		  if(age >= 18) {
			  minore = false;
			  if(age > 70) {
				  biglietto.applicaRiduzioneAnziani();
			  }
			  return true;
		  }else if(age < 5){
			  biglietto.calcolaRiduzioneBambini();
		  }
	   
	    return minore;
	}
	
	public int getAge() {
		Calendar c = Calendar.getInstance();
		  c.setTime(dataNascita);
		  int year = c.get(Calendar.YEAR);
		  int month = c.get(Calendar.MONTH) + 1;
		  int date = c.get(Calendar.DATE);
		  LocalDate l1 = LocalDate.of(year, month, date);
		  LocalDate now1 = LocalDate.now();
		  Period diff1 = Period.between(l1, now1);
		  return diff1.getYears();
	}
	
	
	public int getIdSpettatore() {
		return idSpettatore;
	}

	public void setIdSpettatore(int idSpettatore) {
		this.idSpettatore = idSpettatore;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Date getNascita() {
		return dataNascita;
	}

	public void setNascita(Date nascita) {
		this.dataNascita = nascita;
	}

	public Biglietto getBiglietto() {
		return biglietto;
	}

	public void setBiglietto(Biglietto biglietto) {
		this.biglietto = biglietto;
	}

}
