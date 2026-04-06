abstract class Appliance {
    void plugIn() {
        System.out.println("Connected to power.");
    }
    abstract void startWork();
}

class WashingMachine extends Appliance {
    void startWork() {
        System.out.println("Tumbling clothes in soapy water.");
    }
}

public class PartialAbstraction {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.plugIn();
        wm.startWork();
    }
}