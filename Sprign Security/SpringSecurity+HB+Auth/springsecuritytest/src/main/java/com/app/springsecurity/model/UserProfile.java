package com.app.springsecurity.model;

import javax.persistence.*;

@Entity
@Table(name="USER_PROFILE")
public class UserProfile {

    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "TYPE", nullable = false, length = 15, unique = true)
    private String type = UserProfileType.USER.getUserProfileType();

    public UserProfile() {
    }

    public UserProfile(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserProfile [id= "+ id +", type= "+type + "]";
    }
}