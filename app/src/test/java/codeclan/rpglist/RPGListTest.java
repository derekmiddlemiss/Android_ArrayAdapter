package codeclan.rpglist;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by derekmiddlemiss on 09/08/2017.
 */

public class RPGListTest {

    @Test
    public void getListTest(){
        RPGList rpgList = new RPGList();
        ArrayList< RPG > list = rpgList.getList();
        assertEquals( 10, list.size() );
    }
}
