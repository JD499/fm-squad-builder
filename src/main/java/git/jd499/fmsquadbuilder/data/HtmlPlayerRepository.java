package git.jd499.fmsquadbuilder.data;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlPlayerRepository {

    public static List<Player> convertHtmlToPlayers(String htmlFilePath) throws IOException {
        List<Player> players = new ArrayList<>();
        Document doc = Jsoup.parse(Files.newInputStream(Paths.get(htmlFilePath)), "UTF-8", "");
        Element table = doc.select("table").first();

        if (table != null) {
            Elements rows = table.select("tbody tr");
            for (int i = 1; i < rows.size(); i++) {  // Start from the second row
                Element row = rows.get(i);
                Player player = createPlayerFromRow(row);
                players.add(player);
            }
        }
        return players;

    }

    private static Player createPlayerFromRow(Element row) {
        Elements cells = row.select("td");

        // Extracting PlayerBasicInfo
        PlayerBasicInfo basicInfo = new PlayerBasicInfo(
                cells.get(0).text(),  // Name
                Integer.parseInt(cells.get(1).text()),  // Age
                cells.get(2).text(),  // Nat
                cells.get(3).text(),  // Club
                cells.get(4).text(),  // Position
                cells.get(5).text(),  // Sec. Position
                cells.get(6).text(),  // Media Description
                cells.get(7).text(),  // Personality
                cells.get(8).text(),  // Height
                cells.get(9).text(),  // Weight



                cells.get(59).text(), // Transfer Value
                cells.get(61).text(), // Transfer Status
                cells.get(62).text(), // Asking Price
                cells.get(63).text(), // Av Rat
                cells.get(64).text(), // Max AP
                cells.get(65).text(), // Min WD
                cells.get(66).text()  // Max WD
        );

        // Extracting PlayerAttributes (assuming attributes start from 17th cell)
        PlayerAttributes attributes = new PlayerAttributes(
                Integer.parseInt(cells.get(10).text()),// Acc
                Integer.parseInt(cells.get(11).text()),// Aer
                Integer.parseInt(cells.get(12).text()),// Agg
                Integer.parseInt(cells.get(13).text()),// Agi
                Integer.parseInt(cells.get(14).text()),// Ant
                Integer.parseInt(cells.get(15).text()),// Bal
                Integer.parseInt(cells.get(16).text()),// Bra
                Integer.parseInt(cells.get(17).text()),// Cmd
                Integer.parseInt(cells.get(18).text()),// Com
                Integer.parseInt(cells.get(19).text()),// Cmp
                Integer.parseInt(cells.get(20).text()),// Cnt
                Integer.parseInt(cells.get(21).text()),// Cor
                Integer.parseInt(cells.get(22).text()),// Cro
                Integer.parseInt(cells.get(23).text()),// Dec
                Integer.parseInt(cells.get(24).text()),// Det
                Integer.parseInt(cells.get(25).text()),// Dri
                Integer.parseInt(cells.get(26).text()),// Ecc
                Integer.parseInt(cells.get(27).text()),// Fin
                Integer.parseInt(cells.get(28).text()),// Fir
                Integer.parseInt(cells.get(29).text()),// Fla
                Integer.parseInt(cells.get(30).text()),// Fre
                Integer.parseInt(cells.get(31).text()),// Han
                Integer.parseInt(cells.get(32).text()),// Hea
                Integer.parseInt(cells.get(33).text()),// Jum
                Integer.parseInt(cells.get(34).text()),// Kic
                Integer.parseInt(cells.get(35).text()),// Ldr
                Integer.parseInt(cells.get(36).text()),// Lon
                Integer.parseInt(cells.get(37).text()),// Lth
                Integer.parseInt(cells.get(38).text()),// Mar
                Integer.parseInt(cells.get(39).text()),// Nat
                Integer.parseInt(cells.get(40).text()),// Otb
                Integer.parseInt(cells.get(41).text()),// Ovo
                Integer.parseInt(cells.get(42).text()),// Pac
                Integer.parseInt(cells.get(43).text()),// Pas
                Integer.parseInt(cells.get(44).text()),// Pen
                Integer.parseInt(cells.get(45).text()),// Pos
                Integer.parseInt(cells.get(46).text()),// Pun
                Integer.parseInt(cells.get(47).text()),// Ref
                Integer.parseInt(cells.get(48).text()),// Tro
                Integer.parseInt(cells.get(49).text()),// Sta
                Integer.parseInt(cells.get(50).text()),// Str
                Integer.parseInt(cells.get(51).text()),// Tck
                Integer.parseInt(cells.get(52).text()),// Tea
                Integer.parseInt(cells.get(53).text()),// Tec
                Integer.parseInt(cells.get(54).text()),// Thr
                Integer.parseInt(cells.get(55).text()),// Vis
                Integer.parseInt(cells.get(56).text()) // Wor

        );

        // Extracting PlayerContractInfo (assuming contract info starts from 51st cell)
        PlayerContractInfo contractInfo = new PlayerContractInfo(
                cells.get(57).text(),  // Expires
                cells.get(58).text()   // Salary
        );

        return new Player(basicInfo, attributes, contractInfo);
    }


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
