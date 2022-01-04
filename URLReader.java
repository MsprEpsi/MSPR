import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {
    //recupere le fichier GIT via l'url et ça l'écrit
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://raw.githubusercontent.com/MsprEpsi/MSPR-Client/main/cbertier.txt");
        BufferedReader read = new BufferedReader(
        new InputStreamReader(url.openStream()));
        String i;
        while ((i = read.readLine()) != null)
            System.out.println(i);
        read.close();
    }
}