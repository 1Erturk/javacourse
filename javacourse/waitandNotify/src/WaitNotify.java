import java.util.Scanner;

public class WaitNotify {
    private Object lock = new Object();

    public void thread1Fonksiyonu() {

        synchronized (lock) {
            System.out.println("Thread 1 Çalışıyor...");
            System.out.println("Thread 1 Thread2'nin kendisini uyandırmasını bekliyor...");

            try {
                lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Thread 1 Uyandı. Devam ediyor...");

        }
    }
    public void thread2Fonksiyonu() {
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (lock) {
            System.out.println("Thread 2 çalışıyor...");
            System.out.println("Devam etmek için bir tuşa basın...");
            scanner.nextLine();

            lock.notify();
            System.out.println("Thread 1 uyandırıldı.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
