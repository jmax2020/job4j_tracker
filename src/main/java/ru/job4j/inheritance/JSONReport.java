package ru.job4j.inheritance;

import java.sql.SQLOutput;

public class JSONReport extends TextReport{

    @Override
    public String generate(String name, String body) {
        return '{' + System.lineSeparator() +
                " \"name\" : \"" + name + "\"" + System.lineSeparator() +
                " \"body\" : \"" + body + "\"" + System.lineSeparator() +
                '}';
    }

    public static void main(String[] args) {
        JSONReport json = new JSONReport();
        String text = json.generate("max", "factor");
        System.out.println(text);
    }
}
