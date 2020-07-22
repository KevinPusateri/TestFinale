package it.enaip.cinema;


public class TestCinema {

	public static void main(String[] args) throws Exception {
		
		
		Cinema cinema = DaoCinema.getInstance().save();
		

		DaoCinema.getInstance().addSpettatore(cinema);
		
		DaoCinema.getInstance().findAll(cinema);
		DaoCinema.getInstance().getIncasso(cinema);
		
	}
	
	
	
}
