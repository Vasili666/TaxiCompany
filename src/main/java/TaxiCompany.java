import car.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaxiCompany {




    private List<? extends Car> cars;

    public TaxiCompany(List<Car> cars) {
        this.cars=cars;
    }



    public  int CalculateCostOfTaxiCompany(List<Car> cars){
        int sum=0;
        for (Car car: cars){
            sum=sum+car.getCostCar();
        }
        return sum;
    }


    public TaxiCompany sortCarsByFuelConsumption(){

            Collections.sort(cars, new Comparator<Car>() {

                public int compare(Car car1, Car car2) {
                    return car1.getFuelConsumption() - car2.getFuelConsumption();
                }
            });
            return this;
    }

    public List<Car> chooseCarBySpecificSpeedRange(List<Car> cars, int min, int max){
        List<Car> carsBySpeedRange = new ArrayList<>();
        for(Car car: cars){
            if (car.getMaxSpeed()>=min&& car.getMaxSpeed()<=max){
                carsBySpeedRange.add(car);
            }
        }
        return carsBySpeedRange;
    }

    public String toString() {
        return "TaxiCompany [" +
                "CarsList " + cars.toString() +
                ']';
    }

}
