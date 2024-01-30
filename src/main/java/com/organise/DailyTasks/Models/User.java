package com.organise.DailyTasks.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String fName;
    private String lName;

    private String email;

    private String password;
//    @Field("dailyThoughts")
    private List<DailyThoughts> dailyThoughts;



    public User() {

    }

    public User(String fName, String lName, String email, String password, List<DailyThoughts> dailyThoughts) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.dailyThoughts = dailyThoughts;
    }

    public String getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public List<DailyThoughts> getDailyThoughts() {
        return dailyThoughts;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDailyThoughts(List<DailyThoughts> dailyThoughts) {
        this.dailyThoughts = dailyThoughts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dailyThoughts=" + dailyThoughts +
                '}';
    }

    public String getUsername() {
        return fName;
    }



}

// ToDo: Validation
//  - check if birthYear is within a reasonable range.
//  read up on 'Serializable' an dif it is necessary for user

