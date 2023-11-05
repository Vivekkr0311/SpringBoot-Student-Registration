package com.StudentRegistration.StudentRegistration.StudentEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private Integer rollno;
    private String sname;

    public Integer getRollno() {
        return rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", sname='" + sname + '\'' +
                '}';
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }
}
