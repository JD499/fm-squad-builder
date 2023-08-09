package git.jd499.fmsquadbuilder;

import java.util.HashMap;
import java.util.Map;

public class PlayerAbilityCalculator {


    private static final Map<String, Double> ADVANCED_FORWARD_WEIGHTS = new HashMap<>();
    private static final Map<String, Double> DEFENSIVE_WINGER_SUPPORT_WEIGHTS = new HashMap<>();
    private static final Map<String, Double> CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS = new HashMap<>();
    private static final Map<String, Double> INVERTED_WINGBACK_SUPPORT_WEIGHTS = new HashMap<>();
    private static final Map<String, Double> BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS = new HashMap<>();
    private static final Map<String, Double> SWEEPER_KEEPER_DEFEND_WEIGHTS = new HashMap<>();

    static {
        ADVANCED_FORWARD_WEIGHTS.put("dri", 0.2);
        ADVANCED_FORWARD_WEIGHTS.put("fin", 0.2);
        ADVANCED_FORWARD_WEIGHTS.put("pas", 0.1);
        ADVANCED_FORWARD_WEIGHTS.put("tec", 0.2);
        ADVANCED_FORWARD_WEIGHTS.put("fir", 0.2);
        ADVANCED_FORWARD_WEIGHTS.put("ant", 0.1);
        ADVANCED_FORWARD_WEIGHTS.put("dec", 0.1);
        ADVANCED_FORWARD_WEIGHTS.put("otb", 0.2);
        ADVANCED_FORWARD_WEIGHTS.put("wor", 0.1);
        ADVANCED_FORWARD_WEIGHTS.put("cmp", 0.2);
        ADVANCED_FORWARD_WEIGHTS.put("acc", 0.2);
        ADVANCED_FORWARD_WEIGHTS.put("agi", 0.1);
        ADVANCED_FORWARD_WEIGHTS.put("bal", 0.1);
        ADVANCED_FORWARD_WEIGHTS.put("pac", 0.1);
        ADVANCED_FORWARD_WEIGHTS.put("sta", 0.1);

    }

    static {
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("cro", 0.2);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("dri", 0.1);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("fir", 0.1);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("mar", 0.1);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("pas", 0.1);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("tck", 0.1);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("tec", 0.2);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("agg", 0.1);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("ant", 0.1);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("cmp", 0.1);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("cnt", 0.1);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("dec", 0.1);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("otb", 0.2);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("pos", 0.1);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("tea", 0.2);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("wor", 0.3);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("acc", 0.1);
        DEFENSIVE_WINGER_SUPPORT_WEIGHTS.put("sta", 0.2);
    }

    static {
        CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.put("fir", 0.2);
        CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.put("pas", 0.2);
        CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.put("tck", 0.2);
        CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.put("tec", 0.1);
        CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.put("ant", 0.1);
        CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.put("cmp", 0.1);
        CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.put("cnt", 0.1);
        CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.put("dec", 0.2);
        CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.put("otb", 0.1);
        CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.put("tea", 0.2);
        CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.put("vis", 0.1);
        CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.put("wor", 0.1);
        CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.put("sta", 0.1);
    }

    static {
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("dri", 0.1);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("fir", 0.1);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("mar", 0.2);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("pas", 0.2);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("tck", 0.2);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("tec", 0.1);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("ant", 0.1);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("cmp", 0.1);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("cnt", 0.1);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("dec", 0.2);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("otb", 0.2);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("pos", 0.1);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("tea", 0.2);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("wor", 0.2);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("acc", 0.1);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("agi", 0.1);
        INVERTED_WINGBACK_SUPPORT_WEIGHTS.put("sta", 0.2);
    }

    static {
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("fir", 0.1);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("hea", 0.2);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("mar", 0.2);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("pas", 0.2);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("tck", 0.2);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("tec", 0.1);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("agg", 0.1);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("ant", 0.1);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("bra", 0.1);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("cmp", 0.2);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("cnt", 0.1);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("dec", 0.1);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("pos", 0.2);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("vis", 0.1);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("jum", 0.2);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("pac", 0.1);
        BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.put("str", 0.2);
    }

    static {
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("aer", 0.1);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("cmd", 0.2);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("com", 0.1);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("fir", 0.1);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("han", 0.1);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("kic", 0.2);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("ovo", 0.2);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("pas", 0.1);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("ref", 0.2);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("tro", 0.1);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("thr", 0.1);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("ant", 0.2);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("cmp", 0.1);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("cnt", 0.2);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("dec", 0.1);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("pos", 0.2);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("vis", 0.1);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("acc", 0.1);
        SWEEPER_KEEPER_DEFEND_WEIGHTS.put("agi", 0.2);
    }

