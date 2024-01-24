public class Main {

    public static void ucuncuFonksiyon() {
        int a = 12/0;
    }
    public static void ikinciFonksiyon() {
        try {
            ucuncuFonksiyon();
        } catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez!");
        }

    }
    public static void birinciFonksiyon() {
        ikinciFonksiyon();
    }

    public static void main(String[] args) {

        birinciFonksiyon();


    }
}