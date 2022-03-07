package Entities;

import java.io.Serializable;

public class Departaments  implements Serializable {

    private int code;
    private String name, phone;

    public Departaments( int code, String name, String phone) {

        super();
        this.code = code;
        this.name = name;
        this.phone = phone;
    }

    public Departaments(){
        super();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
