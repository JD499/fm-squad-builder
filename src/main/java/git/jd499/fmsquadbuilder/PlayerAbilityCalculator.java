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
        ability += player.getAttributes().getDri() * ADVANCED_FORWARD_WEIGHTS.get("dri");
        ability += player.getAttributes().getFin() * ADVANCED_FORWARD_WEIGHTS.get("fin");
        ability += player.getAttributes().getPas() * ADVANCED_FORWARD_WEIGHTS.get("pas");
        ability += player.getAttributes().getTec() * ADVANCED_FORWARD_WEIGHTS.get("tec");
        ability += player.getAttributes().getFir() * ADVANCED_FORWARD_WEIGHTS.get("fir");
        ability += player.getAttributes().getAnt() * ADVANCED_FORWARD_WEIGHTS.get("ant");
        ability += player.getAttributes().getDec() * ADVANCED_FORWARD_WEIGHTS.get("dec");
        ability += player.getAttributes().getOtb() * ADVANCED_FORWARD_WEIGHTS.get("otb");
        ability += player.getAttributes().getWor() * ADVANCED_FORWARD_WEIGHTS.get("wor");
        ability += player.getAttributes().getCmp() * ADVANCED_FORWARD_WEIGHTS.get("cmp");
        ability += player.getAttributes().getAcc() * ADVANCED_FORWARD_WEIGHTS.get("acc");
        ability += player.getAttributes().getAgi() * ADVANCED_FORWARD_WEIGHTS.get("agi");
        ability += player.getAttributes().getBal() * ADVANCED_FORWARD_WEIGHTS.get("bal");
        ability += player.getAttributes().getPac() * ADVANCED_FORWARD_WEIGHTS.get("pac");
        ability += player.getAttributes().getSta() * ADVANCED_FORWARD_WEIGHTS.get("sta");

        return ability;
    }

    public double calculateDefensiveWingerSupportAbility(Player player) {
        double ability = 0;
        ability += player.getAttributes().getCro() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("cro");
        ability += player.getAttributes().getDri() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("dri");
        ability += player.getAttributes().getFir() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("fir");
        ability += player.getAttributes().getMar() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("mar");
        ability += player.getAttributes().getPas() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("pas");
        ability += player.getAttributes().getTck() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("tck");
        ability += player.getAttributes().getTec() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("tec");
        ability += player.getAttributes().getAgg() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("agg");
        ability += player.getAttributes().getAnt() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("ant");
        ability += player.getAttributes().getCmp() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("cmp");
        ability += player.getAttributes().getCnt() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("cnt");
        ability += player.getAttributes().getDec() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("dec");
        ability += player.getAttributes().getOtb() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("otb");
        ability += player.getAttributes().getPos() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("pos");
        ability += player.getAttributes().getTea() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("tea");
        ability += player.getAttributes().getWor() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("wor");
        ability += player.getAttributes().getAcc() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("acc");
        ability += player.getAttributes().getSta() * DEFENSIVE_WINGER_SUPPORT_WEIGHTS.get("sta");

        return ability;
    }

    public double calculateCentralMidfielderSupportAbility(Player player) {
        double ability = 0;
        ability += player.getAttributes().getFir() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("fir");
        ability += player.getAttributes().getPas() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("pas");
        ability += player.getAttributes().getTck() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("tck");
        ability += player.getAttributes().getTec() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("tec");
        ability += player.getAttributes().getAnt() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("ant");
        ability += player.getAttributes().getCmp() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("cmp");
        ability += player.getAttributes().getCnt() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("cnt");
        ability += player.getAttributes().getDec() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("dec");
        ability += player.getAttributes().getOtb() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("otb");
        ability += player.getAttributes().getTea() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("tea");
        ability += player.getAttributes().getVis() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("vis");
        ability += player.getAttributes().getWor() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("wor");
        ability += player.getAttributes().getSta() * CENTRAL_MIDFIELDER_SUPPORT_WEIGHTS.get("sta");

        return ability;
    }

    public double calculateInvertedWingbackSupportAbility(Player player) {
        double ability = 0;
        ability += player.getAttributes().getDri() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("dri");
        ability += player.getAttributes().getFir() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("fir");
        ability += player.getAttributes().getMar() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("mar");
        ability += player.getAttributes().getPas() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("pas");
        ability += player.getAttributes().getTck() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("tck");
        ability += player.getAttributes().getTec() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("tec");
        ability += player.getAttributes().getAnt() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("ant");
        ability += player.getAttributes().getCmp() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("cmp");
        ability += player.getAttributes().getCnt() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("cnt");
        ability += player.getAttributes().getDec() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("dec");
        ability += player.getAttributes().getOtb() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("otb");
        ability += player.getAttributes().getPos() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("pos");
        ability += player.getAttributes().getTea() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("tea");
        ability += player.getAttributes().getWor() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("wor");
        ability += player.getAttributes().getAcc() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("acc");
        ability += player.getAttributes().getAgi() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("agi");
        ability += player.getAttributes().getSta() * INVERTED_WINGBACK_SUPPORT_WEIGHTS.get("sta");

        return ability;
    }

    public double calculateBallPlayingDefenderDefendAbility(Player player) {
        double ability = 0;
        ability += player.getAttributes().getFir() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("fir");
        ability += player.getAttributes().getHea() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("hea");
        ability += player.getAttributes().getMar() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("mar");
        ability += player.getAttributes().getPas() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("pas");
        ability += player.getAttributes().getTck() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("tck");
        ability += player.getAttributes().getTec() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("tec");
        ability += player.getAttributes().getAgg() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("agg");
        ability += player.getAttributes().getAnt() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("ant");
        ability += player.getAttributes().getBra() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("bra");
        ability += player.getAttributes().getCmp() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("cmp");
        ability += player.getAttributes().getCnt() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("cnt");
        ability += player.getAttributes().getDec() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("dec");
        ability += player.getAttributes().getPos() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("pos");
        ability += player.getAttributes().getVis() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("vis");
        ability += player.getAttributes().getJum() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("jum");
        ability += player.getAttributes().getPac() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("pac");
        ability += player.getAttributes().getStr() * BALL_PLAYING_DEFENDER_DEFEND_WEIGHTS.get("str");

        return ability;
    }

    public double calculateSweeperKeeperDefendAbility(Player player) {
        double ability = 0;
        ability += player.getAttributes().getAer() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("aer");
        ability += player.getAttributes().getCmd() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("cmd");
        ability += player.getAttributes().getCom() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("com");
        ability += player.getAttributes().getFir() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("fir");
        ability += player.getAttributes().getHan() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("han");
        ability += player.getAttributes().getKic() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("kic");
        ability += player.getAttributes().getOvo() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("ovo");
        ability += player.getAttributes().getPas() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("pas");
        ability += player.getAttributes().getRef() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("ref");
        ability += player.getAttributes().getTro() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("tro");
        ability += player.getAttributes().getThr() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("thr");
        ability += player.getAttributes().getAnt() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("ant");
        ability += player.getAttributes().getCmp() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("cmp");
        ability += player.getAttributes().getCnt() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("cnt");
        ability += player.getAttributes().getDec() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("dec");
        ability += player.getAttributes().getPos() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("pos");
        ability += player.getAttributes().getVis() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("vis");
        ability += player.getAttributes().getAcc() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("acc");
        ability += player.getAttributes().getAgi() * SWEEPER_KEEPER_DEFEND_WEIGHTS.get("agi");

        return ability;
    }
}

