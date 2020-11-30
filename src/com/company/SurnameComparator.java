package com.company;

import java.util.Comparator;

public class SurnameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student)o1;
        Student s2=(Student)o2;
        String surname1=s1.getSurname();
        String surname2=s2.getSurname();
        if(surname1.compareTo(surname2)>0){
            return 1;
        }
        if(surname1.compareTo(surname2)<0){
            return -1;
        }
        return 0;
    }
}
