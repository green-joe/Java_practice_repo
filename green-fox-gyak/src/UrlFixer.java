import java.util.Stack;

public class UrlFixer {

    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("bots", "odds");
        url = url.substring(0, 5) + ":" + url.substring(5);
        //2. verzio
        String url2 = "https//www.reddit.com/r/nevertellmethebots";
        StringBuffer urlNew = new StringBuffer(url2);
        urlNew.replace(38, 42, "odds");
        urlNew.insert(5, ":");
        System.out.println("Első megoldás:  " + urlNew);

        // Véletlenül rossz URL-t kaptam egy vicces subreddithez.
        // Valószínűleg ez "odds" és nem "bots" akart lenni.
        // Továbbá az URL-ből hiányzik egy fontos rész, derítsd ki
        // melyik az és illeszd be.
        // Próbáld meg megoldani többféleképpen különböző String függvényekkel.

        System.out.println("Második megoldás: " + url);
    }
}
