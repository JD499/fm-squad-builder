package git.jd499.fmsquadbuilder.domain;



import static git.jd499.fmsquadbuilder.data.StaticMappings.ROLE_WEIGHTS;

import git.jd499.fmsquadbuilder.data.Player;
import git.jd499.fmsquadbuilder.data.PlayerRole;
import java.util.Map;

public class PlayerService {



    public double calculateAbility(Player player, PlayerRole role) {
        return ROLE_WEIGHTS.getOrDefault(role, Map.of())
                .entrySet()
                .stream()
                .mapToDouble(entry -> player.getAttributes().getAttribute(entry.getKey()) * entry.getValue())
                .sum();
    }
}
