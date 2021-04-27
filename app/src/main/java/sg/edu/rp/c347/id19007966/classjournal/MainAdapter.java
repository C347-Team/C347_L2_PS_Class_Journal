package sg.edu.rp.c347.id19007966.classjournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MainAdapter extends ArrayAdapter<Module> {


    private ArrayList<Module> module;
    private Context context;
    private TextView tvModule;
    private TextView tvModule_name;

    public MainAdapter(Context context, int resource, ArrayList<Module> objects){
        super(context, resource, objects);
        // Store the module that is passed to this adapter
        module = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvModule = (TextView) rowView.findViewById(R.id.tvModule);
        // Get the ImageView object
        tvModule_name = (TextView) rowView.findViewById(R.id.tvModule_name);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Module currentModule = module.get(position);
        // Set the TextView to show the food

        tvModule.setText(currentModule.getModule());
        // Set the image to star or nostar accordingly
        tvModule_name.setText(currentModule.getModule_name());
        // Return the nicely done up View to the ListView
        return rowView;
    }
}