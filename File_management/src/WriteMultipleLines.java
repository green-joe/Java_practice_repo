import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteMultipleLines {
    public static void writeMultipleLines(String pathFiles,String word, int number ) throws IOException, NoSuchFieldException {
        Path myPath= Paths.get(pathFiles);
        if(!Files.exists(myPath)){
            throw new NoSuchFieldException("A fájl nem létezik ");
        }
        ArrayList<String> lines=new ArrayList<String>();
        for (int i=0; i<number;i++){
            lines.add(word);
        }
        Files.write(myPath,lines);
    }
    public static void main(String[] args) {
        try {
            writeMultipleLines("..\\File_management\\text2.txt","alma",5);
        } catch (IOException | NoSuchFieldException e) {

        }


// Készíts egy függvényt, ami 3 paramétert vár: egy elérési utat, egy szót
// és egy számot. Tudjon írni fájlba.
// Az elérési út legyen egy string, ami leírja az írandó fájl helyét.
// A szó szintén legyen string és kerüljön be a fájlba egyenként külön sorba.
// A szám paraméter jelöli, hogy hány sora legyen a fájnak.
// Ha a szó 'alma' és a szám 5, akkor 5 sort írjon a fájlba
// és minden sorban az legyen írva: 'alma'.
// Ha a függvény nem tud írni a fájlba, ne dobjon semmilyen hibaüzenetet.



    }
}
