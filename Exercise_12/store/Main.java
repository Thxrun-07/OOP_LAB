// Main.java
package Exercise_12.store;
public class Main {
    public static void main(String[] args) {

        PaymentProcessor standardRegister = new PaymentProcessor();
        ForeignPaymentProcessor touristRegister = new ForeignPaymentProcessor();
        standardRegister.processPayment(50.0);
        standardRegister.processPayment(100.0, "Visa");
        touristRegister.processPayment(50.0);
    }
}