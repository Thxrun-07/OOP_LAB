public class DiscountCalc {
    double calculateFinalPrice(int price) {
        System.out.print("The Final price is : ");
        double fprice = price - (price * 0.05);
        return fprice;
    }   
    
    double calculateFinalPrice(int price, float discount) {
        System.out.print("The Final price is : ");
        double fprice = price - (price * discount);
        return fprice;
    }
    
    double calculateFinalPrice(int price, String discount) {
        double fdisc = 0.0;
        
        if (discount.equals("SAVE50")) {
            fdisc = 0.5;
            System.out.print("The Final price is : ");
            double fprice = price - (price * fdisc);
            return fprice; 
        } else {
            System.out.println("invalid parameters");
            return price; // 3. Replaced break; with the original price return
        }
    }

    public static void main(String[] args) {
        DiscountCalc calc = new DiscountCalc();
        
        System.out.println(calc.calculateFinalPrice(5000));
        System.out.println(calc.calculateFinalPrice(5000, 0.5f));
        System.out.println(calc.calculateFinalPrice(5000, "SAVE50"));
        System.out.println(calc.calculateFinalPrice(5000, "SAVE20"));
    }
}