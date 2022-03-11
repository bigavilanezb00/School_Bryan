package Entities;

import java.io.Serializable;

public class Groups implements Serializable {

    private String  curriculum;
    private int code,course ;

    public Groups( int code, String curriculum, int course){
        super();
        this.code = code;
        this.curriculum = curriculum;
        this.course = course;
    }

    public Groups(){
        super();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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

    @Override
    public String toString() {
        return "Groups{" +
                "code='" + code + '\'' +
                ", curriculum='" + curriculum + '\'' +
                ", course=" + course +
                '}';
    }
}
