package homework2;
//У нас в доме живут домашние животные. Попробуйте в этой задаче создать класс Pet
//и записать ему в наследники Cat и Dog. Определите, какие характеристики и поведение ваших питомцев
//общие, а какие проявляются только у конкретного типа.

public class Pet {
    private String name;
    private int age;
    private String breed;

    public Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;

}
    // Общие методы для всех питомцев
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println(name + " is making a sound.");
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
// Класс Cat, наследник Pet
class Cat extends Pet {
    private boolean isIndoorCat;

    public Cat(String name, int age, String breed, boolean isIndoorCat) {
        super(name, age, breed);
        this.isIndoorCat = isIndoorCat;
    }

    // Специфическое поведение для котов
    public void purr() {
        System.out.println(getName() + " is purring.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }

    public boolean isIndoorCat() {
        return isIndoorCat;
    }

    public void setIndoorCat(boolean indoorCat) {
        isIndoorCat = indoorCat;
    }
}

// Класс Dog, наследник Pet
class Dog extends Pet {
    private boolean isTrained;

    public Dog(String name, int age, String breed, boolean isTrained) {
        super(name, age, breed);
        this.isTrained = isTrained;
    }

    // Специфическое поведение для собак
    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }
}

