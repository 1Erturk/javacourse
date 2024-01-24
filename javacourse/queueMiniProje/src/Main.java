import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

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
        System.out.println("Ramazan Pidesi Uygulamasi....");
        Random random= new Random();

        Queue<String> pideKuyrugu= new LinkedList<>();
        pideKuyrugu.offer("Murat");
        pideKuyrugu.offer("Hasan");
        pideKuyrugu.offer("Okan");
        pideKuyrugu.offer("Ayşe");
        pideKuyrugu.offer("Merve");
        pideKuyrugu.offer("Ezgi");
        pideKuyrugu.offer("Gizem");
        pideKuyrugu.offer("Mehmet");
        pideKuyrugu.offer("Oguz");
        pideKuyrugu.offer("Azer");

        int pideSayisi= 1 + random.nextInt(10);
        System.out.println("Pideler Cikiyor....");
        System.out.println("Cikan Pide Sayisi : "+pideSayisi);
        Thread.sleep(3000);

        while (pideSayisi!=0) {
            System.out.println(pideKuyrugu.poll()+" pideyi aldi...");
            pideSayisi--;
            Thread.sleep(1000);
        }

        System.out.println("Pide kalmadi...");

    }
}