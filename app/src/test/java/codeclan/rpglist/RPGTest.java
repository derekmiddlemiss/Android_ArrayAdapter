package codeclan.rpglist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by derekmiddlemiss on 09/08/2017.
 */

public class RPGTest {

    RPG clockwork;

    @Before
    public void before(){
        clockwork = new RPG( "Clockwork and Chivalry", "Peter Cakebread and Ken Walton", 2013 );
    }

    @Test
    public void testTitle(){
        assertEquals( "Clockwork and Chivalry", clockwork.getTitle() );
    }

    @Test
    public void testAuthors(){
        assertEquals( "Peter Cakebread and Ken Walton", clockwork.getAuthors() );
    }

    @Test
    public void testYear(){
        assertEquals( 2013, clockwork.getYear() );
    }

}
