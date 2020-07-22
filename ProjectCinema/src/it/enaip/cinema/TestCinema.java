package it.enaip.cinema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCinema {

	public static void main(String[] args) throws ParseException {
		
		Cinema cinema = retriveSaleFromDatabase(5);
		Date data = dataNascita();
		for (int i = 0; i < cinema.getSala().size(); i++) {
			cinema.getSala().get(i).getSpettatori().add(new Spettatore(1, "Kevin", "Pusa",data , new Biglietto(i)));
		}
		
		for (int i = 0; i < cinema.getSala().size(); i++) {
			
		}	
		
	}
	
	

	private static Cinema retriveSaleFromDatabase(int num){
		  final int dimensione = 40;
	      Cinema cinema = new Cinema();
	      Film film1 = new Film("Bussola d'oro", "Diego", "Marco", "Fantasy", "2:30");
	      Film film2 = new Film("Batman", "Marco", "Stefano", "Azione", "2:00");
	      Film film3 = new Film("Holmes", "Kevin", "Davide", "Giallo", "1:30");
	      cinema.aggiungiSala(dimensione, film1);
	      cinema.aggiungiSala(dimensione, film3);
	      cinema.aggiungiSala(dimensione, film2);
	      cinema.aggiungiSala(dimensione, film1);
	      cinema.aggiungiSala(dimensione, film1);
	      return cinema;
	   }
	
	private static Date dataNascita() throws ParseException {
		String dt = "1999-01-01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(dt));
		return c.getTime();
	}
}
