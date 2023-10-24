import java.util.List;

public interface UnitCarManager {
    void addCar(Car car);

    void removeCar(String id);

    List<Car> getCars();
}
