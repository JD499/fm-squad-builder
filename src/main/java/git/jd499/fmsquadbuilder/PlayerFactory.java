package git.jd499.fmsquadbuilder;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlayerFactory {

    public static Optional<List<Player>> createPlayers(String csvFile) {
        List<Player> players = new ArrayList<>();

        try (Reader in = new FileReader(csvFile)) {
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .parse(in);
            for (CSVRecord record : records) {
                Player player = new Player(record);
                players.add(player);
            }
            return Optional.of(players);
        } catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
