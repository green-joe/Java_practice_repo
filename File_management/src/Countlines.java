import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Countlines {
    public static int countLines(String filename) throws IOException {

        Path filepath= Paths.get(filename);
        int numberOfLines=0;
        List<String> list= Files.readAllLines(filepath);
        numberOfLines= list.size();
        return numberOfLines;
    }
    public static void main(String[] args) throws IOException {
        String filename="E:\\Programozás\\greenfox\\Green_fox_java_backend_gyak\\File_management\\text2.txt";
        System.out.println(countLines(filename));



// Írj egy függvényt, ami fogad egy fájlnevet stringként,
// majd visszadja a fájlban található sorok számát.
// Ha nem tudja megnyitni a fájlt adjon vissza nullát és
// ne jelezzen semmilyen hibát.



    }
}
