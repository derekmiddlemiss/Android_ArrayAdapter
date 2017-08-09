package codeclan.rpglist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by derekmiddlemiss on 09/08/2017.
 */

public class RPGListAdapter extends ArrayAdapter< RPG > {

    public RPGListAdapter( Context context, ArrayList< RPG > list ) {
        super( context, 0, list );
    }

    @Override
    public View getView( int position, View listItemView, ViewGroup parent ) {

        if ( listItemView == null ) {
            listItemView = LayoutInflater.from( getContext() ).
                    inflate( R.layout.list_item, parent, false );
        }

        RPG currentRPG = getItem( position );

        TextView title = (TextView) listItemView.findViewById( R.id.title );
        title.setText( currentRPG.getTitle() );

        TextView year = (TextView) listItemView.findViewById( R.id.year );
        year.setText( String.valueOf( currentRPG.getYear() ) );

        TextView authors = (TextView) listItemView.findViewById( R.id.authors );
        authors.setText( currentRPG.getAuthors() );

        return listItemView;

    }

}
