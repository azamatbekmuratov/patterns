package kz.bekmuratov.patterns.creational.builder;

import kz.bekmuratov.patterns.creational.builder.builders.CarBuilder;
import kz.bekmuratov.patterns.creational.builder.builders.CarManualBuilder;
import kz.bekmuratov.patterns.creational.builder.cars.Car;
import kz.bekmuratov.patterns.creational.builder.cars.Manual;
import kz.bekmuratov.patterns.creational.builder.director.Director;

/**
 * Демо-класс. Здесь всё сводится воедино. Порождающий паттерн проектирования Строитель
 */
public class Demo {

    public static void main(String[] args){
        Director director = new Director();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

    }
}
