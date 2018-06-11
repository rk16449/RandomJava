import static org.junit.Assert.*;

import org.junit.Test;

public class FilmBoxOfficeTest {

	@Test
	public void testFilms() {
		// Create a fixed size array of Films
		Film[] films = new Film[4];
		
		films[0] = new Film();
		
		// Check if getters and setters work
		FilmBoxOffice.setName(films[0], "test film name");
		assertEquals(FilmBoxOffice.getName(films[0]), "test film name");
		
		FilmBoxOffice.setStartTime(films[0], "7:15");
		assertEquals(FilmBoxOffice.getStartTime(films[0]), "7:15");
	}

}
