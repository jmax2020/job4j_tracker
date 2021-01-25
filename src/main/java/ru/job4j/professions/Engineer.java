package ru.job4j.professions;


public class Engineer extends Profession {
    private String categories;

    public Engineer(String name, String surname, String education, String birthday, String categories) {
        super(name, surname, education, birthday);
        this.categories = categories;
    }

    public String getCategories() {
        return this.categories;
    }
}
