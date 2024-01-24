import java.util.ArrayList;
import java.util.List;


public class ArrayListMain {

    public static void main(String[] args) {

        //ArrayList<String> arrayList= new ArrayList<String>();
        List<String> list= new ArrayList<String>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        //System.out.println(list.get(0));
        //System.out.println(list.get(2));
        //System.out.println(list.get(4));  //Hata verir

        System.out.println("*******************************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("*******************************");

        list.remove("Java");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
