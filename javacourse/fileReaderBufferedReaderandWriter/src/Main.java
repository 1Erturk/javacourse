import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        try (Scanner scanner= new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))){


            //while(scanner.hasNextLine()) {
                //System.out.println("Okunan satır : " +scanner.nextLine());
            //}

            while(scanner.hasNextLine()) {

                String ogrenciBilgisi = scanner.nextLine();
                String[] array = ogrenciBilgisi.split(",");
                if(array[1].equals("Bilgisayar Muhendisligi")) {
                    System.out.println("Ogrenci Bilgisi : " +ogrenciBilgisi);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı...");
        } catch (IOException e) {
            System.out.println("Dosya açılırken bir hata oluştu...");
        }
         */

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt",true))) {
            writer.write("Ali Ozan,Insaat Muhendisligi\n");
        } catch (IOException e) {
            System.out.println("Dosya açılırken hata oluştu...");
        }


    }
}