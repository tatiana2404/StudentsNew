package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Group implements Voenkom{
    private Student group[] =new Student[10];
    private String nameGroup;

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public Student[] getGroup() {

        return group;
    }

    public String getNameGroup() {
        Scanner s=new Scanner(System.in);
        System.out.println("Введите название группы");
        nameGroup=s.nextLine();
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    private int k=0;
    public Group(){}

    public void addStudent (Student student) throws MyNewException{

        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = new Student(AddFact.newSurname(), AddFact.newName(), AddFact.newAge(), AddFact.newGender(),
                        AddFact.newCourse(), AddFact.newRecordBook());

                k++;
                System.out.println("Студент успешно добавлен в группу. В группе "+k+" студ.");
                return;
            }

        }

        throw new MyNewException();
    }

    public Student[] sortSurname(){
        Arrays.sort(group, Comparator.nullsFirst(new SurnameComparator()));
            return group;
    }
    public Student[] sortSurnameGender(){
        Arrays.sort(group, Comparator.nullsFirst(new GenderComparator()));
        return group;
    }

    public Student findStudent(){
        Scanner str=new Scanner(System.in);
        str.nextLine();
        System.out.println("Введите фамилию студента, которого хотите найти: ");
        String line = str.nextLine();
        for(int i=0; i<group.length;i++){
            if(group[i]!=null && line.equals(group[i].getSurname()))
            {
                System.out.println("Студент найден.");
                return group[i];
            }
        }
        return null;
    }
    public void deleteStudent(){
        Scanner str=new Scanner(System.in);
        str.nextLine();
        System.out.println("Введите фамилию студента, которого хотите удалить: ");
        String line = str.nextLine();
        for(int i=0; i<group.length; i++){
            if(group[i]!=null && line.equals(group[i].getSurname())){
                group[i]=null;
                k--;
                System.out.println("Студен удалён из этой группы. В группе "+k+" студ.");
            }
        }
    }

    public void saveToFile(){

        try(PrintWriter a=new PrintWriter("D:\\Файлы\\"+getNameGroup()+".csv")){
            a.println("Surname"+";"+"Name"+";"+"Age"+";"+"Gender"+";"+"Course"+";"+"RecordBook");
            for(int i=0;i<group.length;i++){
                if(group[i]!=null){
                a.println(group[i].getSurname()+";"+group[i].getName()+";"+group[i].getAge()+";"+group[i].getGender()+";"+
                        group[i].getCourse()+";"+group[i].getRecordBook());
                }
            } a.println();
        } catch(FileNotFoundException | NullPointerException e){
            System.out.println("Ошибка");
        }
    }

    @Override
    public Student[] otbor() {
        Student[] voen=new Student[k];
        int n=0;
        for(int i=0; i<k; i++){
            if(group[i].getGender().equals(Sex.man) && group[i].getAge()>18 ){
                voen[0]=group[i];
                n++;
            }
        }
        if (n>0){
            return voen;
        }
        else {
            System.out.println("Таких студентов нет");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Group{" +
                "group=" + Arrays.toString(group) +
                '}';
    }

}
