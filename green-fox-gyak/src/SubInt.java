import java.util.Scanner;

public class SubInt {
    //This function matches items of array to indexes
    public static Scanner in = new Scanner(System.in);

    public static String[] subInt(int examNumber, int[] numberArray) {
        String[] stringArray = new String[numberArray.length];
        for (int i = 0; i < numberArray.length; i++) {
            stringArray[i] = String.valueOf(numberArray[i]);
        }
        String[] result = new String[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            String k = String.valueOf(examNumber);
            if (stringArray[i].contains(k)) {
                result[i] = String.valueOf(i);
            }
        }

        return result;
    }

    public static int arrayLength(int n) {
        // How many items sould be in the array?
        //Scanner in=new Scanner(System.in);
        System.out.print("Hány elemű tömb legyen? ");
        return n = in.nextInt();
    }

    public static void arrayItems(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Add meg a tömbben lévő számokat! ");
            array[i] = in.nextInt();
        }

    }

    public static void main(String[] args) {
        int n = 0;
        n = arrayLength(n);
        int[] array = new int[n];
        arrayItems(array);
        System.out.print("A tömb elemei: ");
        for (int item : array) {
            System.out.print(" | " + item);
        }
        System.out.println();
        System.out.println("Melyik számot vizsgáljuk?");
        int szam = in.nextInt();
        String[] eredmeny = subInt(szam, array);
        in.close();
        System.out.println("\nA megadott szám a következő indexű tömbértékekben található meg:");
        for (String item : eredmeny) {
            if (item != null)
                System.out.println("  " + item);
        }
    }

}

