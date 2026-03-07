import java.util.*;
public class PalindromeNumber{
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
    System.out.println("enter the number to check palindrome");
    int num = input.nextInt();
    int orgnum = num;
    int revnum = 0;
    int len = String.valueOf(num).length();
    do{
        int last = orgnum % 10;
        revnum = (revnum*10)+last;
        orgnum = orgnum/10;
        len--;
    }
    while(len>0);
    if(num == revnum){
        System.out.println("the number given is Palindrome number");
    }
    else{
        System.out.println("the number given is not Palindrome number");
    }
    }
   
}