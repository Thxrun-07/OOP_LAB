package Exercise_12.store;
class PaymentProcessor {

    void processPayment(double amount) {
        System.out.println("Processing cash payment of Rs." + amount);
    }

    void processPayment(double amount, String cardType) {
        System.out.println("Processing Rs." + amount + " using " + cardType + " credit card");
    }
}