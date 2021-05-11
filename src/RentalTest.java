import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {

    private Movie movie;
    private Rental rental;

    @Before
    public void setUp(){
        movie = new Movie("test", Movie.REGULAR);
        rental = new Rental(movie, 4);
    }

    @Test
    public void getDaysRented(){
        assertEquals(rental.getDaysRented(), 4);
    }

    @Test
    public void getMovie(){
        assertEquals(rental.getMovie().getTitle(), movie.getTitle());
        assertEquals(rental.getMovie().getPriceCode(), movie.getPriceCode());
    }
    @Test
    public void getFee(){
        assertEquals(rental.getFee(), 5, 0);
    }
}