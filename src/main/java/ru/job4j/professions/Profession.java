package ru.job4j.professions;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession(String name, String surname, String education, String birthday) {
        this.birthday = birthday;
        this.education = education;
        this.surname = surname;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getEducation() {
        return this.education;
    }

    public String getBirthday() {
        return this.birthday;
    }
}
