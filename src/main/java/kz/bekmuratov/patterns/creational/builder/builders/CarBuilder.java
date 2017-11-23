package kz.bekmuratov.patterns.creational.builder.builders;

import kz.bekmuratov.patterns.creational.builder.cars.Car;
import kz.bekmuratov.patterns.creational.builder.cars.Type;
import kz.bekmuratov.patterns.creational.builder.components.Engine;
import kz.bekmuratov.patterns.creational.builder.components.GPSNavigator;
import kz.bekmuratov.patterns.creational.builder.components.Transmission;
import kz.bekmuratov.patterns.creational.builder.components.TripComputer;

/**
 * Конкретные строители реализуют шаги, объявленные в общем интерфейсе.
 */
public class CarBuilder implements Builder {

    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
