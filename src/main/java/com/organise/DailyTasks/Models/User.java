package com.organise.DailyTasks.Models;

public class User {

    private String fName;
    private String lName;
    private int birthYear;

    public User(String fName, String lName, int birthYear) {
        this.fName = fName;
        this.lName = lName;
        this.birthYear = birthYear;
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
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
