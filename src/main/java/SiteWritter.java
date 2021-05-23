import java.io.IOException;

public class SiteWritter {

    public static void main(String[] args) throws IOException {
        Page page = new Page("https://javarush.ru/groups/posts/593-bufferedreader-i-bufferedwritter");
        BufferWritter buffWritter = new BufferWritter();
        OutputWritter outputWritter = new OutputWritter();
        outputWritter.writeFromTag(page.getDocument(),"src/main/java/fromTag.txt","div");
        buffWritter.writeAll(page.getDocument(),"src/main/java/all.txt");
    }
}
