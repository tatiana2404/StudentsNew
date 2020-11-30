package com.company;

public class Student extends Human{
    private String numberGroup;
    private int course;
    private String recordBook;
    public Student(){}
    public Student(String surname, String name, int age, Sex gender, String numberGroup,   int course, String recordBook){
        super(surname, name, age, gender);
        this.numberGroup=numberGroup;
        this.course=course;
        this.recordBook=recordBook;
    }
    public String getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(String group) {
        this.numberGroup = group;
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
        return "Студент " +super.toString()+
                ", group='" + numberGroup + '\'' +
                ", course=" + course +
                ", recordBook='" + recordBook + '\'' +
                ", gender=" + gender;
    }
}
