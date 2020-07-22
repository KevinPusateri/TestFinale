package it.enaip.cinema;

import java.text.ParseException;
import java.util.List;

public interface Dao<T,ID> {

	
	List<T> findAll(Cinema cinema);
	
	Cinema save();
	
	void addSpettatore(Cinema cinema) throws ParseException, Exception;

	void getIncasso(Cinema cinema);
}
