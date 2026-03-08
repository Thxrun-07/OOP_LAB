package food_delivery;
import food_delivery.Restraunt;
import food_delivery.Customer;
import java.util.*;
public class delivery_System {
    public List<Customer> customers_db = new ArrayList<>();
    public List<Restraunt> restraunt_db  = new ArrayList<>();
    public List<String> currentUser;
    
    public void Login(List<String> credentials){
        if(credentials!=null){
            currentUser.add(credentials.get(0));
            currentUser.add(credentials.get(2));
            System.out.println("Ok User is now Logged In");
        }
    }
    public void Restraunts_add(){

    }

}
