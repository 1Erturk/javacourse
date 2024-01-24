import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();

    public static void dosyaOku() {

        try {
            FileInputStream in = new FileInputStream("marş.mp3");

            int oku;

            while ((oku = in.read()) != -1) {
                icerik.add(oku);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void kopyala(String dosyaismi) {

        try {
            FileOutputStream out = new FileOutputStream(dosyaismi);

            for (int deger : icerik) {
                out.write(deger);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        dosyaOku();

        long baslangic = System.currentTimeMillis();
        kopyala("marş2.mp3");
        kopyala("marş3.mp3");
        kopyala("marş4.mp3");
        long bitis = System.currentTimeMillis();

        System.out.println("3 dosyanın kopyalanması şu kadar sürdü : " +((bitis-baslangic)/1000) +"saniye");


    }
}