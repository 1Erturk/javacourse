import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities= new ArrayList<String>();
        cities.add("Ankara");
        cities.add("Istanbul");
        cities.add("Izmir");
        cities.add("Aydın");

        cities.remove("Istanbul");
        Collections.sort(cities);

        for (String city: cities) {
            System.out.println(city);
        }
    }
}