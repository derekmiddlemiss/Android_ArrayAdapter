package codeclan.rpglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RPGListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpglist);

        RPGList rpgList = new RPGList();
        ArrayList< RPG > list = rpgList.getList();

        RPGListAdapter rpgListAdapter = new RPGListAdapter( this, list );
        ListView listView = (ListView) findViewById( R.id.list );
        listView.setAdapter( rpgListAdapter );

    }
}
