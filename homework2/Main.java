package homework2;

public class Main {
    // Тестирование классов

        public static void main(String[] args) {
            // Создаем кота
            Cat cat = new Cat("Mittens", 3, "Siamese", true);
            cat.eat();
            cat.makeSound();
            cat.purr();
            System.out.println("Is indoor cat: " + cat.isIndoorCat());

            // Создаем собаку
            Dog dog = new Dog("Buddy", 5, "Labrador", true);
            dog.eat();
            dog.makeSound();
            dog.fetch();
            System.out.println("Is trained: " + dog.isTrained());
        }
    }

