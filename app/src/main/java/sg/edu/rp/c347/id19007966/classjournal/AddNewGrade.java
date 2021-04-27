package sg.edu.rp.c347.id19007966.classjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AddNewGrade extends AppCompatActivity {
    Button btnSubmit;
    RadioGroup rg;
    TextView tvWeek;
    int week = 0;
    String wkString = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_grade);

        btnSubmit = findViewById(R.id.btnSubmit);
        tvWeek = findViewById(R.id.tvWeek);
        rg = findViewById(R.id.rgGrade);

        Intent i = getIntent();
        week = i.getIntExtra("week",0);
        week += 1;
        String wkNumb = Integer.toString(week);
        tvWeek.setText("week " + wkNumb);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedButtonID = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton) rg.getChildAt(rg.indexOfChild(rg.findViewById(rg.getCheckedRadioButtonId())));

                Intent i = new Intent();
                i.putExtra("grade", rb.getText().toString());

                setResult(RESULT_OK, i);
                finish();

            }
        });


    }
}