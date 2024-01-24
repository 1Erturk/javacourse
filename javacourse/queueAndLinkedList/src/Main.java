import java.util.LinkedList;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enese
 */
public class Main {
    public static void main(String[] args) {
        /*
        add ---> offer
        remove ---> poll
        element ---> peek
         */
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");

        //System.out.println(queue.peek());

        for(String s: queue) {
            System.out.println(s);
        }

        System.out.println("************************************");

        //System.out.println("Eleman cikariliyor : " +queue.poll());

        for(String s: queue) {
            System.out.println(s);
        }
        System.out.println(queue.isEmpty());

        while (!queue.isEmpty()) {
            System.out.println("Eleman cikariliyor : "+queue.poll());

        }
    }
}