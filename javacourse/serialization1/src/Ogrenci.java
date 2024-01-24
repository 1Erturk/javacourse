import java.io.Serializable;

public class Ogrenci implements Serializable {
    //private static final long serialVersionUID = 1000;

    private String isim;
    private transient int id;
    private String bolum;
    private static int ogrenciSayisi = 0;

    public static int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public static void setOgrenciSayisi(int ogrenciSayisi) {
        Ogrenci.ogrenciSayisi = ogrenciSayisi;
    }

    public Ogrenci(String isim, int id, String bolum) {
        this.isim = isim;
        this.id = id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        String bilgiler = "Ogrenci ismi : " +isim
                +"\nOgrenci Numarası : " +id
                +"\nOgrenci Bolumu : " +bolum;
        return bilgiler;
    }
}
