package Entities;

import java.io.Serializable;

public class Subjects implements Serializable {

    private String  description;
    private int code;

    public Subjects( int code, String description){

        super();
        this.code = code;
        this.description = description;
    }

    public Subjects(){
        super();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
