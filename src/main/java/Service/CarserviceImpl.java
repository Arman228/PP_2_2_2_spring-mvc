package Service;

import Model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarserviceImpl {
    private List<Car> cars;

    {
        cars.add(new Car("Mazda", 6, "bussines"));
        cars.add(new Car("Bmw", 3, "comfort"));
        cars.add(new Car("Chevrole", 1, "econom"));
        cars.add(new Car("Mers", 5, "ultimate"));
        cars.add(new Car("Gir", 5, "comfort"));
        cars.add(new Car("Suzuki", 9, "econom"));
    }


    public List<Car> getCars(int count) {
        if (count >= 5 || count <= 0) {
            return this.cars;
        }
        return cars.stream().limit(count).toList();


    }
}
