public class Sedan extends Car {
    public Sedan(String brand, String model, double price, double fuelConsumption, double maxSpeed) {

        super(brand, model, price, fuelConsumption, maxSpeed);
    }

    @Override
    public String toString() {
        return String.format("Седан: %s %s | Цена: %.0f | Расход: %.1f л/100км | Макс. скорость: %.0f",
                brand, model, price, fuelConsumption, maxSpeed);
    }
}