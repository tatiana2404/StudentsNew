package com.company;

import java.util.Scanner;

public class AddFact {
    public static Scanner str=new Scanner(System.in);

    public static String newSurname(){
        str.nextLine();
        System.out.println("Введите фамилию: ");
        String line = str.nextLine();
        return line;
    }
    public static String newName(){
        System.out.println("Введите имя: ");
        String line = str.nextLine();
        return line;
    }
    public static int newAge(){
        System.out.println("Введите возраст: ");
         int line = str.nextInt();
         return line;
    }
    public static Sex newGender(){
        System.out.println("Введите пол (man/woman): ");
        str.nextLine();
        Sex line=Sex.valueOf(str.nextLine());
        return line;

    }
    public static String newGroup(){
        System.out.println("Введите группу: ");
        if (str.hasNextLine()) {
            String line = str.nextLine();
            return line;
        } else {
            return "Извините, но это явно не строка. Перезапустите программу и попробуйте снова!";
        }
    }

    public static int newCourse(){
        System.out.println("Введите номер курса: ");
        if (str.hasNextLine()) {
            int line = str.nextInt();
            return line;
        } else {
            return 0;
        }
    }
    public static String newRecordBook(){
        System.out.println("Введите номер зачетной книжки: ");
        str.nextLine();
        String line = str.nextLine();
        return line;
    }

}
