package git.jd499.fmsquadbuilder;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlTableToCsv {

  public static void convertHtmlTableToCsv(String htmlFilePath, String csvFilePath)
      throws IOException {
    Document doc = Jsoup.parse(Files.newInputStream(Paths.get(htmlFilePath)), "UTF-8", "");
    Element table = doc.select("table").first();

    try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(csvFilePath));
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader())) {

      Elements header = table.select("tbody tr th");
      csvPrinter.printRecord(header.eachText());

      Elements rows = table.select("tbody tr");
      for (Element row : rows) {
        csvPrinter.printRecord(row.select("td").eachText());
      }
    }
  }
}
