package sg.edu.rp.c347.id19007966.classjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter adapter;
    ArrayList<Week> weeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        listView = findViewById(R.id.infoList);

        weeks = new ArrayList<>();
        // week 1
        weeks.add(new Week("A"));
        weeks.add(new Week("B")); // week 2
        weeks.add(new Week("A")); // week 3

        adapter = new InfoAdapter(this, R.layout.info_row, weeks);

        listView.setAdapter(adapter);

    }
}