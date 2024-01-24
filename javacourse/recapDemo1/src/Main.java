public class Main {
    public static void main(String[] args) {
        int n1= 14;
        int n2= 25;
        int n3= 26;
        int greatestNumber= n1;

        if (greatestNumber<n2) {
            greatestNumber= n2;
        }
        if (greatestNumber<n3) {
            greatestNumber= n3;
        }

        System.out.println("Greatest number = "+greatestNumber);

    }
}