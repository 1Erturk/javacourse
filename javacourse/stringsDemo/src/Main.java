public class Main {
    public static void main(String[] args) {
        String mesaj= "Bugün hava çok güzel.";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı : " +mesaj.length());
        System.out.println("5.eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("."));
        char[] characters= new char[5];
        mesaj.getChars(0, 5, characters, 0);
        System.out.println(characters);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));*/

        String yeniMesaj= mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for (String word: mesaj.split(" ")) {
            System.out.println(word);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());


    }
}