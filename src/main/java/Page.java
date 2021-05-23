import org.jsoup.Jsoup;
import java.io.IOException;
import java.net.URL;
import org.jsoup.nodes.Document;

class Page {
    private Document document;
    private String URL;

    public Page(String URL){
        this.URL = URL;
       try {
           document = Jsoup.parse(new URL(URL),3000);
       }catch (IOException e){
           System.out.println("Error! you may have entered a non-existent site or the server response time has been exceeded");
       }
    }

    public String getURL() {
        return URL;
    }

    public Document getDocument() {
        return document;
    }

}
