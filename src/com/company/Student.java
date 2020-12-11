package com.company;

public class Student extends Human{
    private String numberGroup;
    private int course;
    private String recordBook;
    public Student(){}
    public Student(String surname, String name, int age, Sex gender, int course, String recordBook){
        super(surname, name, age, gender);
        this.course=course;
        this.recordBook=recordBook;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course){
        this.course=course;
    }

    public String getRecordBook() {
        return recordBook;
    }

    public void setRecordBook(String recordBook) {
        this.recordBook = recordBook;
    }
    @Override
    public String toString() {
        return "Студент " +super.toString()+ '\'' +
                ", course=" + course +
                ", recordBook='" + recordBook + '\'' +
                ", gender=" + gender;
    }
}
