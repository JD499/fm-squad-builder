package git.jd499.fmsquadbuilder.data;

import git.jd499.fmsquadbuilder.domain.Constants;
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

public class HtmlToCsvConverter {
    public static void convertHtmlTableToCsv(String htmlFilePath) throws IOException {
        Document doc = Jsoup.parse(Files.newInputStream(Paths.get(htmlFilePath)), "UTF-8", "");
        Element table = doc.select("table").first();


        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(Constants.SQUAD_CSV_FILE_PATH));
             CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader())) {

            Elements header = null;
            if (table != null) {
                header = table.select("tbody tr th");
            }

            if (header != null) {
                csvPrinter.printRecord(header.eachText());
            }

            Elements rows = null;
            if (table != null) {
                rows = table.select("tbody tr");
            }
            if (rows != null) {
                for (Element row : rows) {
                    csvPrinter.printRecord(row.select("td").eachText());
                }
            }
        }
    }
}
