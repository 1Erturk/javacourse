import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<String> cities= new ArrayList<String>();
        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Izmir");*/

        MyList<Customer> cities= new MyList<Customer>();
        cities.add(new Customer());
        cities.add(new Customer());
    }
}