package git.jd499.fmsquadbuilder.data;

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
        try (Reader in = new FileReader(csvFile)) {
            List<Player> players = new ArrayList<>();
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
            for (CSVRecord record : records) {
                players.add(new Player(record));
            }
            return Optional.of(players);
        } catch (IOException e) {
            return Optional.empty();
        }
    }
}
