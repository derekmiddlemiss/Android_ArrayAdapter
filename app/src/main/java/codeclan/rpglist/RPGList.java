package codeclan.rpglist;

import java.util.ArrayList;

/**
 * Created by derekmiddlemiss on 09/08/2017.
 */

public class RPGList {

    private ArrayList< RPG > list;

    public RPGList(){
        list = new ArrayList<>();
        list.add( new RPG( "Dungeons and Dragons", "Dave Arneson and Gary Gygax", 1974 ) );
        list.add( new RPG( "Blackmoore", "Dave Arneson", 1975 ) );
        list.add( new RPG( "Boot Hill", "Barry Blume and Gary Gygax", 1975 ) );
        list.add( new RPG( "Empire of the Petal Throne", "M. A. R. Barker", 1975 ) );
        list.add( new RPG( "En Garde!", "Frank Chadwick", 1975 ) );
        list.add( new RPG( "Tunnels and Trolls", "Ken St. Andre", 1975 ) );
        list.add( new RPG( "Bunnies and Burrows", "B. Dennis Sustare and Scott Robinson", 1976 ) );
        list.add( new RPG( "Chevalier", "Edward E. Simbalist and Wilf K. Backhaus", 1976 ) );
        list.add( new RPG( "Metamorphosis Alpha", "James M. Ward and Slade Henson", 1976 ) );
        list.add( new RPG( "Traveller", "Marc W. Miller", 1977 ) );
    }

    public ArrayList< RPG > getList(){
        return new ArrayList< RPG >( list );
    }

}
