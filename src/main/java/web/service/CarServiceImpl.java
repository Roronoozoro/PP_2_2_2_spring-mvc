package web.service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService {
    private static final List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car(1, "BMW", "Black"));
        carList.add(new Car(2, "Ferrari", "Black"));
        carList.add(new Car(3, "Mercedes", "White"));
        carList.add(new Car(4, "Ford", "Red"));
        carList.add(new Car(5, "Skoda", "Black"));
    }

    @Override
    public List<Car> getListCars() {
        return carList;
    }

    @Override
    public List<Car> getCars(Integer count) {

        if (count == null || count > 5) {
            return carList;
        } else {
            return carList.stream().limit(count).collect(Collectors.toList());
        }
    }
}