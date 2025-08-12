import java.io.IOException;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GenerateAAIParser {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the URL of the web page to parse:");
        String url = scanner.nextLine();

        Document doc = Jsoup.connect(url).get();
        Elements elements = doc.select("body");

        System.out.println("Parsing web page...");
        for (Element element : elements) {
            System.out.println("HTML Content: " + element.html());
            System.out.println("Text Content: " + element.text());
        }

        System.out.println("Parsing completed!");
    }
}