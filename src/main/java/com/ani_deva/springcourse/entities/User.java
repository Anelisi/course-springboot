package com.ani_deva.springcourse.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

    public User() {    }

    public User(Long id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId().equals(user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "User [" +
                "id=" + id +
                ", name= '" + name + '\'' +
                ", email= '" + email + '\'' +
                ", phone= '" + phone + '\'' +
                ", password= '" + password + '\'' +
                ']';
    }
}
