import java.util.concurrent.Semaphore;

public class SemaphoreOrnegi {

    private Semaphore sem = new Semaphore(3);

    public void threadFonksiyonu(int id) {

        try {
            sem.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread Başlıyor... ID : " + id);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Çıkıyor... ID : " + id);
        sem.release();

    }

}
