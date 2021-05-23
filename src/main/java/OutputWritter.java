import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;

public class OutputWritter extends Writter{
    private FileOutputStream fileOutputStream;

    public void writeAll(Document document, String fileTxt) throws IOException {
        fileOutputStream = new FileOutputStream(fileTxt);
        byte[] buffer = String.valueOf(document).getBytes();
        fileOutputStream.write(buffer);
        fileOutputStream.close();
    }

    public void writeFromTag(Document document,String fileTxt,String tag) throws IOException {
        Elements element = document.select(tag);
        fileOutputStream = new FileOutputStream(fileTxt);
        byte[] buffer = String.valueOf(element).getBytes();
        fileOutputStream.write(buffer);
        fileOutputStream.close();
    }

}
