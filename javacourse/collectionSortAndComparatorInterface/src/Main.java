import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BuyuktenKucugeString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
         return -o1.compareTo(o2);
    }
}

class Player  {
    private String name;
    private int id;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "|||| ID : " + id + " Name : " +name + " ||||";
    }

}

class KucuktenBuyugePlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getId() < o2.getId()) {
            return -1;
        } else if(o1.getId() > o2.getId()) {
            return 1;
        } else {
            return 0;
        }
    }
}

class BuyuktenKucugePlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getId() < o2.getId()) {
            return 1;
        } else if(o1.getId() > o2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class KucuktenBuyugeStringPlayer implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class Main {
    public static void main(String[] args) {


        /*
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");
        list.add("Go");

        Collections.sort(list, new BuyuktenKucugeString());

        for (String s: list) {
            System.out.println(s);
        }
        */


        List<Player> listPlayer= new ArrayList<Player>();

        listPlayer.add(new Player("Murat", 5));
        listPlayer.add(new Player("Emre", 1));
        listPlayer.add(new Player("Oğuz", 10));
        listPlayer.add(new Player("Yusuf", 4));

        //Collections.sort(listPlayer, new KucuktenBuyugePlayer());
        //Collections.sort(listPlayer, new BuyuktenKucugePlayer());
        //Collections.sort(listPlayer, new KucuktenBuyugeStringPlayer());
        Collections.sort(listPlayer, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return -o1.getName().compareTo(o2.getName());
            }
        });

        for (Player p : listPlayer) {
            System.out.println(p);
        }



    }
}