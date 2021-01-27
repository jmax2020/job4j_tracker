package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String fio;
    private String groop;
    private Date dataReceipt;

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
