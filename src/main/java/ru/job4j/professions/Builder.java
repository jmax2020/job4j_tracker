package ru.job4j.professions;


public class Builder extends Engineer{
    private String buildType;

    public Builder(String name, String surname, String education, String birthday, String categories, String buildType) {
        super(name, surname, education, birthday, categories);
        this.buildType = buildType;
    }

    public String getBuildType() {
        return this.buildType;
    }
}
