class Device {
    Device(String brand) {
        System.out.println("Device brand is: " + brand);
    }
}

class Smartphone extends Device {
    Smartphone(String brand, String model) {
        super(brand);
        System.out.println("Smartphone model is: " + model);
    }
}

public class SingleInhertance {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Apple", "iPhone 15");
    }
}