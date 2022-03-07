package Entities;

import java.io.Serializable;

public class Subjects implements Serializable {

    private String code, description;

    public Subjects( String code, String description){

        super();
        this.code = code;
        this.description = description;
    }

    public Subjects(){
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
