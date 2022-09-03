package Service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class ServiceCarImpl implements ServiceCar {
    @Override
    public List<Car> getCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "BMW", "Black"));
        carList.add(new Car(2, "Ferrari", "Black"));
        carList.add(new Car(3, "Mercedes", "White"));
        carList.add(new Car(4, "Ford", "Red"));
        carList.add(new Car(5, "Skoda", "Black"));
        return carList;
    }

    public List<Car> findCars (int num) {
        List<Car> temp = new ServiceCarImpl().getCars();
        if(num < 5) {
            List<Car> cars = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                cars.add(temp.get(i));
            }
            return cars;
        }
        return temp;
    }
}