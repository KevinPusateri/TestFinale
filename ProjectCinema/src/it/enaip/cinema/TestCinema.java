package it.enaip.cinema;

import java.text.ParseException;

public class TestCinema {

	public static void main(String[] args) throws ParseException {
		
		
		Cinema cinema = DaoCinema.getInstance().save();
		

		DaoCinema.getInstance().addSpettatore(cinema);
		
		DaoCinema.getInstance().findAll(cinema);
		DaoCinema.getInstance().getIncasso(cinema);
		
	}
	
	
	
}
