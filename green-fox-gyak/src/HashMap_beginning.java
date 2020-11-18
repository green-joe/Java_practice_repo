import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap_beginning {
    public static void main(String[] args) {
       // Készíts egy üres asszociatív tömböt (Map) ahol a kulcsok(keys) integerek és az értékek(values) karakterek
        LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<>();
        //Írasd ki hogy a map üres e vagy sem.
        System.out.println(lhmap.isEmpty());
        System.out.println();
        //Add hozzá az alábbi kulcs(key) érték(value) párokat a map-hez
        lhmap.put(97, "a");
        lhmap.put(98, "b");
        lhmap.put(99, "c");
        lhmap.put(65, "A");
        lhmap.put(66, "B");
        lhmap.put(67, "C");
        //Írasd ki az összes kulcsot.
        for (Integer k : lhmap.keySet()) {
            System.out.print("\n "+k);
        }
        // Írasd ki az összes értéket.
        for (String v : lhmap.values()){
            System.out.print("\n "+v);
        }
        // Add hozzá a D értéket az 68-as kulccsal.
        lhmap.put(68, "D");
        System.out.println();
        //  Írasd ki hány kulcs érték pár van a map-ben.
        System.out.println();
        System.out.println(lhmap.size());
        // Írasd ki a 99-es kulcshoz tartozó értéket.
        System.out.println();
        System.out.println(lhmap.get(99));
        System.out.println();
        //Töröld ki azt a kulcs-érték párt, ahol a kulcs 97.
        lhmap.remove(97);
        for (Integer k : lhmap.keySet()){
            System.out.println(k+":"+lhmap.get(k));
        }
      // Írasd ki van-e társítva érték a 100-as kulcshoz vagy sem.
        System.out.println();
        System.out.println(lhmap.get(100));
        System.out.println();
        lhmap.clear();
        System.out.println(lhmap.isEmpty());







               /*












                Távolítsd el az összes kulcs érték párt.*/


    }
}
