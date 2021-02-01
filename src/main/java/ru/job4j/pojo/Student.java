package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fio;
    private String groop;
    private Date dataReceipt;

    public Student() {
    }

    public Student(String fio, String groop, Date dataReceipt) {
        this.fio = fio;
        this.groop = groop;
        this.dataReceipt = dataReceipt;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getGroop() {
        return groop;
    }

    public void setGroop(String groop) {
        this.groop = groop;
    }

    public Date getDataReceipt() {
        return dataReceipt;
    }

    public void setDataReceipt(Date dataReceipt) {
        this.dataReceipt = dataReceipt;
    }
}
