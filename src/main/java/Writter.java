import org.jsoup.nodes.Document;

import java.io.IOException;

public abstract class Writter {
    public abstract void writeAll(Document document, String fileTxt) throws IOException;
    public abstract void writeFromTag(Document document,String fileTxt,String tag) throws IOException;


}
