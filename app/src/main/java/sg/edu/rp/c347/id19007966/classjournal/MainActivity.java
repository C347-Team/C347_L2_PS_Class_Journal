package sg.edu.rp.c347.id19007966.classjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<Module> modules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //startActivity(new Intent(MainActivity.this, InfoActivity.class));

        lv = (ListView) this.findViewById(R.id.lvMain);

        modules = new ArrayList<Module>();
        ArrayList<Week> c349Weeks = new ArrayList<>();

        c349Weeks.add(new Week("A")); // week 1
        c349Weeks.add(new Week("B")); // week 2
        c349Weeks.add(new Week("A")); // week 3

        ArrayList<Week> c347Weeks = new ArrayList<>();

        c347Weeks.add(new Week("A")); // week 1
        c347Weeks.add(new Week("A")); // week 2

        modules.add(new Module("C349", "iPad Programming", c349Weeks,
                "https://web.archive.org/web/20170707141925/http://rp.edu.sg/Module_Synopses/C349_iPad_Programming.aspx"));
        modules.add(new Module("C347", "Android Programming", c347Weeks,
                "https://web.archive.org/web/20170707191742/http://rp.edu.sg/Module_Synopses/C347_Android_Programming_II.aspx"));

        // Link this Activity object, the row.xml layout for
        //  each row and the module String array together
        aa = new MainAdapter(this, R.layout.row, modules);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                intent.putExtra("module", modules.get(i));
                startActivity(intent);
            }
        });
    }
}