public class Hasta implements Comparable<Hasta>{
    private String isim;
    private String sikayet;

    private int oncelik;

    public Hasta(String isim, String sikayet) {
        this.isim = isim;
        this.sikayet = sikayet;

        switch (sikayet) {
            case "Apandist":
                this.oncelik = 3;
                break;
            case "Yanık":
                this.oncelik = 2;
                break;
            default:
                this.oncelik= 1;
                break;
        }
    }

    @Override
    public String toString() {
        String bilgiler = "Hasta Adı : " +isim
                +"\nSikayet : " +sikayet
                +"\nOncelik : " +oncelik;
        return bilgiler;

    }

    @Override
    public int compareTo(Hasta hasta) {
        if(this.oncelik>hasta.oncelik) {
            return -1;
        } else if(this.oncelik<hasta.oncelik) {
            return 1;
        } else {
            return 0;
        }
    }





}
