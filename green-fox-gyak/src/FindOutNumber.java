import java.util.Random;
import java.util.Scanner;

public class FindOutNumber {
    static Scanner in = new Scanner(System.in);
    static int piece = 0;
    static int rndNum = 0;
    static boolean success = false;

    static int random() {
        System.out.println("Add meg a tippelés felső határát");
        int scaleTip = in.nextInt();
        System.out.println("1 és " + scaleTip + " között gondoltam egy számra.");
        Random number = new Random();
        int num = number.nextInt(scaleTip);
        return num;
    }

    static String readTip() {
        System.out.println("Kérem a tippedet: ");
        String yourTip = in.next();
        return yourTip;
    }

    public static boolean check(String s) {
        boolean out = true;
        if (s.length() == 0) {
            System.out.println("Nem írtál be adatot!");
            out = false;
        }
        if (out) {
            try {
                int x = Integer.valueOf(s);
            } catch (NumberFormatException nfe) {
                System.out.println("Hibás a beírt adat formátuma!");
                out = false;
            }
        }
        return out;
    }

    public static int StoInt(String s) {
        int x = -1;
        try {
            x = Integer.valueOf(s);
        } catch (NumberFormatException nfe) {
            System.out.println("StoInt: " + nfe.getMessage());
        }
        return x;
    }
    public static boolean evaluate(String s) {
        boolean ok = false;
        String mS = "";
        int tipp = StoInt(s);
        piece++;
        if (rndNum == tipp) {
            mS = "Eltaláltad!\nTippek száma: " + piece;
            ok = true;
        }
        if (rndNum < tipp) {
            mS = "A szám kisebb a tippedtől!";
        }
        if (rndNum > tipp) {
            mS = "A szám nagyobb a tippedtől!";
        }
        System.out.println(mS);
        return ok;
    }

        public static void main (String[]args){
            rndNum = random();
            while (!success) {
                String tipS = readTip();
                if (check(tipS)) {
                    success = evaluate(tipS);
                } else piece++;
            }
        }

    }