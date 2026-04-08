package Exercise_12.store;
class ForeignPaymentProcessor extends PaymentProcessor {

    void processPayment(double amount) {
        double newAmount = amount * 1.05;
        System.out.println("Processing foreign cash payment of Rs." + newAmount + " (includes 5% fee)");
    }
}
