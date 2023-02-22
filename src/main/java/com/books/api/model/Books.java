package com.books.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Books")
public class Books {
    @Id
    private String id;
    private String name;
    private long bookNumber;
    private String email;
    private List<String> courseList;
    private float gpa;

    public Books() {
    }

    public Books(String name, long bookNumber, String email, List<String> courseList, float gpa) {
        this.name = name;
        this.bookNumber = bookNumber;
        this.email = email;
        this.courseList = courseList;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getbookNumber() {
        return bookNumber;
    }

    public void setbookNumber(long bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bookNumber=" + bookNumber +
                ", email='" + email + '\'' +
                ", courseList=" + courseList +
                ", gpa=" + gpa +
                '}';
    }
}
