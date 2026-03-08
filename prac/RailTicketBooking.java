import java.util.*;
class RailTicketBooking{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int avaiableSeats = 0;
        int totalSeats = 100;
        int magicpin = 1947;
        boolean isConfirmed =false;
        int choice = 0;
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1 - bookt ticket");
            System.out.println("2 - cancel ticket");
            System.out.println("3 - check status");
            System.out.println("4 - exit");
            System.out.print("enter your choice : ");
            choice = input.nextInt(); 
            
            switch(choice){
                case 1 ;
                System.out.print("enter magic number: ");
                int enteredPin = input.nextInt();
                if (enteredPin = magicpin){
                    System.out.println("admin access granted");
                    System.out.println("current total capacity: " + totalSeats);
                    System.out.println("Current Available Seats: " + availableSeats);
                        
                    System.out.print("Enter new total seat capacity: ");
                    int newTotal = input.nextInt();
                    int bookedTickets = totalSeats - availableSeats;
                    if (newTotal >= bookedTickets) {
                            totalSeats = newTotal;
                            availableSeats = totalSeats - bookedTickets;
                            System.out.println("Capacity updated successfully!");
                    }
                    else{
                        System.out.println("Failed: Capacity cannot be less than already booked tickets (" + bookedTickets + ").");
                        }
                        break;
                        
                    }
        }

        

    }
}