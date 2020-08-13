package domain;

import java.io.Serializable;

/**
 * 用户的实体类
 *
 * @author lily
 * */
public class User implements Serializable {
    private Integer id;
    private String  name;
    private String  password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return "user";
    }

}
