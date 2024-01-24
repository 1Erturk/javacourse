public class Main {
    public static void main(String[] args) {
        char harf= 'K';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Kalın sesli harf");
        }
    }
}