import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void mekanKontrol(int yas) throws IOException{
        if(yas<18) {
            throw new IOException();
        } else {
            System.out.println("Mekana hoşgeldiniz...");
        }
    }
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz : ");
        int yas = scanner.nextInt();

        /*
        try {
            mekanKontrol(yas);
        } catch (IOException e) {
            System.out.println("IOException oluştu.");
        }

         */

        mekanKontrol(yas);

    }
}