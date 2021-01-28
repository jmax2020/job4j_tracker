package ru.job4j.pojo;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setModel("Q5");
        first.setOwner("audio");
        first.setCode("525");
        first.setCreated(new Date());
        License second = new License();
        second.setModel("Q5");
        second.setOwner("audio");
        second.setCode("525");
        second.setCreated(new Date());
        assertThat(first, is(second));
    }
}