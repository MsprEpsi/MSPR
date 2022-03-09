import java.io.BufferedReader;
    import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;

public class index {
    public static void main(String[] args) throws Exception {
        ReadStaff();
    }

    public static void ReadStaff() throws IOException{
        List<String> listAgent = new ArrayList<String>();
        URL url = new URL("https://raw.githubusercontent.com/MsprEpsi/MSPR-Client/main/staff.txt");
        BufferedReader br = new BufferedReader(
        new InputStreamReader(url.openStream()));
        try{
            String i;
            while ((i = br.readLine()) != null)
                listAgent.add(i);
            br.close();
      }finally{
        br.close();
      }
      String agents = "";
      String agentsInfo;
      for(int i = 0; i < listAgent.size(); i++){
            agentsInfo = "";
            agents = listAgent.get(i)+"\r";
            URL urlAgent = new URL("https://raw.githubusercontent.com/MsprEpsi/MSPR-Client/main/"+listAgent.get(i)+".txt");
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            int responseCode = huc.getResponseCode();
            if(Assert.assertEquals(HttpURLConnection.HTTP_OK, responseCode)){
                BufferedReader brAgent = new BufferedReader(
                new InputStreamReader(urlAgent.openStream()));
                try{
                    String j;
                    while ((j = brAgent.readLine()) != null)
                        agentsInfo+=j+"</br>";
                }finally{
                    brAgent.close();
                }
                try (
                    PrintWriter writer = new PrintWriter(listAgent.get(i)+".html","UTF-8")) {
                        writer.print("<!doctype html>\r\n"
                        + "<html lang='en'>\r\n"
                        + " <head>\r\n"
                        + "   <meta charset=\"utf-8\">\r\n"
                        + "   <title>GO Securi</title>\r\n"
                        + " </head>\r\n"
                        + " <body>\r\n"
                        + "   <center>\r\n"
                        + "   <img src=\"https://raw.githubusercontent.com/MsprEpsi/MSPR/main/src/logo.png\" alt=\"image\" height=\"100\" />\r\n"
                        + "   </center>\r\n"
                        + agents
                        + agentsInfo
                        + " </body>\r\n"
                        + "</html>\r\n"
                        );
                }
            }
        }
        
      }

  }
