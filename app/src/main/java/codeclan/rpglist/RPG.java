package codeclan.rpglist;

/**
 * Created by derekmiddlemiss on 09/08/2017.
 */

public class RPG {

    private int year;
    private String title;
    private String authors;

    public RPG( String title, String authors, int year ){
        this.title = title;
        this.authors = authors;
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthors(){
        return this.authors;
    }

    public int getYear(){
        return this.year;
    }

}
