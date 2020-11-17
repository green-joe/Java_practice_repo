import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SolarSystem {
    public static ArrayList<String> putSaturn(ArrayList<String> comeinArraylist) {
        ArrayList<String> resultArraylist = new ArrayList<String>();
        comeinArraylist.add("Saturn");
        Collections.sort(comeinArraylist);
        resultArraylist = comeinArraylist;
        return resultArraylist;
    }

    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
        // A Szaturnusz hiányzik a bolygók listájából.
        // Rakd be a megfelelő helyre
        // Készíts egy függvényt `putSaturn()` mely bemeneti paraméterként
        // egy listát vár. Visszatérési értéke pedig a helyes lista.

        System.out.println(putSaturn(planetList));
        // Várt eredmény: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
    }
}

