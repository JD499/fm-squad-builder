package git.jd499.fmsquadbuilder.data;

import git.jd499.fmsquadbuilder.domain.Player;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class CsvDataRepository implements DataRepository {
    @Override
    public Optional<List<Player>> readData(String csvFile) {
        List<Player> players = new ArrayList<>();
        try (Reader in = new FileReader(csvFile)) {
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
            for (CSVRecord record : records) {
                Player player = new Player(record);  // Assuming Player has a constructor that accepts CSVRecord
                players.add(player);
            }
            return Optional.of(players);
        } catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
