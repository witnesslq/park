package com.park.enity;

/**
 * User enity
 * 用户
 * 数据库实体
 * Created by ansore on 16-9-11.
 */
public class User {

    private String telephone;
    private String password;
    private String username;
    private String palte;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPalte() {
        return palte;
    }

    public void setPalte(String palte) {
        this.palte = palte;
    }
}
