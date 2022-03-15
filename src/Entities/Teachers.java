package Entities;

import java.io.Serializable;

public class Teachers implements Serializable {

    private int id;
    private String firstname, lastname, email;



    private Departaments department;

    public Teachers( int id, String firstname,
                     String lastname, String email, Departaments department){
        super();
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.department = department;
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

    public Departaments getDepartment() {
        return department;
    }

    public void setDepartment(Departaments department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", department=" + department +
                '}';
    }
}
