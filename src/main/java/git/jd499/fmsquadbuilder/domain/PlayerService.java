package git.jd499.fmsquadbuilder.domain;

import static git.jd499.fmsquadbuilder.domain.StaticMappings.ROLE_WEIGHTS;

import git.jd499.fmsquadbuilder.data.CsvDataRepository;
import java.util.List;
import java.util.Map;

public class PlayerService {
    private final CsvDataRepository csvDataRepository;

    public PlayerService(CsvDataRepository csvDataRepository) {
        this.csvDataRepository = csvDataRepository;
    }

    public List<Player> getAllPlayers() {
        return csvDataRepository.readData(Constants.SQUAD_CSV_FILE_PATH).orElse(null);
    }

    public double calculateAbility(Player player, PlayerRole role) {
        return ROLE_WEIGHTS.getOrDefault(role, Map.of())
                .entrySet()
                .stream()
                .mapToDouble(entry -> player.getAttributes().getAttribute(entry.getKey()) * entry.getValue())
                .sum();
    }
}
