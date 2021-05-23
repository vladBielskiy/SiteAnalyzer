import java.io.IOException;

public class SiteWritter {

    public static void main(String[] args) throws IOException {
        Page page = new Page("https://javarush.ru/groups/posts/593-bufferedreader-i-bufferedwritter");
        BuffWritter buffWritter = new BuffWritter();
        OutputWritter outputWritter = new OutputWritter();
        outputWritter.writeWithFileOutputStreamFromTag(page.getDocument(),"src/main/java/fromTag.txt","div");
        buffWritter.writeWithBufferWriterAll(page.getDocument(),"src/main/java/all.txt");
    }
}
