import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("Java");
        vector.add("Python");
        vector.add("Python");
        vector.add("Php");

        /*
        for (String s : vector) {
            System.out.println(s);
        }
        */

        /*
        ListIterator<String> iterator = vector.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        */

        /*
        Enumeration<String> enumeration= vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        */

        //System.out.println("İlk eleman : "+vector.firstElement());
        //System.out.println("Son eleman : "+vector.lastElement());

        Stack<String> stack = new Stack<String>(); //LIFO
        stack.push("Java");
        stack.push("Python");
        stack.push("Php");
        stack.push("Go");
        /*
        for (String s: stack) {
            System.out.println(s);
        }

        Enumeration<String> enumeration= stack.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
        */

        System.out.println("Son eleman : "+stack.peek());
        //System.out.println("Son eleman çıkarılıyor : "+stack.pop());
        for (String s: stack) {
            System.out.println(s);
        }

        System.out.println(stack.empty());

        while (!stack.empty()) {
            System.out.println("Eleman çıkarılıyor : " +stack.pop());
        }

        System.out.println(stack.empty());
    }
}