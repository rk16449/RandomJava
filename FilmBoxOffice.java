import javax.swing.JOptionPane;

class Film{
	String name;
	String startTime;
}
public class FilmBoxOffice {

	public static void main(String[] args) {
		// Create a fixed size array of Films
		Film[] films = new Film[4];
		
		// Pass array into createFilms method to create them
		createFilms(films);
		
		// Loop through the array and display
		printFilms(films);
	}
	
	// Loop through the empty array and now create values for name and startTime
	public static void createFilms(Film[] _films){
		final int length = _films.length;
		for(int i=0; i< length; i++){
			_films[i] = new Film();
			setName(_films[i], input("Film for Screen " + (i+1) + "?"));
			int hour = Integer.parseInt(input("What time does it start? Hour"));
			int minutes = Integer.parseInt(input("What time does it start? Minutes after the hour"));
			String time = Integer.toString(hour) + ":" + Integer.toString(minutes);
			setStartTime(_films[i], time);
		}
	}
	
	// Loop through array and print it out one by one
	public static void printFilms(Film[] _films){
		output("CinemaWorld Films Tonight");
		
		final int length = _films.length;
		for(int i=0; i<length; i++){
			output("Screen " + (i+1) + ": "+ getName(_films[i]) + "           " + getStartTime(_films[i]));
		}
	}
	
	// Prints out everything at once
	public static void printFilmsAll(Film[] _films){
		final int length = _films.length;
		String para = "CinemaWorld Films Tonight \n";
		for(int i=0; i<length; i++){
			para += "Screen " + (i+1) + ": "+ getName(_films[i]) + " " + getStartTime(_films[i]) + "\n";
		}
		output(para);
	}
	
	/**
	 * 
	 * @param _text
	 */
	public static void output(String _text){
		JOptionPane.showMessageDialog(null, _text);
	}
	
	/**
	 * 
	 * @param _text
	 * @return
	 */
	public static String input(String _text){
		return JOptionPane.showInputDialog(_text);
	}
	
	/**
	 * Setters
	 * @param _film
	 * @param _name
	 * @return
	 */
	public static Film setName(Film _film, String _name){
		_film.name = _name;
		return _film;
	}
	
	/**
	 * 
	 * @param _film
	 * @param _startTime
	 * @return
	 */
	public static Film setStartTime(Film _film, String _startTime){
		_film.startTime = _startTime;
		return _film;
	}
	
	/**
	 * 
	 * @param _film
	 * @return
	 */
	public static String getName(Film _film){
		return _film.name;
	}
	
	/**
	 * 
	 * @param _film
	 * @return
	 */
	public static String getStartTime(Film _film){
		return _film.startTime;
	}

}
