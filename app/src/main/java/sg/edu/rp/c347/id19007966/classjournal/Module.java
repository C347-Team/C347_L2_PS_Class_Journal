package sg.edu.rp.c347.id19007966.classjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.Serializable;

public class Module implements Serializable {
    private String module;
    private String module_name;
    public Module(String module, String module_name) {
        this.module = module;
        this.module_name = module_name;
    }
    public String getModule() {
        return module;
    }
    public String getModule_name() {
        return module_name;
    }

}