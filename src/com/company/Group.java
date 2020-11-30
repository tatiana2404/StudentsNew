package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Group implements Voenkom{
    private Student group[] =new Student[10];

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public Student[] getGroup() {
        return group;
    }

    private int k=0;
    public Group(){}

    public void addStudent (Student student) throws MyNewException{

/*        for(int i=0; i<=k; i++){
            if (student.getRecordBook() == group[i].getRecordBook()) {
                System.out.println("Этот студент уже есть в группе");
                break;
            }
        }*/

        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = new Student(AddFact.newSurname(), AddFact.newName(), AddFact.newAge(), AddFact.newGender(),
                        AddFact.newGroup(),  AddFact.newCourse(), AddFact.newRecordBook());

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
