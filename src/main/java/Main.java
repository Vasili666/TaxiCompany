import car.Business;
import car.Car;
import car.Economy;
import car.VIP;
import type.carProducer;
import type.carType;

import java.util.Arrays;
import java.util.List;

//        Таксопарк. Определить иерархию легковых автомобилей. Создать таксопарк.
//        Подсчитать стоимость автопарка. Провести сортировку автомобилей парка по расходу топлива.
//        Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.

public class Main {

    static List<Car> cars = Arrays.asList(
            new Economy(carProducer.Citroen,"C5", 15_000, 180, 8, carType.ECONOMY),
            new Economy(carProducer.Citroen,"C6",20_000,190,9,carType.ECONOMY),
            new Economy(carProducer.Renault,"Laguna",14_000,175,7,carType.ECONOMY),
            new Business(carProducer.BMW,"Serie 5", 30_000,220,15,carType.BUSINESS),
            new Business(carProducer.BMW,"Serie 5", 35_000, 230, 17,carType.BUSINESS ),
            new Business(carProducer.Audi,"A6", 32_000,195,12,carType.BUSINESS),
            new VIP(carProducer.Bentley,"Mulsanne", 250_000, 295,23,carType.VIP),
            new VIP(carProducer.RollsRoyce, "Phantom", 300_000, 250,27, carType.VIP)
    );


    public static void main (String[] args){

        TaxiCompany taxiCompany= new TaxiCompany(cars);
        System.out.println(taxiCompany);
        System.out.println("Total Cost Of TaxiCompany: "+ taxiCompany.CalculateCostOfTaxiCompany(cars));
        System.out.println("Sort cars by fuel consumption: " + taxiCompany.sortCarsByFuelConsumption().toString());
        System.out.println("Choose cars by specific speed range: "+taxiCompany.chooseCarBySpecificSpeedRange(cars, 195, 250));

    }

}
