import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjeyiOku {
    public static void main(String[] args) {

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {
            /*
            Ogrenci ogrenci1 = (Ogrenci)in.readObject();
            Ogrenci ogrenci2 = (Ogrenci)in.readObject();

            System.out.println("***********************************");
            System.out.println(ogrenci1);
            System.out.println("***********************************");
            System.out.println(ogrenci2);
             */

            /*
            Ogrenci[] ogrenciArray = (Ogrenci[])in.readObject();
            ArrayList<Ogrenci> ogrenciList = (ArrayList<Ogrenci>)in.readObject();

            System.out.println("*******************************************");
            for (Ogrenci o : ogrenciArray) {
                System.out.println(o);
                System.out.println("---------------------------------------");
            }
            System.out.println("*******************************************");
            for (Ogrenci o : ogrenciList) {
                System.out.println(o);
                System.out.println("---------------------------------------");
            }
            System.out.println("*******************************************");
             */

            Ogrenci ogrenci = (Ogrenci)in.readObject();
            System.out.println(ogrenci);
            System.out.println("Ogrenci sayisi : " +Ogrenci.getOgrenciSayisi());


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException e) {
            System.out.println("Dosya açılırken IOException oluştu...");
        } catch (ClassNotFoundException e) {
            System.out.println("Sınıf bulunamadı...");
        }

    }
}
