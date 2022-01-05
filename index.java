import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;

public class index {
    public static void main(String[] args) throws Exception {
    IndexJava();
    	System.out.println("avant le thread");
        Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
		    	System.out.println("début thread");
		    	try {
					lecteurGIT();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		    	try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	System.out.println("fin thread");
			}
        });
        thread.start();
        Thread.sleep(1000);
    	System.out.println("après le thread");
        }

    public static ArrayList<String> threadTest(){
        ArrayList<String> listActeur = new ArrayList<String>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("texte.txt"));
            try{
                String line = bufferedReader.readLine();

                while(line != null){
                    listActeur.add(line);
                    line= bufferedReader.readLine();
                }
            }finally{
                bufferedReader.close();
            }
        }catch(IOException e){

        }return listActeur;
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
       writer.close();
        
      }
    public static void lecteurGIT() throws Exception {
        URL url = new URL("https://raw.githubusercontent.com/MsprEpsi/MSPR-Client/main/staff.txt");
        BufferedReader read = new BufferedReader(
        new InputStreamReader(url.openStream()));
        String i;
        while ((i = read.readLine()) != null)
            System.out.println(i);
        read.close();
    }
    public static void lecteurTxt() throws Exception {
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
}
