package ru.job4j.professions;

public class Programmer extends Engineer{
    private String language;

    public Programmer(String name, String surname, String education, String birthday, String categories, String language) {
        super(name, surname, education, birthday, categories);
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }
}
