import java.util.*;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.print("enter the number to be checked");
        int num = input1.nextInt();
        int i = 2;
        boolean isprime = true;
        if(num < 2){
            isprime = false;
        }
        else{
            while(i*i<=num && isprime){
                if(num % i == 0){
                    isprime = false;
                    break;
                }
                else{
                    i++;
                }
                
            }
        }
        if(isprime){
            System.out.println("the give number is prime");
        }
        else{
           System.out.println("the give number is not prime"); 
        }
    }
}