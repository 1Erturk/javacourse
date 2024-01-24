import java.util.*;

class Player implements Comparable<Player> {
    private String name;
    private int id;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "|||| ID : " + id + " Name : " +name + " ||||";
    }

    @Override
    public int compareTo(Player player) {

        if(this.id< player.id) {
            return -1;
        }
        else if(this.id >player.id) {
            return 1;
        } else{
            return 0;
        }
    }
}
public class Main {
    public static void main(String[] args) {

        /*
        List<String> listString = new ArrayList<String>();

        listString.add("Java");
        listString.add("C++");
        listString.add("Python");
        listString.add("Php");
        listString.add("Go");

        Collections.sort(listString);

        for (String s: listString) {
            System.out.println(s);
        }
        */

        List<Player> listPlayer= new ArrayList<Player>();

        listPlayer.add(new Player("Murat", 5));
        listPlayer.add(new Player("Emre", 1));
        listPlayer.add(new Player("Oğuz", 10));
        listPlayer.add(new Player("Yusuf", 4));

        /*
        Collections.sort(listPlayer);
        for (Player p : listPlayer) {
            System.out.println(p);
        }
         */

        Set<Player> treeset = new TreeSet<Player>();

        treeset.add(new Player("Murat", 5));
        treeset.add(new Player("Emre", 1));
        treeset.add(new Player("Oğuz", 10));
        treeset.add(new Player("Yusuf", 4));

        for (Player p : treeset) {
            System.out.println(p);
        }

    }
}