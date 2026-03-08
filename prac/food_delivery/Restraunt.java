import java.util.*;
public class Restraunt{
    public List<String> menu;
    public void Restraunt(List <String> menu){
        this.menu = menu;
    }
    public void addItem(String item){
        menu.add(item);
    }
    public void removeItem(String item){
        menu.remove(item);
    }
}