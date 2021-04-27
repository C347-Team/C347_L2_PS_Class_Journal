package sg.edu.rp.c347.id19007966.classjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class InfoActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter adapter;

    Button btnInfo;
    Button btnAdd;
    Button btnEmail;

    int requestCode = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        Module module = (Module) intent.getSerializableExtra("module");

        listView = findViewById(R.id.infoList);

        btnInfo = findViewById(R.id.buttonInfo);
        btnAdd = findViewById(R.id.buttonAdd);
        btnEmail = findViewById(R.id.buttonEmail);

        adapter = new InfoAdapter(this, R.layout.info_row, module.getWeeks());

        listView.setAdapter(adapter);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // Intent to display data
                Intent rpIntent = new Intent(Intent.ACTION_VIEW);
                // Set the URL to be used.
                rpIntent.setData(Uri.parse(module.getUrl()));
                startActivity(rpIntent);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // The action you want this intent to do;
                // ACTION_SEND is used to indicate sending text
                Intent email = new Intent(Intent.ACTION_SEND);
                // Put essentials like email address, subject & body text
                email.putExtra(Intent.EXTRA_EMAIL,
                        new String[]{"jason_lim@rp.edu.sg"});

                String contents = "Hi faci,\n\n";
                contents += "I am ...\n";
                contents += "Please see my remarks so far, thank you!\n\n";
                for (int i = 0; i < module.getWeeks().size(); i++) {
                    contents += "Week " + (i+1) + ": DG: " + module.getWeeks().get(i).getGrade() + "\n";
                }
                email.putExtra(Intent.EXTRA_TEXT, contents);

                //email.putExtra(Intent.EXTRA_TEXT,
                // This MIME type indicates email
                email.setType("message/rfc822");
                // createChooser shows user a list of app that can handle
                // this MIME type, which is, email
                startActivity(Intent.createChooser(email,
                        "Choose an Email client :"));

            }});

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(InfoActivity.this, AddNewGrade.class);
                //i.putExtra("week", Module.size());
                startActivityForResult(i, requestCode);
            }
        });
    }
}