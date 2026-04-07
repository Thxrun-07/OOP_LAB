class Thermostat {
    private double temperature;
    private boolean isOn;

    Thermostat() {
        temperature = 72.0;
        isOn = false;
    }
    void turnOn() {
        isOn = true;
    }
    void turnOff() {
        isOn = false;
    }
    double getTemperature() {
        return temperature;
    }
    void setTemperature(double newTemp) {
        if (isOn == false) {
            System.out.println("Cannot change temperature while system is off.");
        }
        else if (newTemp < 50.0 || newTemp > 90.0) {
            System.out.println("Temperature out of safe range.");
        }
        else {
            temperature = newTemp;
        }
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.setTemperature(80.0);
        t.turnOn();
        t.setTemperature(100.0);
        t.setTemperature(75.0);
        System.out.println("Current temperature: " + t.getTemperature());
    }
}