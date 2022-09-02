package web.service;

import org.springframework.stereotype.Component;
import web.DAO.CarDao;
import web.model.Car;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    private final CarDao carDao = new CarDao();

    @Override
    public List<Car> getCarsFromList(int count) {
        List<Car> cars = carDao.getList();
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
