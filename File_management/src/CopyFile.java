import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static boolean copyFile(String filename1, String filename2) throws IOException,NoSuchFileException {
        boolean successful=true;

       try {
           Path filPath1 = Paths.get(filename1);
           Path filPath2 = Paths.get(filename2);
           List<String> readIn = Files.readAllLines(filPath1);
           Files.write(filPath2, readIn);

       } catch (IOException e){
           successful=false;
       }
        return successful;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(copyFile("text2.txt","my-file.txt"));

// Írj egy függvényt, ami átmásolja egy fájl tartalmát egy másikba
// A két fájl nevét paraméterként kapja meg
// És visszaad egy boolean értéket, attól függően,
// hogy sikeres volt-e a másolás



    }
}
