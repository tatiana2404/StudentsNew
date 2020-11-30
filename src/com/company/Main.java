package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class Main {

    public static void main(String[] args) {
        Student s1=new Student();
        Group group= new Group();
        Group voen= new Group();
        int optionn=showMenu();
        try{
            do {
                switch (optionn) {
                    case 1:
                        try{
                        group.addStudent(s1);
                        break;
                        }catch (InputMismatchException | IllegalArgumentException e){
                            System.out.println("Введены некоректные данные");
                        }

                    case 2:
                        group.sortSurname();
                        System.out.println(group);
                        break;
                    case 3:
                        group.sortSurnameGender();
                        System.out.println(group);
                        break;
                    case 4:
                        voen.setGroup(group.otbor());
                        System.out.println(voen.toString());
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Выберите правильный номер");
                        showMenu();
                }
                optionn=showMenu();
            } while (optionn != 5);
            System.out.println("Спасибо");
        } catch (MyNewException e){
            System.out.println("Индекс за пределами массива."+e);
        }
        System.out.println(group.toString());
    }
    public static int showMenu() {

        int optionn = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1. Добавить студента в группу");
        System.out.println("2. Отсортировать по фамилии");
        System.out.println("3. Отсортировать по полу");
        System.out.println("4. Вывести призывников");
        System.out.println("5. Выход");
        System.out.println("Введите ваш выбор:");
        optionn = keyboard.nextInt();

        return optionn;

    }
}
