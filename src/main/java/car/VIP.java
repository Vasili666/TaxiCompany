package car;

import type.carProducer;
import type.carType;

import java.util.Objects;

public class VIP extends Car{
    private carType type;




    public VIP(carProducer producer, String model, int costCar, int maxSpeed, int fuelConsumption, carType type) {
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
        if (!(o instanceof VIP)) return false;
        if (!super.equals(o)) return false;
        VIP vip = (VIP) o;
        return type == vip.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
