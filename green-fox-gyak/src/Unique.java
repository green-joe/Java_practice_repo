import java.util.ArrayList;
import java.util.Scanner;

public class Unique {
    public static int[] loadArray() {

        Scanner in = new Scanner(System.in);
        System.out.println("Milyen hosszú legyen a tömb?");
        int longOfArray = in.nextInt();
        int[] numberArray = new int[longOfArray];
        for (int i = 0; i < longOfArray; i++) {
            System.out.println("adj meg egy számot: ");
            int number = in.nextInt();
            numberArray[i] = number;
        }
        return numberArray;
    }

    public static ArrayList<Integer> unique(int[] numberArray) {
        ArrayList<Integer> result = new ArrayList<Integer>(); //ezzel adom vissza a kész listát

        ArrayList<Integer> duplicates = new ArrayList<Integer>(); // ebbe tárolom amiből legalább 2 van

        int j; // deklarálom a while léptető intjét, de csak azért deklarálom mert a forban mindig lenullázódik
        boolean itSelf = false; // ezzel küszöbölöm ki azt, hogy vizsgálja önmagát
        boolean contains = false; //a duplicate tartalmaz-e már egy elemet, azt vizsgálja
        int longOfArray = numberArray.length; // memória megtakarítás végett eltároljuk a tömb hosszát
        for (int i = 0; i < longOfArray; i++) {
            j = 0;
            while (numberArray[i] != numberArray[j] && !itSelf && j <= i) { //a j ne lépjen túl az i-n
                if (itSelf) {
                    itSelf = false; // visszaállítjuk az önmaga értékét ha túllépi a tömb
                }
                if (i == j) {
                    itSelf = true; // megnézzük önmaga-e
                }
                j++; // while léptetése a j indexxel
            }
            if (j == longOfArray - 1) { //a j értéke a while után kisebb lesz a maximális elemszámnál ha duplicate van
                result.add(numberArray[i]);
            } else {
                for (int item : duplicates) {
                    if (item == numberArray[i]) { //a duplicatet is meg kell vizsgálni beleraktunk-e már egy elemet
                        contains = true;
                    }
                }
                if (!contains) {
                    duplicates.add(numberArray[i]);
                } else if (contains) { // vissza kell állítani az értékét false-ra különben örökre true marad
                    contains = false;
                }
            }

            //}
        }
        for (int item : duplicates) {
            result.add(item); //hozzáadjuk a results végére a duplicateket
        }
        return result;
    }

    public static void main(String[] args) {
        int[] myNumbers = loadArray();
        for (int item : myNumbers) {
            System.out.print(" " + item);
        }
        System.out.println();
        ArrayList<Integer> result = unique(myNumbers);
        for (int item : result) {
            if (result != null)
                System.out.print(" " + item);

        }


        // - Készíts egy függvényt ami bemeneti paraméterként egy integer array-t vár.
        // - A függvény térjen vissza egy olyan listával ahol az összes szám csak egyszer fordul elő.

        //  Példa
        //  System.out.println(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34}));
        //  Eredmény kiíratva: `[1, 11, 34, 52, 61]`
    }
}
