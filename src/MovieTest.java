import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {
    private Movie movie;

    @Before
    public void setUp(){
        movie = new Movie("MovieTitle", Movie.REGULAR);
    }

    @Test
    public void getTitle(){
        assertEquals(movie.getTitle(), "MovieTitle" );
    }

    @Test
    public void getPriceCode(){
        assertEquals(movie.getPriceCode(), Movie.REGULAR);
    }

    @Test
    public void setPriceCode(){
        movie.setPriceCode(Movie.REGULAR);
        assertEquals(movie.getPriceCode(), Movie.REGULAR);
    }
}