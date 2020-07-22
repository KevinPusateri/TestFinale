package it.enaip.cinema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DaoCinema implements CinemaDao {

	private static class SingletonHelper {
		private static final DaoCinema INSTANCE = new DaoCinema();
	}

	public static DaoCinema getInstance() {
		return SingletonHelper.INSTANCE;
	}


	@Override
	public List<SalaCinematografica> findAll(Cinema cinema){
		for (int i = 0; i < cinema.getSala().size(); i++) {
			for (int j = 0; j < cinema.getSala().get(i).getSpettatori().size(); j++) {
				System.out.println("Sala: "+i+" "+cinema.getSala().get(i).getSpettatori().get(j).toString());
			}
		}	
		return cinema.getSala();
	}



	@Override
	public Cinema save() {
		final int dimensione = 40;
	      Cinema cinema = new Cinema();
	      Film film1 = new Film("Bussola d'oro", "Diego", "Marco", "Horror", "2:30");
	      Film film2 = new Film("Batman", "Marco", "Stefano", "Azione", "2:00");
	      Film film3 = new Film("Holmes", "Kevin", "Davide", "Giallo", "1:30");
	      cinema.aggiungiSala(dimensione, film1);
	      cinema.aggiungiSala(dimensione, film3);
	      cinema.aggiungiSala(dimensione, film2);
	      cinema.aggiungiSala(dimensione, film1);
	      cinema.aggiungiSala(dimensione, film1);
	      return cinema;
	      
	}

	
	public void addSpettatore(Cinema cinema) throws Exception{
//		cinema.getSala().get(0).consentiIngresso(new Spettatore(3, "Stefa", "Pusa", dataNascita("2018-01-03") , new Biglietto(34)));
		cinema.getSala().get(0).getSpettatori().add(new Spettatore(2, "Marco", "Pusa", dataNascita("1999-01-01") , new Biglietto(12)));
//		cinema.getSala().get(0).consentiIngresso(new Spettatore(3, "Stefa", "Pusa", dataNascita("2018-01-03") , new Biglietto(34)));
		cinema.getSala().get(0).getSpettatori().add(new Spettatore(3, "Stefa", "Pusa", dataNascita("2018-01-03") , new Biglietto(34)));
		cinema.getSala().get(1).getSpettatori().add(new Spettatore(4, "Andr", "Pusa", dataNascita("2008-01-03") , new Biglietto(42)));
		cinema.getSala().get(1).getSpettatori().add(new Spettatore(4, "Mirko", "Pusa", dataNascita("2010-01-03") , new Biglietto(32)));
		cinema.getSala().get(1).getSpettatori().add(new Spettatore(5, "Giacomo", "Pusa", dataNascita("1942-01-03") , new Biglietto(14)));
		cinema.getSala().get(2).getSpettatori().add(new Spettatore(6, "Fderico", "Pusa", dataNascita("2010-01-03") , new Biglietto(14)));

	}
	
	
	public static Date dataNascita(String data) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(data));
		return c.getTime();
	}


	@Override
	public void getIncasso(Cinema cinema) {
		System.out.println("Prezzo totale: "+ cinema.getIncassoCinema());
	}





}
