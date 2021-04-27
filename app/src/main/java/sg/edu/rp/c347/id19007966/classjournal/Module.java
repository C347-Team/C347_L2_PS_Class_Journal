package sg.edu.rp.c347.id19007966.classjournal;

import java.util.ArrayList;

public class Module {
    private String code;
    private String description;
    private ArrayList<Week> weeks;

    public Module(String code, String description, ArrayList<Week> weeks) {
        this.code = code;
        this.description = description;
        this.weeks = weeks;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Week> getWeeks() {
        return weeks;
    }
}
