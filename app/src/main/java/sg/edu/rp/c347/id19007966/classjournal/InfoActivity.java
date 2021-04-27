package sg.edu.rp.c347.id19007966.classjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        Module module = (Module) intent.getSerializableExtra("module");

        listView = findViewById(R.id.infoList);

        adapter = new InfoAdapter(this, R.layout.info_row, module.getWeeks());

        listView.setAdapter(adapter);

    }
}