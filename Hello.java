import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Hello {
    public static void main(String[] args) {

    }
    public static void IndexJava() throws FileNotFoundException, UnsupportedEncodingException{
     // try{
        PrintWriter writer = new PrintWriter("index.html","UTF-8");
        writer.print("<!doctype html>\n"
        + "<html lang='en'>\n"
        + " <head>\n"
        + "   <meta charset=\"utf-8\">\n"
        + "   <title>GO Securi</title>\n"
        + " </head>\n"
        + " <body>\n"
        + "   <center>\n"
        + "   <img src=\"C:/Users/Avensys/Documents/perso/MSPR/MSPR/src/logo.png\" alt=\"image\" height=\"100\" />\n"
        + "   </center>\n"
        + "   <u>La liste des Acteurs :</u>\n"
        + " </body>\n"
        + "</html>\n"
        );
        BufferedReader br = new BufferedReader(new FileReader("texte.txt"));
        /*try{
          String line = br.readLine();
          While (line != null){
            writer.print("test"+line);
            line=br.readLine();
          }*/
        
     // }finally{
       // br.close();
      //}
      }
  }
