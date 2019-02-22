package com.geekbrains.entities;


public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String[] programmingLanguages;

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }    

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }    

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }    
}
