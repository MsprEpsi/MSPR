import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class index {
    public static void main(String[] args) throws Exception {
    IndexJava();
        lecteur();
    }
    public static void IndexJava() throws IOException{
     // try{
        PrintWriter writer = new PrintWriter("index.html","UTF-8");
        writer.print("<!doctype html>\r\n"
        + "<html lang='en'>\r\n"
        + " <head>\r\n"
        + "   <meta charset=\"utf-8\">\r\n"
        + "   <title>GO Securi</title>\r\n"
        + " </head>\r\n"
        + " <body>\r\n"
        + "   <center>\r\n"
        + "   <img src=\"C:/Users/Avensys/Documents/perso/MSPR/MSPR/src/logo.png\" alt=\"image\" height=\"100\" />\r\n"
        + "   </center>\r\n"
        + "   <u>La liste des Acteurs :</u>\r\n"
        + " </body>\r\n"
        + "</html>\r\n"
        );
       
        BufferedReader br = new BufferedReader(new FileReader("texte.txt"));
        try{
            String i;
            while ((i = br.readLine()) != null)
                System.out.println(i);
            br.close();
      }finally{
        br.close();
      }
      }
      public static void lecteur() throws Exception {
        URL url = new URL("https://raw.githubusercontent.com/MsprEpsi/MSPR-Client/main/cbertier.txt");
        BufferedReader read = new BufferedReader(
        new InputStreamReader(url.openStream()));
        String i;
        while ((i = read.readLine()) != null)
            System.out.println(i);
        read.close();
    }

  }
