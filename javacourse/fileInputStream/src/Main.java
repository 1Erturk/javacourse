import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis= new FileInputStream("dosya.txt");


            //System.out.println("Birinci karakter : " +(char)(fis.read()));
            /*
            fis.skip(5);
            System.out.println("Okunan karakter : " +(char)(fis.read()));
             */

            int deger;
            String s = "";
            while ((deger=fis.read())!=-1) {
                s += (char) deger;
            }
            System.out.println("Dosya içeriği : " +s);

        } catch (FileNotFoundException e) {
            System.out.println("File bulunamadı...");
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluştu...");
        } finally {
            try {
                if(fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken bir hata oluştu...");
            }
        }
    }
}