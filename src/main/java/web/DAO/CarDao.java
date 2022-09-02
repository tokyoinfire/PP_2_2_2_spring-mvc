package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {
    private final List<Car> list = new ArrayList<>(5);

    {
        list.add(new Car("BMW", "X5", 456));
        list.add(new Car("Mercedes-Benz", "Q7", 890));
        list.add(new Car("Honda", "TResolver", 178));
        list.add(new Car("Toyota", "HT4", 904));
        list.add(new Car("Mitsubishi", "Lancer", 758));
    }

    public List<Car> getList() {
        return list;
    }
}
