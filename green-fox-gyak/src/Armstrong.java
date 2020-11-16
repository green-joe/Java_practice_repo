import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner readIn = new Scanner(System.in);

        System.out.print("Adj meg egy számot:");
        String szam = readIn.next();
        String[] darabolt = szam.split("");

        int multiplicated = 0;
        for (int i = 0; i < szam.length(); i++) {

            multiplicated += Math.pow(Integer.parseInt(darabolt[i]), darabolt.length);
        }
        if (Integer.parseInt(szam) == multiplicated) {
            System.out.println("A(z) "+multiplicated+" Armstrong szám.");
        } else {
            System.out.println("A(z) "+multiplicated+"  nem Armstrong szám.");
        }
    }
}
