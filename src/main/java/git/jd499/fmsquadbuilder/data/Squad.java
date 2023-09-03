package git.jd499.fmsquadbuilder.data;

import java.util.ArrayList;
import java.util.List;

public class Squad {

    private List<Player> players;

    public Squad() {
        this.players = new ArrayList<>();
    }

    public Squad(List<Player> players) {
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }
}
