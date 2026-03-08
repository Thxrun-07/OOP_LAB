import java.util.Scanner;

class ShoppingBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double final_bill = 0.0;
        System.out.print("enter the number of items: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(" details for item " + i  );
            System.out.print("enter item name: ");
            String itemName = input.next(); 
            System.out.print("enter price per item: ");
            double price = input.nextDouble();
            System.out.print("enter quantity purchased: ");
            int quantity = input.nextInt();
            double items_cost = price * quantity;
            System.out.println("total cost for " + itemName + ": " + items_cost);
            final_bill = final_bill + items_cost;
        }
        System.out.println("final total bill mount: " + final_bill);
    }
}