package com.company;

import java.util.Comparator;

public class GenderComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student)o1;
        Student s2=(Student)o2;
        Sex gender1=s1.getGender();
        Sex gender2=s2.getGender();
        if(gender1.compareTo(gender2)>0){
            return 1;
        }
        if(gender1.compareTo(gender2)<0){
            return -1;
        }
        return 0;
    }
}
