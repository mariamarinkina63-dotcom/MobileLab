package mobile;

public class Mobile {
    // свойства самого БРЕНДА (например, Samsung или Apple)
    private String brand;
    private String country;

    public Mobile(String brand, String country) {
        this.brand = brand;
        this.country = country;
    }

    public class PhoneModel {
        private String modelName;
        private double price;
        private int ram; // оперативная память в ГБ

        public PhoneModel(String modelName, double price, int ram) {
            this.modelName = modelName;
            this.price = price;
            this.ram = ram;
        }

        public void printInfo() {

            System.out.println("Бренд: " + brand + " (" + country + ")");
            System.out.println("  Модель: " + modelName);
            System.out.println("  Цена: " + price + " руб.");
            System.out.println("  ОЗУ: " + ram + " ГБ");
            System.out.println("-------------------------");
        }
    }
}