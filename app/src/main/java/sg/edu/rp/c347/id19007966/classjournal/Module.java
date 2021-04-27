package sg.edu.rp.c347.id19007966.classjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.Serializable;
import java.util.ArrayList;

public class Module implements Serializable {
    private String module;
    private String module_name;
    private ArrayList<Week> weeks;

    public Module(String module, String module_name, ArrayList<Week> weeks) {
        this.module = module;
        this.module_name = module_name;
        this.weeks = weeks;
    }
    public String getModule() {
        return module;
    }
    public String getModule_name() {
        return module_name;
    }
    public ArrayList<Week> getWeeks() {
        return weeks;
    }
}