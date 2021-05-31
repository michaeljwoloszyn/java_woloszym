package sheridan.woloszym.exercise1v1.domain;

import java.io.Serializable;

public class User implements java.io.Serializable {

    private String name = "";
    private String status = "";

    public User() {
    }

    public User(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
