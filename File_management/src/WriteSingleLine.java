import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class WriteSingleLine {
    public static void writeSingleLine(String text) {
        ArrayList<String> name=new ArrayList<>();
    name.add(text);
     try{
     Path filePath= Paths.get("my-file.txt");
         Files.write(filePath,name );
     }catch(Exception e) {
         System.out.println("Unable to write file: my-file.txt");

     }
     }
    public static void main(String[] args) {
     writeSingleLine("My name is József Székely");
        // Hozz létre egy függvényt, ami képes fájlokat mainpulálni:
        // a fájlba beleírja a nevedet, egy sorba.
        // A fájlnak a neve "my-file.txt" legyen.
        // Ha a program nem tudja megnyitni a fájlt,
        // akkor a következő üzenetet kell kiírnia: "Unable to write file: my-file.txt"


    }
}
