package org.example.homeworks.homework1;

public class Main { public static void main(String[] args) {
    // Создание трех экземпляров класса Phone
    Phone phone1 = new Phone("123-456-7890", "Model A", 150.0);
    Phone phone2 = new Phone("987-654-3210", "Model B", 160.0);
    Phone phone3 = new Phone("555-555-5555", "Model C", 170.0);

    // Вывод значений переменных для каждого телефона
    System.out.println("Phone 1:");
    phone1.displayInfo();
    System.out.println();

    System.out.println("Phone 2:");
    phone2.displayInfo();
    System.out.println();

    System.out.println("Phone 3:");
    phone3.displayInfo();
    System.out.println();

    // Вызов методов receiveCall и getNumber для каждого телефона
    System.out.println("Receiving calls:");
    phone1.receiveCall("Alice");
    System.out.println("Number: " + phone1.getNumber());
    System.out.println();

    phone2.receiveCall("Bob");
    System.out.println("Number: " + phone2.getNumber());
    System.out.println();

    phone3.receiveCall("Charlie");
    System.out.println("Number: " + phone3.getNumber());
    System.out.println();
}
}

