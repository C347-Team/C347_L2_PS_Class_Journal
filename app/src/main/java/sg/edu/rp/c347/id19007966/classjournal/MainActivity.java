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
    ArrayList<Module> module;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //startActivity(new Intent(MainActivity.this, InfoActivity.class));

        lv = (ListView) this.findViewById(R.id.lvMain);

        module = new ArrayList<Module>();
        module.add(new Module("C349", "Ipad Programming"));
        module.add(new Module("C347", "Android Programming"));

        // Link this Activity object, the row.xml layout for
        //  each row and the module String array together
        aa = new MainAdapter(this, R.layout.row, module);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                intent.putExtra("module", module.get(i));
                startActivity(intent);
            }
        });
    }
}