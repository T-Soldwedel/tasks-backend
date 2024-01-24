package com.organise.DailyTasks.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    private String fName;
    private String lName;
    private int birthYear;


    public User() {

    }

    public User(String fName, String lName, int birthYear) {
        this.fName = fName;
        this.lName = lName;
        this.birthYear = birthYear;
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

    public int getBirthYear() {
        return birthYear;
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


    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}

// ToDo: Validation
//  - check if birthYear is within a reasonable range.
//  read up on 'Serializable' an dif it is necessary for user

