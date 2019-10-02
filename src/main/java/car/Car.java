package car;

import type.carProducer;

import java.util.Objects;

public abstract class Car {
// Создаем переменные для родительского абстрактного класса Car
private type.carProducer carProducer;
private String model;
private int costCar;
private int maxSpeed;
private int fuelConsumption;
// Создаем конструктор
public Car(carProducer producer, String model, int costCar, int maxSpeed, int fuelConsumption){
    this.carProducer = producer;
    this.model=model;
    this.costCar = costCar;
    this.maxSpeed=maxSpeed;
    this.fuelConsumption=fuelConsumption;

}
// Геттеры и сеттеры
//    public String getCarProducer() {
//        return carProducer;
//    }
//
//    public void setCarProducer(String carProducer) {
//        this.carProducer = carProducer;
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCostCar() {
        return costCar;
    }

    public void setCostCar(int costCar) {
        this.costCar = costCar;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    public String toString() {
        return "Car("
                + carProducer+
                " " + model  +
                ", cost:" + costCar +
                ", maxSpeed:" + maxSpeed +
                ", fuelConsumption:" + fuelConsumption +")";
    }

    public boolean equals(Object o) {
        if (this == o)
            if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return costCar == car.costCar &&
                maxSpeed == car.maxSpeed &&
                fuelConsumption == car.fuelConsumption &&
                Objects.equals(model, car.model)&&
                Objects.equals(carProducer, car.carProducer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carProducer, model, costCar, maxSpeed, fuelConsumption);
    }
}
