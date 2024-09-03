package org.example.homeworks.homework1;

/*
Класс module_1.lecture_1.Person
Создать класс module_1.lecture_1.Person, который содержит:
переменные fullName, age;
методы move() и talk(), в которых просто вывести на
консоль сообщение -"Такой-то  module1.lecture1.Person говорит".
Добавьте два конструктора  - module1.lecture1.Person()
 и module1.lecture1.Person(fullName, age).
Создайте два объекта этого класса.
 Один объект инициализируется конструктором module1.lecture1.Person(),
  другой - module1.lecture1.module1.lecture1.Person(fullName, age)

* */

public class Person {
    String fullName;
    int age;

    public Person() {}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(this + " moving");
    }

    public void talk(){
        System.out.println(this +  " talking");
    }
}
