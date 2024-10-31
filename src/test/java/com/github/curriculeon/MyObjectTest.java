package com.github.curriculeon;

import org.junit.Test;

public class MyObjectTest {

    @Test
    public void testWithConstructorWithArguments() {
        final String name = "Leon";
        final long id = 10L;
        final Person person = new Person(id, name);


        assert person.getName() != null;
        assert person.getId() != null;
        assert name.equalsIgnoreCase(person.getName());
        assert id == person.getId();
    }

    @Test
    public void testWithConstructor() {
        final String name = "Leon";
        final long id = 10L;
        final Person person = new Person();


        assert person.getName() == null;
        assert person.getId() == null;

        person.setName(name);
        assert person.getName() != null;
        assert name.equalsIgnoreCase(person.getName());


        person.setId(id);
        assert person.getId() != null;
        assert id == person.getId();
    }
}