package homework6;
//Есть класс Дом и в нем живет много объектов типа Житель.
//У Дома так же есть объекты Крыша, Стены, Окна, Двери.
//Создайте класс для сущности Дом и ассоциированные с ними объекты, входящие в него.
//Подумайте какие из них агрегируются с домом, а какие связаны отношением Композиция

public class House {
    private Roof roof;
    private Wall wall;
    private Window window;
    private Door door;

    private Resident[] resident;

    public House(Roof roof, Wall wall, Window window, Door door, Resident[] resident) {
        this.roof = roof;
        this.wall = wall;
        this.window = window;
        this.door = door;
        this.resident = resident;
    }
    public House(){

    }
    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Resident[] getResident() {
        return resident;
    }

    public void setResident(Resident[] resident) {
        this.resident = resident;
    }
}
