import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class BuffWritter {
   private BufferedWriter bufferedWritter;

   public void writeWithBufferWriterAll(Document document,String fileTxt) throws IOException {
       bufferedWritter = new BufferedWriter(new FileWriter(fileTxt));
       bufferedWritter.write(String.valueOf(document));
       bufferedWritter.close();
    }

    public void writeWithBufferWriterFromTag(Document document,String fileTxt,String tag) throws IOException {
        Elements element = document.select(tag);
       bufferedWritter = new BufferedWriter(new FileWriter(fileTxt));
        bufferedWritter.write(String.valueOf(element));
        bufferedWritter.close();
    }
}
