package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student max = new Student();
        Date date = new Date();
        max.setDataReceipt(date);
        max.setFio("Shcherkov Maxim Victorovich");
        max.setGroop("intern");
        System.out.println("Student " + max.getFio() + " started learned at " + max.getDataReceipt() +  " and learn at groop " + max.getGroop());

        Student serg = new Student("Promislov Sergey Maximovich", "student", date);
        System.out.println("Student " + serg.getFio() + " started learned at " + serg.getDataReceipt() +  " and learn at groop " + serg.getGroop());
    }
}
