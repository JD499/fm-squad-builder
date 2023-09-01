package git.jd499.fmsquadbuilder.domain;

import static git.jd499.fmsquadbuilder.domain.StaticMappings.ROLE_WEIGHTS;

import git.jd499.fmsquadbuilder.data.CsvDataRepository;
import java.util.List;
import java.util.Map;

public class PlayerService {
    private final CsvDataRepository csvDataRepository;

    // Change this constructor to public
    public PlayerService(CsvDataRepository csvDataRepository) {
        this.csvDataRepository = csvDataRepository;
    }

    public List<Player> getAllPlayers() {
        return csvDataRepository.readData("src/main/resources/Squad.csv").orElse(null);
    }

    public double calculateAbility(Player player, PlayerRole role) {
        double ability = 0;
        Map<String, Double> weights = ROLE_WEIGHTS.get(role);
        for (String attribute : weights.keySet()) {
            ability += player.getAttributes().getAttribute(attribute) * weights.get(attribute);
        }
        return ability;
    }

    // Business logic for player-related operations
}
