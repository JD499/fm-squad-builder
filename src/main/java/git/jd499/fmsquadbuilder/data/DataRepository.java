package git.jd499.fmsquadbuilder.data;

import git.jd499.fmsquadbuilder.domain.Player;
import java.util.List;
import java.util.Optional;

public interface DataRepository {
    Optional<List<Player>> readData(String source);
}