    public double calculateAdvancedForwardAbility(Player player) {
        double ability = 0;
        ability += player.getDri() * ADVANCED_FORWARD_WEIGHTS.get("dri");
        ability += player.getFin() * ADVANCED_FORWARD_WEIGHTS.get("fin");
        ability += player.getPas() * ADVANCED_FORWARD_WEIGHTS.get("pas");
        ability += player.getTec() * ADVANCED_FORWARD_WEIGHTS.get("tec");
        ability += player.getFir() * ADVANCED_FORWARD_WEIGHTS.get("fir");
        ability += player.getAnt() * ADVANCED_FORWARD_WEIGHTS.get("ant");
        ability += player.getDec() * ADVANCED_FORWARD_WEIGHTS.get("dec");
        ability += player.getOtb() * ADVANCED_FORWARD_WEIGHTS.get("otb");
        ability += player.getWor() * ADVANCED_FORWARD_WEIGHTS.get("wor");
        ability += player.getCmp() * ADVANCED_FORWARD_WEIGHTS.get("cmp");
        ability += player.getAcc() * ADVANCED_FORWARD_WEIGHTS.get("acc");
        ability += player.getAgi() * ADVANCED_FORWARD_WEIGHTS.get("agi");
        ability += player.getBal() * ADVANCED_FORWARD_WEIGHTS.get("bal");
        ability += player.getPac() * ADVANCED_FORWARD_WEIGHTS.get("pac");
        ability += player.getSta() * ADVANCED_FORWARD_WEIGHTS.get("sta");

        return ability;
    }

    public double calculateDefensiveWingerSupportAbility(Player player) {
        double ability = 0;
        ability += player.getCro() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("cro");
        ability += player.getDri() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("dri");
        ability += player.getFir() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("fir");
        ability += player.getMar() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("mar");
        ability += player.getPas() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("pas");
        ability += player.getTck() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("tck");
        ability += player.getTec() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("tec");
        ability += player.getAgg() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("agg");
        ability += player.getAnt() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("ant");
        ability += player.getCmp() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("cmp");
        ability += player.getCnt() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("cnt");
        ability += player.getDec() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("dec");
        ability += player.getOtb() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("otb");
        ability += player.getPos() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("pos");
        ability += player.getTea() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("tea");
        ability += player.getWor() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("wor");
        ability += player.getAcc() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("acc");
        ability += player.getSta() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("sta");

        return ability;
    }

    public double calculateCentralMidfielderSupportAbility(Player player) {
        double ability = 0;
        ability += player.getFir() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("fir");
        ability += player.getPas() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("pas");
        ability += player.getTck() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("tck");
        ability += player.getTec() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("tec");
        ability += player.getAnt() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("ant");
        ability += player.getCmp() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("cmp");
        ability += player.getCnt() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("cnt");
        ability += player.getDec() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("dec");
        ability += player.getOtb() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("otb");
        ability += player.getTea() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("tea");
        ability += player.getVis() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("vis");
        ability += player.getWor() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("wor");
        ability += player.getSta() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("sta");

        return ability;
    }

    public double calculateInvertedWingbackSupportAbility(Player player) {
        double ability = 0;
        ability += player.getDri() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("dri");
        ability += player.getFir() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("fir");
        ability += player.getMar() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("mar");
        ability += player.getPas() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("pas");
        ability += player.getTck() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("tck");
        ability += player.getTec() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("tec");
        ability += player.getAnt() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("ant");
        ability += player.getCmp() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("cmp");
        ability += player.getCnt() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("cnt");
        ability += player.getDec() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("dec");
        ability += player.getOtb() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("otb");
        ability += player.getPos() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("pos");
        ability += player.getTea() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("tea");
        ability += player.getWor() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("wor");
        ability += player.getAcc() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("acc");
        ability += player.getAgi() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("agi");
        ability += player.getSta() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("sta");

        return ability;
    }

    public double calculateBallPlayingDefenderDefendAbility(Player player) {
        double ability = 0;
        ability += player.getFir() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("fir");
        ability += player.getHea() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("hea");
        ability += player.getMar() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("mar");
        ability += player.getPas() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("pas");
        ability += player.getTck() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("tck");
        ability += player.getTec() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("tec");
        ability += player.getAgg() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("agg");
        ability += player.getAnt() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("ant");
        ability += player.getBra() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("bra");
        ability += player.getCmp() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("cmp");
        ability += player.getCnt() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("cnt");
        ability += player.getDec() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("dec");
        ability += player.getPos() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("pos");
        ability += player.getVis() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("vis");
        ability += player.getJum() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("jum");
        ability += player.getPac() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("pac");
        ability += player.getStr() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("str");

        return ability;
    }

    public double calculateSweeperKeeperDefendAbility(Player player) {
        double ability = 0;
        ability += player.getAer() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("aer");
        ability += player.getCmd() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("cmd");
        ability += player.getCom() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("com");
        ability += player.getFir() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("fir");
        ability += player.getHan() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("han");
        ability += player.getKic() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("kic");
        ability += player.getOvo() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("ovo");
        ability += player.getPas() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("pas");
        ability += player.getRef() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("ref");
        ability += player.getTro() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("tro");
        ability += player.getThr() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("thr");
        ability += player.getAnt() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("ant");
        ability += player.getCmp() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("cmp");
        ability += player.getCnt() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("cnt");
        ability += player.getDec() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("dec");
        ability += player.getPos() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("pos");
        ability += player.getVis() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("vis");
        ability += player.getAcc() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("acc");
        ability += player.getAgi() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("agi");

        return ability;
    }
}

