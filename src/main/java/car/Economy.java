package car;

import type.carProducer;
import type.carType;

import java.util.Objects;

public class Economy extends Car{
    private carType type;


    public carType getType() {
        return type;
    }

    public Economy(carProducer producer, String model, int costCar, int maxSpeed, int fuelConsumption, carType type) {
        super(producer, model, costCar, maxSpeed, fuelConsumption);
        this.type=type;

    }
    @Override
    public String toString() {
        return super.toString().replace(")",
                ", type:" + type +
                        ')');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Economy)) return false;
        if (!super.equals(o)) return false;
        Economy economy = (Economy) o;
        return type == economy.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
