package sg.edu.rp.c347.id19007966.classjournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class InfoAdapter extends ArrayAdapter<Week> {
    private ArrayList<Week> weeks;
    private Context context;
    private TextView textViewGrade, textViewWeek;

    public InfoAdapter(@NonNull Context context, int resource, ArrayList<Week> weeks) {
        super(context, resource, weeks);
        this.weeks = weeks;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.info_row, parent, false);
        Week week = weeks.get(position);

        textViewGrade = rowView.findViewById(R.id.textViewGrade);
        textViewWeek = rowView.findViewById(R.id.textViewHeader);

        String weekNumber = Integer.toString(position + 1);
        textViewGrade.setText(week.getGrade());
        textViewWeek.setText("week " + weekNumber);

        return rowView;
    }
}
