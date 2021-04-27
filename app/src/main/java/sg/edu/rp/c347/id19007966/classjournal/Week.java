package sg.edu.rp.c347.id19007966.classjournal;

import java.io.Serializable;

public class Week implements Serializable {
    private String grade;

    public Week(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}
