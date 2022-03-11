package Entities;

import java.io.Serializable;

public class Sessions implements Serializable {

    private String week_day;
    private int starts, finishes, id_teacher, code_group, code_subject;



    private Teachers teacher;
    private Groups group;
    private Subjects subject;



    public Sessions( String week_day, int code_group, int code_subject,
                     int starts, int finishes, int id_teacher, Teachers teacher,Subjects subject, Groups group) {

        super();
        this.week_day = week_day;
        this.code_group = code_group;
        this.code_subject = code_subject;
        this.starts = starts;
        this.finishes = finishes;
        this.id_teacher = id_teacher;
        this.teacher = teacher;
        this.subject= subject;
        this.group = group;
    }

    public Sessions(){
        super();
    }

    public String getWeek_day() {
        return week_day;
    }

    public void setWeek_day(String week_day) {
        this.week_day = week_day;
    }

    public int getCode_group() {
        return code_group;
    }

    public void setCode_group(int code_group) {
        this.code_group = code_group;
    }

    public int getCode_subject() {
        return code_subject;
    }

    public void setCode_subject(int code_subject) {
        this.code_subject = code_subject;
    }

    public int getStarts() {
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    public int getFinishes() {
        return finishes;
    }

    public void setFinishes(int finishes) {
        this.finishes = finishes;
    }

    public int getId_teacher() {
        return id_teacher;
    }

    public void setId_teacher(int id_teacher) {
        this.id_teacher = id_teacher;
    }


    ////////////////
    public Teachers getTeacher() {
        return teacher;
    }

    public void setTeacher(Teachers teacher) {
        this.teacher = teacher;
    }



    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }


    public Subjects getSubject() {
        return subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }



    ////////////////

    @Override
    public String toString() {
        return "Sessions{" +
                "week_day='" + week_day + '\'' +
                ", code_group='" + code_group + '\'' +
                ", code_subject='" + code_subject + '\'' +
                ", starts=" + starts +
                ", finishes=" + finishes +
                ", id_teacher=" + id_teacher +
                '}';
    }
}
