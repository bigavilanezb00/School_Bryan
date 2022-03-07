package Entities;

import java.io.Serializable;

public class Groups implements Serializable {

    private String code, curriculum;
    private int course;

    public Groups( String code, String curriculum, int course){
        super();
        this.code = code;
        this.curriculum = curriculum;
        this.course = course;
    }

    public Groups(){
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

}
