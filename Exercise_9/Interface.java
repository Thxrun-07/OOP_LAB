interface WiFiEnabled {
    void connectToNetwork();   
}
interface BluetoothEnabled {
    void pairDevice();         
}
class SmartSpeaker implements WiFiEnabled, BluetoothEnabled {
    public void connectToNetwork() {
        System.out.println("Connected to Home_WiFi");
    }
    public void pairDevice() {
        System.out.println("Bluetooth paired to Phone");
    }
}
public class Interface {
    public static void main(String[] args) {

        SmartSpeaker speaker = new SmartSpeaker();
        speaker.connectToNetwork();
        speaker.pairDevice();
    }
}