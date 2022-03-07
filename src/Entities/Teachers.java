package Entities;

import java.io.Serializable;

public class Teachers implements Serializable {

    private int id, code_dep;
    private String firstname, lastname, email;

    public Teachers( int id, int code_dep, String firstname,
                     String lastname, String email){

        super();
        this.id = id;
        this.code_dep = code_dep;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public  Teachers(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode_dep() {
        return code_dep;
    }

    public void setCode_dep(int code_dep) {
        this.code_dep = code_dep;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
