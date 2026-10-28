public class SUV extends Car {
    public SUV(String brand, String model, double price, double fuelConsumption, double maxSpeed) {
        super(brand, model, price, fuelConsumption, maxSpeed);
    }

    @Override
    public String toString() {
        return String.format("Внедорожник: %s %s | Цена: %.0f | Расход: %.1f л/100км | Макс. скорость: %.0f",
                brand, model, price, fuelConsumption, maxSpeed);
    }
}