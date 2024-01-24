import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fos= null;
        //File file = new File("dosya.txt");

        try {
            fos= new FileOutputStream("dosya.txt",true);
            //byte[] array = {101,75,66,68};
            String s = "Enes Erturk";
            byte[] sArray= s.getBytes();
            fos.write(sArray);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Founde exception oluştu...");
        } catch (IOException e) {
            System.out.println("Dosyaya yazılırken bir hata oluştu...");
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                System.out.println("Dosya kapatılırken bir hata oluştu...");
            }
        }
    }
}