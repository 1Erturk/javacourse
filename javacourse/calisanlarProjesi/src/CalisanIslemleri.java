import java.sql.*;
import java.util.ArrayList;

public class CalisanIslemleri {
    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public ArrayList<Calisan> calisanlariGetir() {

        ArrayList<Calisan> cikti = new ArrayList<Calisan>();

        try {
            statement = con.createStatement();
            String sorgu = "Select * From calisanlar";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String dept = rs.getString("departman");
                String maas = rs.getString("maas");

                cikti.add(new Calisan(id,ad,soyad,dept,maas));

            }
            return cikti;

        } catch (SQLException e) {
            return null;
            //throw new RuntimeException(e);
        }

    }

    public void calisanEkle(String ad, String soyad, String departman, String maas) {

        String sorgu = "Insert Into calisanlar (ad,soyad,departman,maas) VALUES(?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1,ad);
            preparedStatement.setString(2,soyad);
            preparedStatement.setString(3,departman);
            preparedStatement.setString(4,maas);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void calisanGuncelle(int id, String yeniAd, String yeniSoyad, String yeniDepartman, String yeniMaas) {

        String sorgu = "Update calisanlar set ad = ? , soyad = ? , departman = ? , maas = ? where id = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1,yeniAd);
            preparedStatement.setString(2,yeniSoyad);
            preparedStatement.setString(3,yeniDepartman);
            preparedStatement.setString(4,yeniMaas);
            preparedStatement.setInt(5,id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void calisanSil(int id) {

        String sorgu = "Delete from calisanlar where id = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1,id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public boolean girisYap(String name, String password) {
        String sorgu = "Select * From adminler where username = ? and password = ?";
        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);


            ResultSet rs = preparedStatement.executeQuery();
            /*
            if (rs.next() == false) {
                return false;
            } else {
                return true;
            }
             */
            return rs.next();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public CalisanIslemleri() {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.dbName+ "?useUnicode=true&characterEncoding=utf8";


        try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }


        try {
            con = DriverManager.getConnection(url, Database.name, Database.password);
            System.out.println("Bağlantı Başarılı...");


        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
    }


}
