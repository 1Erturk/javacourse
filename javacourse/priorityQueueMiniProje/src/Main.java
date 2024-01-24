import java.util.PriorityQueue;
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
    public static void main(String[] args) throws InterruptedException {
        // Acil Servis Uygulamasi
        /*
        Apandist ---> En yüksek öncelik
        Yanık ---> Orta öncelik
        Baş Ağrısı ---> En düşük öncelik
        */
        Queue<Hasta> acilServis = new PriorityQueue<Hasta>();
        acilServis.offer(new Hasta("Murat Bey", "Yanık"));
        acilServis.offer(new Hasta("Okan Bey", "Baş ağrısı"));
        acilServis.offer(new Hasta("Elif Hanım", "Apandist"));
        acilServis.offer(new Hasta("Oğuz Bey", "Yanık"));
        acilServis.offer(new Hasta("Merve Hanım", "Yanık"));
        acilServis.offer(new Hasta("Gizem Hanım", "Apandist"));

        int i=1;

        while (acilServis.isEmpty() != true) {
            System.out.println("**************************************");
            System.out.println(i +".sırada");
            System.out.println(acilServis.poll());
            System.out.println("**************************************");
            i++;
            //Thread.sleep(1000);

        }

    }

}