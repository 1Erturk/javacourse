import com.sun.jdi.event.ExceptionEvent;

public class Main {
    public static void main(String[] args) {

        try {
            //int a= 30/0; //ArithmeticException
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println("Bir sayı 0'a bölünemez.");
            //System.out.println("Arrayin boyunu aştınız.");
            e.printStackTrace();
        }
        System.out.println("Burası çalışıyor...");
        System.out.println("******************************");



        try {
            int[] a= {1,2,3,4,5};
            System.out.println(a[6]);
            int b= 30/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez...");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrayin boyunu aştınız...");
        }
        catch (Exception e) {
            System.out.println("Bir hata oluştu...");
            e.printStackTrace();
        }
        System.out.println("Burası çalışıyor...");



    }
}