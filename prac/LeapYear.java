public class LeapYear {
    static boolean isleap(int year){
        boolean leap = false;
        if (year %4==0){
            if(year%400==0){
                leap = true;
            } else if (year %100==0){
                leap = false;
            }else {
                leap = true;
            }
        }else{
            leap=false;
        }
        return leap;
    }
    public static void main(String args[]){
        System.out.println(isleap(2024));
        System.out.println(isleap(2025));
        System.out.println(isleap(1945));
    }
}