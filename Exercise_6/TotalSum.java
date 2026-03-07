import java.util.Scanner;
class TotalSum{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("how many number to be added : ");
    int n = input.nextInt();
    int sum = 0;
    for(int i = 1; i<=n; i++){
        System.out.print("enter the " + i + " number : ");
        int num = input.nextInt();
        sum = sum + num ;
    }
    System.out.println("the total sum of the number entered is : " +sum );
    }

}