import java.util.PriorityQueue;
import java.util.Queue;

class Player implements Comparable<Player>{
    private String name;
    private int id;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int compareTo(Player player) {
        if(this.id<player.id) {
            return -1;
        } else if(this.id>player.id) {
            return 1;
        } else {
            return  0;
        }
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", id=" + id + '}';
    }



}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enese
 */
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue= new PriorityQueue<Integer>();
        /*
        queue.offer(5);
        queue.offer(1);
        queue.offer(2);
        queue.offer(100);
        
        System.out.println(queue.peek());
        System.out.println(queue.contains(100));
        //queue.clear();
        
        while(!queue.isEmpty()) {
            System.out.println("Eleman cikariliyor : " +queue.poll());
        }
        */

        Queue<Player> queuePlayer= new PriorityQueue<Player>();
        queuePlayer.offer(new Player("Murat", 5));
        queuePlayer.offer(new Player("Mehmet", 1));
        queuePlayer.offer(new Player("Oguz", 100));

        while (!queuePlayer.isEmpty()) {
            System.out.println("Eleman Cikariliyor : "+queuePlayer.poll());
        }
    }
}
