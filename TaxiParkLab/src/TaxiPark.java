import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class TaxiPark {
    private static final Logger logger = Logger.getLogger(TaxiPark.class.getName());

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
        logger.info("Добавлена машина: " + car);
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Car car : cars) {
            total += car.getPrice();
        }
        logger.info("Общая стоимость автопарка: " + total + " руб.");
        return total;
    }

    public void sortByFuelConsumption() {
        // Метод Collections.sort использует наш compareTo из класса Car.
        Collections.sort(cars);
        logger.info("--- Автомобили отсортированы по расходу топлива (от меньшего к большему) ---");
        for (Car car : cars) {
            logger.info(car.toString());
        }
    }

    public void findCarsBySpeedRange(double minSpeed, double maxSpeed) {
        logger.info("--- Поиск автомобилей со скоростью от " + minSpeed + " до " + maxSpeed + " км/ч ---");
        boolean found = false;
        for (Car car : cars) {
            if (car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed) {
                logger.info("Найден: " + car);
                found = true;
            }
        }
        if (!found) {
            logger.warning("Автомобилей с такой скоростью не найдено.");
        }
    }
}