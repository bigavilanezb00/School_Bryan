package Entities;

import java.io.Serializable;

public class Sessions implements Serializable {

    private String week_day;
    private int starts, finishes, id_teacher, code_group, code_subject;



    private Teachers teacher;
    private Groups group;
    private Subjects subject;



    public Sessions( String week_day,
                     int starts, int finishes, Teachers teacher,Subjects subject, Groups group) {

        super();
        this.week_day = week_day;
        this.starts = starts;
        this.finishes = finishes;
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
                ", starts=" + starts +
                ", finishes=" + finishes +
                ", teachers=" + teacher +
                ", groups=" + group +
                ", subject=" + subject +
                '}';
    }
}
