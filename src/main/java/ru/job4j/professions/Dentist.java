package ru.job4j.professions;

public class Dentist extends Doctor {
    private String dentistType;

    public Dentist(String name, String surname, String education, String birthday, String diagnosis, String dentistType) {
        super(name, surname,education, birthday, diagnosis);
        this.dentistType = dentistType;
    }

    public String getDentistType() {
        return this.dentistType;
    }
}
