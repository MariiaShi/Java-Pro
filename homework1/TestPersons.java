package org.example.homeworks.homework1;

public class TestPersons {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Aleksandr", 30);

        person1.move();
        person2.move();
        person1.talk();
        person2.talk();
    }
}
