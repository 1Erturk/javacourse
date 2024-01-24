import java.util.ArrayList;
import java.util.Iterator;

public class Radyo implements Iterable<String> {

    private ArrayList<String> kanallarListesi= new ArrayList<String>();

    public class RadyoIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            if(index < kanallarListesi.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String next() {
            String value = kanallarListesi.get(index);
            index++;

            return value;
        }
    }
    public Radyo(String[] kanallar) {
        for (String kanal : kanallar) {
            kanallarListesi.add(kanal);
        }
    }

    @Override
    public Iterator<String> iterator() {
        //return kanallarListesi.iterator();
        return new RadyoIterator();
    }
}
