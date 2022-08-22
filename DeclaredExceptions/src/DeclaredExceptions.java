import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DeclaredExceptions {
    public static void main(String[] args) {
        try {
            int data = readByteFromFile();
        }//endtry
        catch (IOException e) {
            System.out.println(e.getMessage());
        }//endcatch
    }
    public static int readByteFromFile() throws IOException {
        try (InputStream in = new FileInputStream("a.txt")) {
            System.out.println("File open");
            return in.read();
        }//endtry
    }//end method readByteFromFile
}
