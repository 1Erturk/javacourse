import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection= null;
        DbHelper helper= new DbHelper();
        PreparedStatement statement= null;
        ResultSet resultSet;
        try{
            connection= helper.getConnection();
            String sql= "delete from sakila.country where country_id = ? ";
            statement= connection.prepareStatement(sql);
            statement.setString(1, "113");
            statement.executeUpdate();
            System.out.println("Kayıt silindi");
        }catch(SQLException exception) {
            helper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close();
        }
    }

    public static void selectDemo() throws SQLException {
        Connection connection= null;
        DbHelper helper= new DbHelper();
        Statement statement= null;
        ResultSet resultSet;
        try{
            connection= helper.getConnection();
            statement= connection.createStatement();
            resultSet= statement.executeQuery("select country_id,country,last_update from sakila.country;");
            ArrayList<Country> countries= new ArrayList<Country>();
            while (resultSet.next()) {
                countries.add(new Country(resultSet.getString("country_id"),
                        resultSet.getString("country"),
                        resultSet.getString("last_update")));
            }
            System.out.println(countries.size());
        }catch(SQLException exception) {
            helper.showErrorMessage(exception);
        }finally {
            connection.close();
        }
    }

    public static void insertData() throws SQLException {
        Connection connection= null;
        DbHelper helper= new DbHelper();
        PreparedStatement statement= null;
        ResultSet resultSet;
        try{
            connection= helper.getConnection();
            String sql= "insert into sakila.country (country_id,country) values(?,?)";
            statement= connection.prepareStatement(sql);
            statement.setInt(1,111);
            statement.setString(2,"Errt2");
            statement.executeUpdate();
            System.out.println("Kayıt eklendi");
        }catch(SQLException exception) {
            helper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close();
        }
    }

    public static void updateData() throws SQLException {
        Connection connection= null;
        DbHelper helper= new DbHelper();
        PreparedStatement statement= null;
        ResultSet resultSet;
        try{
            connection= helper.getConnection();
            String sql= "update sakila.country set country_id=113 where country = ?";
            statement= connection.prepareStatement(sql);
            statement.setString(1, "Errt2");
            statement.executeUpdate();
            System.out.println("Kayıt güncellendi");
        }catch(SQLException exception) {
            helper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close();
        }
    }
}