package homework4.vehicle;

import homework4.PassengerTransport;
import homework4.Repairable;
import homework4.RoadMovable;

public class Bus implements Repairable, PassengerTransport, RoadMovable {
    @Override
    public void service() {
        System.out.println("Автобус проходит сервисное обслуживание.");
    }

    @Override
    public void repair() {
        System.out.println("Автобус ремонтируется.");
    }

    @Override
    public void transportationPassengers() {
        System.out.println("Автобус перевозит пассажиров.");
    }

    @Override
    public void movementRoad() {
        System.out.println("Автобус движется по дороге.");
    }
}
