package kz.bekmuratov.patters.creational.builder.builders;

import kz.bekmuratov.patters.creational.builder.cars.Type;
import kz.bekmuratov.patters.creational.builder.components.Engine;
import kz.bekmuratov.patters.creational.builder.components.GPSNavigator;
import kz.bekmuratov.patters.creational.builder.components.Transmission;
import kz.bekmuratov.patters.creational.builder.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги
 * конфигурации продукта.
 */
public interface Builder {
    public void setType(Type type);
    public void setSeats(int seats);
    public void setEngine(Engine engine);
    public void setTransmission(Transmission transmission);
    public void setTripComputer(TripComputer tripComputer);
    public void setGPSNavigator(GPSNavigator gpsNavigator);
}
