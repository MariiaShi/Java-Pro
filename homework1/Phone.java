package org.example.homeworks.homework1;
//Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//Вызвать эти методы для каждого из объектов

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        public String getNumber() {
            return number;
        }

        public String getModel () {
            return model;
        }

        public double getWeight () {
            return weight;
        }

        public void receiveCall (String name){
            System.out.println("Звонит " + name);
        }

        public void displayInfo () {
            System.out.println("Number: " + number);
            System.out.println("Model: " + model);
            System.out.println("Weight: " + weight);
        }

    }

}
