
package com.books.api.dto;

import java.util.List;

public class BooksDTO {

    private String id;
    private String name;
    private long bookNumber;
    private String email;
    private List<String> courseList;
    private float gpa;

    public BooksDTO() {
    }

    public BooksDTO(String id, String name, long bookNumber, String email,
                      List<String> courseList, float gpa) {
        this.id = id;
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

    public long getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(long bookNumber) {
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

}
