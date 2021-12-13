package com.easeeve.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1234567L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username", unique = true)
    private String userName;

    @Column(name = "email")
    private String userEmail;

    @Column(name="user_type")
    private String userType;

    @Column(name = "password")
    private String userPassword;

    @Column(name = "created_ts")
    private Timestamp createdTs;

    @Column(name = "updated_ts")
    private Timestamp updatedTs;

    @Column(name = "deleted_ts")
    private Timestamp deletedTs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Timestamp getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(Timestamp createdTs) {
        this.createdTs = createdTs;
    }

    public Timestamp getUpdatedTs() {
        return updatedTs;
    }

    public void setUpdatedTs(Timestamp updatedTs) {
        this.updatedTs = updatedTs;
    }

    public Timestamp getDeletedTs() {
        return deletedTs;
    }

    public void setDeletedTs(Timestamp deletedTs) {
        this.deletedTs = deletedTs;
    }

    public User() {}

    public User(String userName, String userEmail, String userType, String userPassword, Timestamp createdTs, Timestamp updatedTs, Timestamp deletedTs) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userType = userType;
        this.userPassword = userPassword;
        this.createdTs = createdTs;
        this.updatedTs = updatedTs;
        this.deletedTs = deletedTs;
    }

}
