package ru.job4j.professions;


public class Surgeon extends Doctor {
    private String bodyPart;

    public Surgeon(String name, String surname, String education, String birthday, String diagnosis, String bodyPart) {
        super(name, surname, education, birthday, diagnosis);
        this.bodyPart = bodyPart;
    }

    public String getBodyPart() {
        return this.bodyPart;
    }
}
