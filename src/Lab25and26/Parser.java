package Lab25and26;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Parser {
    public static void main(String[] args) throws IOException {

        JsonContainer jsonContainer = new JsonContainer();

        Document doc = Jsoup.connect("https://www.moscowmap.ru/metro.html#lines")
                .userAgent("Mozilla/5.0").get();
        Elements lines = doc.select(".js-metro-line");

        for (Element line : lines) {
            System.out.println(line.text());
            String numberLine = line.attr("data-line");
            Lines lines1 = new Lines();
            lines1.setName(line.text());
            lines1.setNumber(numberLine);
            jsonContainer.lines.add(lines1);
            Elements stations = doc.getElementsByAttributeValue("data-depend-set", "lines-"+numberLine);
            for(Element station : stations){
                Elements div_p_a_span = station.select("div p a span");
                Elements nums = div_p_a_span.select(".num");
                Elements name = div_p_a_span.select(".name");

                String[] strings = new String[nums.size()];
                for(int i = 0; i<nums.size(); i++){
                    strings[i] = name.get(i).text();
                }

                jsonContainer.stations.put(numberLine, strings);
            }
        }

        try (Writer writer = new FileWriter("Output.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(jsonContainer, writer);
        }
    }
}