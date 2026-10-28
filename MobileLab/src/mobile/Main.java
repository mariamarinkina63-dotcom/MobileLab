package mobile;

public class Main {
    public static void main(String[] args) {

        Mobile samsung = new Mobile("Samsung", "Южная Корея");
        Mobile apple = new Mobile("Apple", "США");

        Mobile.PhoneModel galaxyS23 = samsung.new PhoneModel("Galaxy S23 Ultra", 120000, 12);
        Mobile.PhoneModel galaxyA54 = samsung.new PhoneModel("Galaxy A54", 35000, 8);

        Mobile.PhoneModel iphone15 = apple.new PhoneModel("iPhone 15 Pro", 130000, 8);

        galaxyS23.printInfo();
        galaxyA54.printInfo();
        iphone15.printInfo();
    }
}