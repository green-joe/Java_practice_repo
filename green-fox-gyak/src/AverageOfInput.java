import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int szam;
        int ossz = 0;
        double atlag = 0;
        int[] tomb = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print(" Kérek egy számot: ");
            szam = in.nextInt();
            tomb[i] = szam;
            ossz += tomb[i];
        }
        atlag = (double) ossz / tomb.length;
        in.close();
        System.out.println(" A számok összege:" + ossz + "\n A számok átlaga: " + atlag);


    }

}
