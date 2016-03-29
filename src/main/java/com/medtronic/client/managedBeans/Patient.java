package com.medtronic.client.managedBeans;

/**
 * Created by myPC on 26. 3. 2016.
 */
public class Patient {
    private Long id;
    private PatientType type;
    private String firstName;
    private String surName;
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PatientType getType() {
        return type;
    }

    public void setType(PatientType type) {
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
