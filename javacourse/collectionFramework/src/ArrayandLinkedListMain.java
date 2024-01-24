import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayandLinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<Integer>();
        ArrayList<Integer> arrayList= new ArrayList<Integer>();

        zamanHesapla("LinkedList", linkedList);
        zamanHesapla("ArrayList", arrayList);
    }
    public static void zamanHesapla(String veriTipi, List<Integer> list) {

        //Listin sonuna değer ekleme
        long start;
        long finish;

        start=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {

            list.add(0,i);

        }
        finish= System.currentTimeMillis();

        System.out.println(veriTipi + "ekleme süresi " + (finish-start) + "ms" );
    }
}
