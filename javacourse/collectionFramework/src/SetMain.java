import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

    public static void main(String[] args) {
        /*
        Set Interface ------> HashSet, LinkedHashSet, TreeSet

        Set Interface ile List Interface'in farkı
        List interface'i implemente eden classlar bir elementten birden fazla depolayabilirken,
        Set interface'i implemente eden classlar bir elementten sadece bir tane depolarlar.


        HashSet, elementleri ekleme sırasına göre depolamaz.
        LinkedHashSet, elementleri ekleme sırasına göre depolar.
        TreeSet, elementleri depolamak için Tree yani Ağaç yapısını kullanır, ve elementleri alfabetik olarak depolar.

        HashSet, HashTable mekanizmasını uyguladığı için elementler sıralı değildir. Ekleme, Çıkarma ve Arama metodları
        sabit zamanda ( Time Complexity : O(1) ) çalışır.
        TreeSet, elementler tree yapısına yani ağaç yağısına uygun depolar. Ekleme, Çıkarma ve Arama metodları
        O(log(n)) complexitysi ile çalışır.
        LinkedHashSet sınıfı hashtable ile linkedlist yapısını kullanarak elementleri depolar. Bu yüzden, elementler
        ekleme sırasına göre depolanır. Ekleme, Çıkarma ve Arama metodları sabit zamanda ( Time Complexity : O(1) ) çalışır.
         */

        Set<String> set1= new HashSet<String>();
        Set<String> set2= new LinkedHashSet<String>();
        Set<String> set3= new TreeSet<String>();

        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("Javascript");
        set1.add("Php");

        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("Javascript");
        set2.add("Php");

        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("Javascript");
        set3.add("Php");

        /*
        System.out.println("**********HashSet**********");
        for (String s : set1) {
            System.out.println(s);
        }

        System.out.println("**********LinkedHashSet***********");
        for (String s : set2) {
            System.out.println(s);
        }

        System.out.println("**********TreeSet**********");
        for (String s : set3) {
            System.out.println(s);
        }*/

        //System.out.println(set1.contains("Go"));
        //System.out.println(set1.contains("Java"));
        //System.out.println(set1.isEmpty());
        //System.out.println(set1.remove("Java"));

        Set<String> s1= new HashSet<String>();
        Set<String> s2= new HashSet<String>();

        s1.add("Java");
        s1.add("C++");
        s1.add("Python");
        s1.add("Javascript");
        s1.add("Php");

        s2.add("Go");
        s2.add("Java");
        s2.add("CSS");

        Set<String> fark= new HashSet<String>(s2);
        System.out.println(fark.removeAll(s1));
        System.out.println(fark);

        System.out.println("***********************");
        Set<String> kesisim= new HashSet<String>(s2);
        System.out.println(kesisim.retainAll(s1));
        System.out.println(kesisim);

    }
}
