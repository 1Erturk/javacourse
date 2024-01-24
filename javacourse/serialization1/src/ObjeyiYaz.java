import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYaz {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Mustafa Murat",1234,"Bilgisayar Muhendisligi");
        Ogrenci ogrenci2 = new Ogrenci("Oğuz",678,"Yazılım Muhendisligi");
        Ogrenci ogrenci3 = new Ogrenci("Mehmet",123,"Bilgisayar Muhendisligi");
        Ogrenci[] ogrenciArray = {ogrenci1,ogrenci2,ogrenci3};
        ArrayList<Ogrenci> ogrenciList = new ArrayList<Ogrenci>(Arrays.asList(ogrenciArray));

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {
            /*
            Ogrenci ogrenci1 = new Ogrenci("Mustafa Murat",1234,"Bilgisayar Muhendisligi");
            Ogrenci ogrenci2 = new Ogrenci("Oğuz",678,"Yazılım Muhendisligi");
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);
             */

            //out.writeObject(ogrenciArray);
            //out.writeObject(ogrenciList);

            Ogrenci.setOgrenciSayisi(100);
            out.writeObject(ogrenci1);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu...");
        }

    }
}
