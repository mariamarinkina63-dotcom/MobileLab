public abstract class Car implements Comparable<Car> {
    protected String brand;       // марка
    protected String model;       // модель
    protected double price;       // стоимость в рублях
    protected double fuelConsumption; // расход топлива (л/100 км)
    protected double maxSpeed;    // максимальная скорость (км/ч)

    // Конструктор — метод, который вызывается при создании новой машины.
    public Car(String brand, String model, double price, double fuelConsumption, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    // Геттеры — методы, чтобы безопасно получать значения свойств.
    public double getPrice() { return price; }
    public double getFuelConsumption() { return fuelConsumption; }
    public double getMaxSpeed() { return maxSpeed; }

    // Этот метод позволяет сортировать машины. Мы говорим Java:
    // "Сравнивай две машины по расходу топлива".
    @Override
    public int compareTo(Car other) {
        return Double.compare(this.fuelConsumption, other.fuelConsumption);
    }

    // Этот метод мы переопределим в каждом дочернем классе,
    // чтобы красиво выводить информацию о машине.
    @Override
    public abstract String toString();
}