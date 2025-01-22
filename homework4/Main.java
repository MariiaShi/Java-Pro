package homework4;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.service();
        bus.transportationPassengers();
        bus.movementRoad();

        Truck truck = new Truck();
        truck.service();
        truck.transportationCargoes();

        Ship ship = new Ship();
        ship.swim();
        ship.transportationPassengers();

        Airplane airplane = new Airplane();
        airplane.fly();
        airplane.transportationCargoes();
    }
}
