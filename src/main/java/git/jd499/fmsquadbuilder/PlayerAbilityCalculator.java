package git.jd499.fmsquadbuilder;

import java.util.HashMap;
import java.util.Map;

public class PlayerAbilityCalculator {
  private static final Map<PlayerRole, Map<String, Double>> WEIGHTS = new HashMap<>();

  static {
    WEIGHTS.put(
        PlayerRole.DEEP_LYING_FORWARD_SUPPORT,
        new HashMap<>() {
          {
            put("fin", 0.1);
            put("fir", 0.2);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.2);
            put("dec", 0.2);
            put("fla", 0.1);
            put("otb", 0.2);
            put("tea", 0.2);
            put("vis", 0.1);
            put("bal", 0.1);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.DEEP_LYING_FORWARD_ATTACK,
        new HashMap<>() {
          {
            put("dri", 0.1);
            put("fin", 0.1);
            put("fir", 0.2);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.2);
            put("dec", 0.2);
            put("fla", 0.1);
            put("otb", 0.2);
            put("tea", 0.2);
            put("vis", 0.1);
            put("bal", 0.1);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.ADVANCED_FORWARD_ATTACK,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fin", 0.2);
            put("pas", 0.1);
            put("tec", 0.2);
            put("fir", 0.2);
            put("ant", 0.1);
            put("dec", 0.1);
            put("otb", 0.2);
            put("wor", 0.1);
            put("cmp", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("bal", 0.1);
            put("pac", 0.1);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.TARGET_FORWARD_SUPPORT,
        new HashMap<>() {
          {
            put("fin", 0.1);
            put("fir", 0.1);
            put("hea", 0.2);
            put("agg", 0.1);
            put("ant", 0.1);
            put("bra", 0.2);
            put("cmp", 0.1);
            put("dec", 0.1);
            put("otb", 0.1);
            put("tea", 0.2);
            put("bal", 0.2);
            put("jmp", 0.2);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.TARGET_FORWARD_ATTACK,
        new HashMap<>() {
          {
            put("fin", 0.2);
            put("fir", 0.1);
            put("hea", 0.2);
            put("agg", 0.1);
            put("ant", 0.1);
            put("bra", 0.2);
            put("cmp", 0.2);
            put("dec", 0.1);
            put("otb", 0.2);
            put("tea", 0.1);
            put("bal", 0.2);
            put("jmp", 0.2);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.POACHER_ATTACK,
        new HashMap<>() {
          {
            put("fin", 0.2);
            put("fir", 0.1);
            put("hea", 0.1);
            put("tec", 0.1);
            put("ant", 0.2);
            put("cmp", 0.2);
            put("dec", 0.1);
            put("otb", 0.2);
            put("acc", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.COMPLETE_FORWARD_SUPPORT,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fin", 0.1);
            put("fir", 0.2);
            put("hea", 0.2);
            put("lon", 0.2);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.2);
            put("cmp", 0.2);
            put("dec", 0.2);
            put("otb", 0.2);
            put("tea", 0.1);
            put("vis", 0.2);
            put("wor", 0.1);
            put("acc", 0.2);
            put("agi", 0.2);
            put("bal", 0.1);
            put("jmp", 0.1);
            put("pac", 0.1);
            put("sta", 0.1);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.COMPLETE_FORWARD_ATTACK,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fin", 0.2);
            put("fir", 0.2);
            put("hea", 0.2);
            put("lon", 0.1);
            put("pas", 0.1);
            put("tec", 0.2);
            put("ant", 0.2);
            put("cmp", 0.2);
            put("dec", 0.1);
            put("otb", 0.2);
            put("tea", 0.1);
            put("vis", 0.1);
            put("wor", 0.1);
            put("acc", 0.2);
            put("agi", 0.2);
            put("bal", 0.1);
            put("jmp", 0.1);
            put("pac", 0.1);
            put("sta", 0.1);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.PRESSING_FORWARD_DEFEND,
        new HashMap<>() {
          {
            put("fir", 0.1);
            put("agg", 0.2);
            put("ant", 0.2);
            put("bra", 0.2);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("bal", 0.1);
            put("pac", 0.2);
            put("sta", 0.2);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.PRESSING_FORWARD_SUPPORT,
        new HashMap<>() {
          {
            put("fir", 0.1);
            put("pas", 0.1);
            put("agg", 0.2);
            put("ant", 0.2);
            put("bra", 0.2);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("otb", 0.1);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("bal", 0.1);
            put("pac", 0.2);
            put("sta", 0.2);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.PRESSING_FORWARD_ATTACK,
        new HashMap<>() {
          {
            put("fin", 0.1);
            put("fir", 0.1);
            put("agg", 0.2);
            put("ant", 0.2);
            put("bra", 0.2);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("otb", 0.2);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("bal", 0.1);
            put("pac", 0.2);
            put("sta", 0.2);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.TREQUARTISTA_ATTACK,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fin", 0.1);
            put("fir", 0.2);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.2);
            put("dec", 0.2);
            put("fla", 0.2);
            put("otb", 0.2);
            put("vis", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("bal", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.FALSE_NINE_SUPPORT,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fin", 0.1);
            put("fir", 0.2);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.2);
            put("dec", 0.2);
            put("fla", 0.1);
            put("otb", 0.2);
            put("tea", 0.1);
            put("vis", 0.2);
            put("acc", 0.2);
            put("agi", 0.2);
            put("bal", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.ATTACKING_MIDFIELDER_SUPPORT,
        new HashMap<>() {
          {
            put("dri", 0.1);
            put("fir", 0.2);
            put("lon", 0.2);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.2);
            put("cmp", 0.1);
            put("dec", 0.2);
            put("fla", 0.2);
            put("otb", 0.2);
            put("vis", 0.1);
            put("agi", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.ATTACKING_MIDFIELDER_ATTACK,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fin", 0.1);
            put("fir", 0.2);
            put("lon", 0.2);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.2);
            put("cmp", 0.1);
            put("dec", 0.2);
            put("fla", 0.2);
            put("otb", 0.2);
            put("vis", 0.1);
            put("agi", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.ADVANCED_PLAYMAKER_SUPPORT,
        new HashMap<>() {
          {
            put("dri", 0.1);
            put("fir", 0.2);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.2);
            put("dec", 0.2);
            put("fla", 0.1);
            put("otb", 0.2);
            put("tea", 0.2);
            put("vis", 0.2);
            put("agi", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.ADVANCED_PLAYMAKER_ATTACK,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fir", 0.2);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.2);
            put("dec", 0.2);
            put("fla", 0.1);
            put("otb", 0.2);
            put("tea", 0.2);
            put("vis", 0.2);
            put("acc", 0.1);
            put("agi", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.ENGANCHE_SUPPORT,
        new HashMap<>() {
          {
            put("dri", 0.1);
            put("fir", 0.2);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.2);
            put("dec", 0.2);
            put("fla", 0.1);
            put("otb", 0.1);
            put("tea", 0.1);
            put("vis", 0.2);
            put("agi", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.SHADOW_STRIKER_ATTACK,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fin", 0.2);
            put("fir", 0.2);
            put("pas", 0.1);
            put("tec", 0.1);
            put("ant", 0.2);
            put("cmp", 0.2);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("otb", 0.2);
            put("wor", 0.1);
            put("acc", 0.2);
            put("agi", 0.1);
            put("bal", 0.1);
            put("pac", 0.1);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.WINGER_SUPPORT,
        new HashMap<>() {
          {
            put("cro", 0.2);
            put("dri", 0.2);
            put("fir", 0.1);
            put("pas", 0.1);
            put("tec", 0.2);
            put("otb", 0.2);
            put("wor", 0.1);
            put("acc", 0.2);
            put("agi", 0.1);
            put("pac", 0.2);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.WINGER_ATTACK,
        new HashMap<>() {
          {
            put("cro", 0.2);
            put("dri", 0.2);
            put("fir", 0.1);
            put("pas", 0.1);
            put("tec", 0.2);
            put("ant", 0.1);
            put("fla", 0.1);
            put("otb", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("pac", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.INSIDE_FORWARD_SUPPORT,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fin", 0.1);
            put("fir", 0.2);
            put("lon", 0.1);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("fla", 0.1);
            put("otb", 0.2);
            put("vis", 0.1);
            put("acc", 0.2);
            put("agi", 0.2);
            put("bal", 0.2);
            put("pac", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.INSIDE_FORWARD_ATTACK,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fin", 0.2);
            put("fir", 0.2);
            put("lon", 0.1);
            put("pas", 0.1);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("fla", 0.1);
            put("otb", 0.2);
            put("acc", 0.2);
            put("agi", 0.2);
            put("bal", 0.2);
            put("pac", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.WIDE_TARGET_FORWARD_SUPPORT,
        new HashMap<>() {
          {
            put("cro", 0.1);
            put("fir", 0.1);
            put("hea", 0.2);
            put("ant", 0.1);
            put("bra", 0.2);
            put("otb", 0.1);
            put("tea", 0.2);
            put("wor", 0.1);
            put("bal", 0.1);
            put("jmp", 0.2);
            put("sta", 0.1);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.WIDE_TARGET_FORWARD_ATTACK,
        new HashMap<>() {
          {
            put("cro", 0.1);
            put("fin", 0.1);
            put("fir", 0.1);
            put("hea", 0.2);
            put("ant", 0.1);
            put("bra", 0.2);
            put("otb", 0.2);
            put("tea", 0.1);
            put("wor", 0.1);
            put("bal", 0.1);
            put("jmp", 0.2);
            put("sta", 0.1);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.RAMDEUTER_ATTACK,
        new HashMap<>() {
          {
            put("fin", 0.2);
            put("fir", 0.1);
            put("tec", 0.1);
            put("ant", 0.2);
            put("cmp", 0.2);
            put("cnt", 0.2);
            put("dec", 0.2);
            put("otb", 0.2);
            put("wor", 0.1);
            put("acc", 0.1);
            put("bal", 0.2);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.INVERTED_WINGER_SUPPORT,
        new HashMap<>() {
          {
            put("cro", 0.1);
            put("dri", 0.2);
            put("fir", 0.1);
            put("lon", 0.1);
            put("pas", 0.2);
            put("tec", 0.2);
            put("cmp", 0.1);
            put("dec", 0.1);
            put("otb", 0.2);
            put("vis", 0.1);
            put("wor", 0.1);
            put("acc", 0.2);
            put("agi", 0.1);
            put("pac", 0.1);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.INVERTED_WINGER_ATTACK,
        new HashMap<>() {
          {
            put("cro", 0.1);
            put("dri", 0.2);
            put("fir", 0.1);
            put("lon", 0.1);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("dec", 0.1);
            put("fla", 0.1);
            put("otb", 0.2);
            put("vis", 0.1);
            put("acc", 0.2);
            put("agi", 0.2);
            put("pac", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.CENTRAL_MIDFIELDER_DEFEND,
        new HashMap<>() {
          {
            put("fir", 0.1);
            put("mar", 0.1);
            put("pas", 0.1);
            put("tck", 0.2);
            put("tec", 0.1);
            put("agg", 0.1);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.2);
            put("dec", 0.2);
            put("pos", 0.2);
            put("tea", 0.2);
            put("vis", 0.1);
            put("wor", 0.1);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.CENTRAL_MIDFIELDER_SUPPORT,
        new HashMap<>() {
          {
            put("fir", 0.2);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("otb", 0.1);
            put("tea", 0.2);
            put("vis", 0.1);
            put("wor", 0.1);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.CENTRAL_MIDFIELDER_ATTACK,
        new HashMap<>() {
          {
            put("fir", 0.2);
            put("lon", 0.1);
            put("pas", 0.2);
            put("tck", 0.1);
            put("tec", 0.1);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("dec", 0.2);
            put("otb", 0.2);
            put("tea", 0.1);
            put("vis", 0.1);
            put("wor", 0.1);
            put("acc", 0.1);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.CENTRAL_MIDFIELDER_AUTOMATIC,
        new HashMap<>() {
          {
            put("fir", 0.2);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("otb", 0.1);
            put("tea", 0.2);
            put("vis", 0.1);
            put("wor", 0.1);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.DEEP_LYING_PLAYMAKER_DEFEND,
        new HashMap<>() {
          {
            put("fir", 0.2);
            put("pas", 0.2);
            put("tck", 0.1);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.2);
            put("dec", 0.2);
            put("pos", 0.1);
            put("tea", 0.2);
            put("vis", 0.2);
            put("bal", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.DEEP_LYING_PLAYMAKER_SUPPORT,
        new HashMap<>() {
          {
            put("fir", 0.2);
            put("pas", 0.2);

            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.2);
            put("dec", 0.2);
            put("otb", 0.1);
            put("pos", 0.1);
            put("tea", 0.2);
            put("vis", 0.2);
            put("bal", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.BOX_TO_BOX_MIDFIELDER_SUPPORT,
        new HashMap<>() {
          {
            put("dri", 0.1);
            put("fin", 0.1);
            put("fir", 0.1);
            put("lon", 0.1);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("agg", 0.1);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("dec", 0.1);
            put("otb", 0.2);
            put("pos", 0.1);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.1);
            put("bal", 0.1);
            put("pac", 0.1);
            put("sta", 0.2);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.BALL_WINNING_MIDFIELDER_DEFEND,
        new HashMap<>() {
          {
            put("mar", 0.1);
            put("tck", 0.2);
            put("agg", 0.2);
            put("ant", 0.2);
            put("bra", 0.1);
            put("cnt", 0.1);
            put("pos", 0.1);
            put("tea", 0.2);
            put("wor", 0.2);
            put("agi", 0.1);
            put("pac", 0.1);
            put("sta", 0.2);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.BALL_WINNING_MIDFIELDER_SUPPORT,
        new HashMap<>() {
          {
            put("mar", 0.1);
            put("pas", 0.1);
            put("tck", 0.2);
            put("agg", 0.2);
            put("ant", 0.2);
            put("bra", 0.1);
            put("cnt", 0.1);
            put("tea", 0.2);
            put("wor", 0.2);
            put("agi", 0.1);
            put("pac", 0.1);
            put("sta", 0.2);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.ROAMING_PLAYMAKER_SUPPORT,
        new HashMap<>() {
          {
            put("dri", 0.1);
            put("fir", 0.2);
            put("lon", 0.1);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.2);
            put("cmp", 0.2);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("otb", 0.2);
            put("pos", 0.1);
            put("tea", 0.2);
            put("vis", 0.2);
            put("wor", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("bal", 0.1);
            put("pac", 0.1);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.MEZZALA_SUPPORT,
        new HashMap<>() {
          {
            put("dri", 0.1);
            put("fir", 0.1);
            put("lon", 0.1);
            put("pas", 0.2);
            put("tck", 0.1);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("dec", 0.2);
            put("otb", 0.2);
            put("vis", 0.1);
            put("wor", 0.2);
            put("acc", 0.2);
            put("bal", 0.1);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.MEZZALA_ATTACK,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fin", 0.1);
            put("fir", 0.1);
            put("lon", 0.1);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("dec", 0.2);
            put("fla", 0.1);
            put("otb", 0.2);
            put("vis", 0.2);
            put("wor", 0.2);
            put("acc", 0.2);
            put("bal", 0.1);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.CARRILERO_SUPPORT,
        new HashMap<>() {
          {
            put("fir", 0.2);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("otb", 0.1);
            put("pos", 0.2);
            put("tea", 0.2);
            put("vis", 0.1);
            put("wor", 0.1);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.DEFENSIVE_MIDFIELDER_DEFEND,
        new HashMap<>() {
          {
            put("mar", 0.1);
            put("pas", 0.1);
            put("tck", 0.2);
            put("agg", 0.1);
            put("ant", 0.2);
            put("cmp", 0.1);
            put("cnt", 0.2);
            put("dec", 0.1);
            put("pos", 0.2);
            put("tea", 0.2);
            put("wor", 0.1);
            put("sta", 0.1);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.DEFENSIVE_MIDFIELDER_SUPPORT,
        new HashMap<>() {
          {
            put("fir", 0.1);
            put("mar", 0.1);
            put("pas", 0.1);
            put("tck", 0.2);
            put("agg", 0.1);
            put("ant", 0.2);
            put("cmp", 0.1);
            put("cnt", 0.2);
            put("dec", 0.1);
            put("pos", 0.2);
            put("tea", 0.2);
            put("wor", 0.1);
            put("sta", 0.1);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.ANCHOR_DEFEND,
        new HashMap<>() {
          {
            put("mar", 0.2);
            put("tck", 0.2);
            put("ant", 0.2);
            put("cmp", 0.1);
            put("cnt", 0.2);
            put("dec", 0.2);
            put("pos", 0.2);
            put("tea", 0.1);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.HALF_BACK_DEFEND,
        new HashMap<>() {
          {
            put("fir", 0.1);
            put("mar", 0.2);
            put("pas", 0.1);
            put("tck", 0.2);
            put("agg", 0.1);
            put("ant", 0.2);
            put("bra", 0.1);
            put("cmp", 0.2);
            put("cnt", 0.2);
            put("dec", 0.2);
            put("pos", 0.2);
            put("tea", 0.2);
            put("wor", 0.1);
            put("jmp", 0.1);
            put("sta", 0.1);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.REGISTA_SUPPORT,
        new HashMap<>() {
          {
            put("dri", 0.1);
            put("fir", 0.2);
            put("lon", 0.1);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.2);
            put("dec", 0.2);
            put("fla", 0.2);
            put("otb", 0.2);
            put("tea", 0.2);
            put("vis", 0.2);
            put("bal", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.SEGUNDO_VOLANTE_SUPPORT,
        new HashMap<>() {
          {
            put("fin", 0.1);
            put("fir", 0.1);
            put("lon", 0.1);
            put("mar", 0.2);
            put("pas", 0.2);
            put("tck", 0.2);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("otb", 0.2);
            put("pos", 0.2);
            put("wor", 0.2);
            put("acc", 0.1);
            put("bal", 0.1);
            put("pac", 0.2);
            put("sta", 0.2);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.SEGUNDO_VOLANTE_ATTACK,
        new HashMap<>() {
          {
            put("fin", 0.2);
            put("fir", 0.1);
            put("lon", 0.2);
            put("mar", 0.1);
            put("pas", 0.2);
            put("tck", 0.2);
            put("ant", 0.2);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("otb", 0.2);
            put("pos", 0.2);
            put("wor", 0.2);
            put("acc", 0.1);
            put("bal", 0.1);
            put("pac", 0.2);
            put("sta", 0.2);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.WIDE_MIDFIELDER_DEFEND,
        new HashMap<>() {
          {
            put("cro", 0.1);
            put("fir", 0.1);
            put("mar", 0.1);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.2);
            put("dec", 0.2);
            put("pos", 0.2);
            put("tea", 0.2);
            put("wor", 0.2);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.WIDE_MIDFIELDER_SUPPORT,
        new HashMap<>() {
          {
            put("cro", 0.1);
            put("fir", 0.1);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("otb", 0.1);
            put("pos", 0.2);
            put("tea", 0.2);
            put("vis", 0.1);
            put("wor", 0.2);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.WIDE_MIDFIELDER_ATTACK,
        new HashMap<>() {
          {
            put("cro", 0.2);
            put("fir", 0.2);
            put("pas", 0.2);
            put("tck", 0.1);
            put("tec", 0.1);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("dec", 0.2);
            put("otb", 0.1);
            put("tea", 0.2);
            put("vis", 0.1);
            put("wor", 0.2);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.WIDE_MIDFIELDER_AUTOMATIC,
        new HashMap<>() {
          {
            put("cro", 0.1);
            put("fir", 0.1);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("otb", 0.1);
            put("pos", 0.1);
            put("tea", 0.2);
            put("vis", 0.1);
            put("wor", 0.2);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.DEFENSIVE_WINGER_DEFEND,
        new HashMap<>() {
          {
            put("cro", 0.1);
            put("dri", 0.1);
            put("fir", 0.1);
            put("mar", 0.1);
            put("tck", 0.1);
            put("tec", 0.2);
            put("agg", 0.1);
            put("ant", 0.2);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("otb", 0.2);
            put("pos", 0.2);
            put("tea", 0.2);
            put("wor", 0.3);
            put("acc", 0.1);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.DEFENSIVE_WINGER_SUPPORT,
        new HashMap<>() {
          {
            put("cro", 0.2);
            put("dri", 0.1);
            put("fir", 0.1);
            put("mar", 0.1);
            put("pas", 0.1);
            put("tck", 0.1);
            put("tec", 0.2);
            put("agg", 0.1);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("otb", 0.2);
            put("pos", 0.1);
            put("tea", 0.2);
            put("wor", 0.3);
            put("acc", 0.1);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.WIDE_PLAYMAKER_SUPPORT,
        new HashMap<>() {
          {
            put("dri", 0.1);
            put("fir", 0.2);
            put("pas", 0.2);
            put("tec", 0.2);
            put("cmp", 0.2);
            put("dec", 0.2);
            put("otb", 0.1);
            put("tea", 0.2);
            put("vis", 0.2);
            put("agi", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.WIDE_PLAYMAKER_ATTACK,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fir", 0.2);
            put("pas", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.2);
            put("dec", 0.2);
            put("fla", 0.1);
            put("otb", 0.2);
            put("tea", 0.2);
            put("vis", 0.2);
            put("acc", 0.1);
            put("agi", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.CENTRAL_DEFENDER_DEFEND,
        new HashMap<>() {
          {
            put("hea", 0.2);
            put("mar", 0.2);
            put("tck", 0.2);
            put("agg", 0.1);
            put("ant", 0.1);
            put("bra", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("pos", 0.2);
            put("jmp", 0.2);
            put("pac", 0.1);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.CENTRAL_DEFENDER_STOPPER,
        new HashMap<>() {
          {
            put("hea", 0.2);
            put("mar", 0.1);
            put("tck", 0.2);
            put("agg", 0.2);
            put("ant", 0.1);
            put("bra", 0.2);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("pos", 0.2);
            put("jmp", 0.2);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.CENTRAL_DEFENDER_COVER,
        new HashMap<>() {
          {
            put("hea", 0.1);
            put("mar", 0.2);
            put("tck", 0.2);
            put("ant", 0.2);
            put("bra", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.2);
            put("dec", 0.2);
            put("pos", 0.2);
            put("jmp", 0.1);
            put("pac", 0.2);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.LIBERO_SUPPORT,
        new HashMap<>() {
          {
            put("dri", 0.1);
            put("fir", 0.2);
            put("hea", 0.1);
            put("mar", 0.2);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.2);
            put("bra", 0.1);
            put("cmp", 0.2);
            put("cnt", 0.2);
            put("dec", 0.2);
            put("fla", 0.1);
            put("pos", 0.2);
            put("tea", 0.2);
            put("vis", 0.2);
            put("agi", 0.1);
            put("bal", 0.1);
            put("jmp", 0.1);
            put("pac", 0.2);
            put("sta", 0.1);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.LIBERO_ATTACK,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fir", 0.2);
            put("hea", 0.1);
            put("lon", 0.1);
            put("mar", 0.2);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.2);
            put("bra", 0.1);
            put("cmp", 0.2);
            put("cnt", 0.2);
            put("dec", 0.2);
            put("fla", 0.2);
            put("pos", 0.2);
            put("tea", 0.2);
            put("vis", 0.2);
            put("acc", 0.1);
            put("agi", 0.1);
            put("bal", 0.1);
            put("jmp", 0.1);
            put("pac", 0.2);
            put("sta", 0.1);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.BALL_PLAYING_DEFENDER_DEFEND,
        new HashMap<>() {
          {
            put("fir", 0.1);
            put("hea", 0.2);
            put("mar", 0.2);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("agg", 0.1);
            put("ant", 0.1);
            put("bra", 0.1);
            put("cmp", 0.2);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("pos", 0.2);
            put("vis", 0.1);
            put("jum", 0.2);
            put("pac", 0.1);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.BALL_PLAYING_DEFENDER_STOPPER,
        new HashMap<>() {
          {
            put("fir", 0.1);
            put("hea", 0.2);
            put("mar", 0.1);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("agg", 0.2);
            put("ant", 0.1);
            put("bra", 0.2);
            put("cmp", 0.2);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("pos", 0.2);
            put("vis", 0.1);
            put("jum", 0.2);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.BALL_PLAYING_DEFENDER_COVER,
        new HashMap<>() {
          {
            put("fir", 0.1);
            put("hea", 0.1);
            put("mar", 0.1);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.2);
            put("bra", 0.1);
            put("cmp", 0.2);
            put("cnt", 0.2);
            put("dec", 0.2);
            put("pos", 0.2);
            put("vis", 0.1);
            put("jum", 0.1);
            put("pac", 0.2);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.NO_NONSENSE_CENTER_BACK_DEFEND,
        new HashMap<>() {
          {
            put("hea", 0.2);
            put("mar", 0.2);
            put("tck", 0.2);
            put("agg", 0.1);
            put("ant", 0.1);
            put("bra", 0.1);
            put("cnt", 0.1);
            put("pos", 0.2);
            put("jmp", 0.2);
            put("pac", 0.1);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.NO_NONSENSE_CENTER_BACK_STOPPER,
        new HashMap<>() {
          {
            put("hea", 0.2);
            put("mar", 0.1);
            put("tck", 0.2);
            put("agg", 0.2);
            put("ant", 0.1);
            put("bra", 0.2);
            put("cnt", 0.1);
            put("pos", 0.2);
            put("jmp", 0.2);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.NO_NONSENSE_CENTER_BACK_COVER,
        new HashMap<>() {
          {
            put("hea", 0.1);
            put("mar", 0.2);
            put("tck", 0.2);
            put("ant", 0.2);
            put("bra", 0.1);
            put("cnt", 0.2);
            put("pos", 0.2);
            put("jmp", 0.1);
            put("pac", 0.2);
            put("str", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.WIDE_CENTER_BACK_DEFEND,
        new HashMap<>() {
          {
            put("cro", 0.2);
            put("dri", 0.1);
            put("hea", 0.2);
            put("mar", 0.2);
            put("tck", 0.2);
            put("agg", 0.1);
            put("ant", 0.1);
            put("bra", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("pos", 0.2);
            put("wor", 0.1);
            put("jmp", 0.2);
            put("pac", 0.1);
            put("sta", 0.2);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.WIDE_CENTER_BACK_SUPPORT,
        new HashMap<>() {
          {
            put("cro", 0.2);
            put("dri", 0.2);
            put("hea", 0.2);
            put("mar", 0.2);
            put("tck", 0.2);
            put("agg", 0.1);
            put("ant", 0.1);
            put("bra", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("otb", 0.1);
            put("pos", 0.2);
            put("wor", 0.1);
            put("jmp", 0.2);
            put("pac", 0.2);
            put("sta", 0.2);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.WIDE_CENTER_BACK_ATTACK,
        new HashMap<>() {
          {
            put("cro", 0.2);
            put("dri", 0.2);
            put("hea", 0.2);
            put("mar", 0.2);
            put("tck", 0.2);
            put("agg", 0.1);
            put("ant", 0.1);
            put("bra", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("otb", 0.2);
            put("pos", 0.1);
            put("wor", 0.1);
            put("jmp", 0.2);
            put("pac", 0.2);
            put("sta", 0.2);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.FULL_BACK_DEFEND,
        new HashMap<>() {
          {
            put("cro", 0.1);
            put("mar", 0.2);
            put("pas", 0.1);
            put("tck", 0.2);
            put("ant", 0.2);
            put("cmp", 0.1);
            put("cnt", 0.2);
            put("dec", 0.1);
            put("pos", 0.2);
            put("tea", 0.1);
            put("pac", 0.1);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.FULL_BACK_SUPPORT,
        new HashMap<>() {
          {
            put("cro", 0.1);
            put("dri", 0.1);
            put("mar", 0.2);
            put("pas", 0.1);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.2);
            put("cmp", 0.1);
            put("cnt", 0.2);
            put("dec", 0.1);
            put("pos", 0.2);
            put("tea", 0.2);
            put("wor", 0.2);
            put("pac", 0.1);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.FULL_BACK_ATTACK,
        new HashMap<>() {
          {
            put("cro", 0.2);
            put("dri", 0.1);
            put("fir", 0.1);
            put("mar", 0.1);
            put("pas", 0.1);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.2);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("otb", 0.1);
            put("pos", 0.2);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.1);
            put("agi", 0.1);
            put("pac", 0.2);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.FULL_BACK_AUTOMATIC,
        new HashMap<>() {
          {
            put("cro", 0.1);
            put("dri", 0.1);
            put("mar", 0.2);
            put("pas", 0.1);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.2);
            put("cmp", 0.1);
            put("cnt", 0.2);
            put("dec", 0.1);
            put("pos", 0.2);
            put("tea", 0.2);
            put("wor", 0.2);
            put("pac", 0.1);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.WING_BACK_DEFEND,
        new HashMap<>() {
          {
            put("cro", 0.1);
            put("dri", 0.1);
            put("fir", 0.1);
            put("mar", 0.2);
            put("pas", 0.1);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.2);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("otb", 0.1);
            put("pos", 0.2);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("pac", 0.1);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.WING_BACK_SUPPORT,
        new HashMap<>() {
          {
            put("cro", 0.2);
            put("dri", 0.2);
            put("fir", 0.1);
            put("mar", 0.2);
            put("pas", 0.1);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.1);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("otb", 0.2);
            put("pos", 0.1);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("pac", 0.1);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.WING_BACK_ATTACK,
        new HashMap<>() {
          {
            put("cro", 0.2);
            put("dri", 0.2);
            put("fir", 0.1);
            put("mar", 0.1);
            put("pas", 0.1);
            put("tck", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("fla", 0.1);
            put("otb", 0.2);
            put("pos", 0.1);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("pac", 0.2);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.WING_BACK_AUTOMATIC,
        new HashMap<>() {
          {
            put("cro", 0.2);
            put("dri", 0.2);
            put("fir", 0.1);
            put("mar", 0.2);
            put("pas", 0.1);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.1);
            put("cnt", 0.1);
            put("dec", 0.1);
            put("otb", 0.2);
            put("pos", 0.1);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("pac", 0.1);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.NO_NONSENSE_FULL_BACK_DEFEND,
        new HashMap<>() {
          {
            put("hea", 0.1);
            put("mar", 0.2);
            put("tck", 0.2);
            put("agg", 0.1);
            put("ant", 0.2);
            put("bra", 0.1);
            put("cnt", 0.1);
            put("pos", 0.2);
            put("tea", 0.1);
            put("str", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.COMPLETE_WING_BACK_SUPPORT,
        new HashMap<>() {
          {
            put("cro", 0.2);
            put("dri", 0.2);
            put("fir", 0.2);
            put("pas", 0.2);
            put("tck", 0.1);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("dec", 0.2);
            put("fla", 0.1);
            put("otb", 0.2);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("bal", 0.1);
            put("pac", 0.2);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.COMPLETE_WING_BACK_ATTACK,
        new HashMap<>() {
          {
            put("cro", 0.2);
            put("dri", 0.2);
            put("fir", 0.2);
            put("pas", 0.2);
            put("tck", 0.1);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("dec", 0.2);
            put("fla", 0.2);
            put("otb", 0.2);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("bal", 0.1);
            put("pac", 0.2);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.INVERTED_WING_BACK_DEFEND,
        new HashMap<>() {
          {
            put("dri", 0.1);
            put("fir", 0.1);
            put("mar", 0.2);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.2);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("otb", 0.1);
            put("pos", 0.2);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.1);
            put("agi", 0.1);
            put("sta", 0.1);
          }
        });
    WEIGHTS.put(
        PlayerRole.INVERTED_WING_BACK_SUPPORT,
        new HashMap<>() {
          {
            put("dri", 0.1);
            put("fir", 0.1);
            put("mar", 0.2);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("otb", 0.2);
            put("pos", 0.1);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.1);
            put("agi", 0.1);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.INVERTED_WING_BACK_ATTACK,
        new HashMap<>() {
          {
            put("dri", 0.2);
            put("fir", 0.1);
            put("lon", 0.1);
            put("mar", 0.2);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.2);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("fla", 0.1);
            put("otb", 0.2);
            put("pos", 0.1);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.2);
            put("agi", 0.1);
            put("pac", 0.1);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.INVERTED_WING_BACK_AUTOMATIC,
        new HashMap<>() {
          {
            put("dri", 0.1);
            put("fir", 0.1);
            put("mar", 0.2);
            put("pas", 0.2);
            put("tck", 0.2);
            put("tec", 0.1);
            put("ant", 0.1);
            put("cmp", 0.1);
            put("cnt", 0.1);
            put("dec", 0.2);
            put("otb", 0.2);
            put("pos", 0.1);
            put("tea", 0.2);
            put("wor", 0.2);
            put("acc", 0.1);
            put("agi", 0.1);
            put("sta", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.GOALKEEPER_DEFEND,
        new HashMap<>() {
          {
            put("aer", 0.2);
            put("cmd", 0.2);
            put("com", 0.2);
            put("han", 0.2);
            put("kic", 0.2);
            put("ovo", 0.1);
            put("ref", 0.2);
            put("thr", 0.1);
            put("ant", 0.1);
            put("cnt", 0.2);
            put("dec", 0.1);
            put("pos", 0.2);
            put("agi", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.SWEEPER_KEEPER_DEFEND,
        new HashMap<>() {
          {
            put("aer", 0.1);
            put("cmd", 0.2);
            put("com", 0.1);
            put("fir", 0.1);
            put("han", 0.1);
            put("kic", 0.2);
            put("ovo", 0.2);
            put("pas", 0.1);
            put("ref", 0.2);
            put("tro", 0.1);
            put("thr", 0.1);
            put("ant", 0.2);
            put("cmp", 0.1);
            put("cnt", 0.2);
            put("dec", 0.1);
            put("pos", 0.2);
            put("vis", 0.1);
            put("acc", 0.1);
            put("agi", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.SWEEPER_KEEPER_SUPPORT,
        new HashMap<>() {
          {
            put("aer", 0.1);
            put("cmd", 0.2);
            put("com", 0.1);
            put("fir", 0.1);
            put("han", 0.1);
            put("kic", 0.2);
            put("ovo", 0.2);
            put("pas", 0.1);
            put("ref", 0.2);
            put("tro", 0.2);
            put("thr", 0.1);
            put("ant", 0.2);
            put("cmp", 0.2);
            put("cnt", 0.2);
            put("dec", 0.1);
            put("pos", 0.2);
            put("vis", 0.1);
            put("acc", 0.1);
            put("agi", 0.2);
          }
        });
    WEIGHTS.put(
        PlayerRole.SWEEPER_KEEPER_ATTACK,
        new HashMap<>() {
          {
            put("aer", 0.1);
            put("cmd", 0.2);
            put("com", 0.1);
            put("ecc", 0.1);
            put("fir", 0.1);
            put("han", 0.1);
            put("kic", 0.2);
            put("ovo", 0.2);
            put("pas", 0.1);
            put("ref", 0.2);
            put("tro", 0.2);
            put("thr", 0.1);
            put("ant", 0.2);
            put("cmp", 0.2);
            put("cnt", 0.2);
            put("dec", 0.1);
            put("pos", 0.2);
            put("vis", 0.1);
            put("acc", 0.1);
            put("agi", 0.2);
          }
        });
  }

  public double calculateAbility(Player player, PlayerRole role) {
    double ability = 0;
    Map<String, Double> weights = WEIGHTS.get(role);
    for (String attribute : weights.keySet()) {
      ability += player.getAttributes().getAttribute(attribute) * weights.get(attribute);
    }
    return ability;
  }

  public enum PlayerRole {
    DEEP_LYING_FORWARD_SUPPORT,
    DEEP_LYING_FORWARD_ATTACK,
    ADVANCED_FORWARD_ATTACK,
    TARGET_FORWARD_SUPPORT,
    TARGET_FORWARD_ATTACK,
    POACHER_ATTACK,
    COMPLETE_FORWARD_SUPPORT,
    COMPLETE_FORWARD_ATTACK,
    PRESSING_FORWARD_DEFEND,
    PRESSING_FORWARD_SUPPORT,
    PRESSING_FORWARD_ATTACK,
    TREQUARTISTA_ATTACK,
    FALSE_NINE_SUPPORT,
    ATTACKING_MIDFIELDER_SUPPORT,
    ATTACKING_MIDFIELDER_ATTACK,
    ADVANCED_PLAYMAKER_SUPPORT,
    ADVANCED_PLAYMAKER_ATTACK,
    ENGANCHE_SUPPORT,
    SHADOW_STRIKER_ATTACK,
    WINGER_SUPPORT,
    WINGER_ATTACK,
    INSIDE_FORWARD_SUPPORT,
    INSIDE_FORWARD_ATTACK,
    WIDE_TARGET_FORWARD_SUPPORT,
    WIDE_TARGET_FORWARD_ATTACK,
    RAMDEUTER_ATTACK,
    INVERTED_WINGER_SUPPORT,
    INVERTED_WINGER_ATTACK,
    CENTRAL_MIDFIELDER_DEFEND,
    CENTRAL_MIDFIELDER_SUPPORT,
    CENTRAL_MIDFIELDER_ATTACK,
    CENTRAL_MIDFIELDER_AUTOMATIC,
    DEEP_LYING_PLAYMAKER_DEFEND,
    DEEP_LYING_PLAYMAKER_SUPPORT,
    BOX_TO_BOX_MIDFIELDER_SUPPORT,
    BALL_WINNING_MIDFIELDER_DEFEND,
    BALL_WINNING_MIDFIELDER_SUPPORT,
    ROAMING_PLAYMAKER_SUPPORT,
    MEZZALA_SUPPORT,
    MEZZALA_ATTACK,
    CARRILERO_SUPPORT,
    DEFENSIVE_MIDFIELDER_DEFEND,
    DEFENSIVE_MIDFIELDER_SUPPORT,
    ANCHOR_DEFEND,
    HALF_BACK_DEFEND,
    REGISTA_SUPPORT,
    SEGUNDO_VOLANTE_SUPPORT,
    SEGUNDO_VOLANTE_ATTACK,
    WIDE_MIDFIELDER_DEFEND,
    WIDE_MIDFIELDER_SUPPORT,
    WIDE_MIDFIELDER_ATTACK,
    WIDE_MIDFIELDER_AUTOMATIC,
    DEFENSIVE_WINGER_DEFEND,
    DEFENSIVE_WINGER_SUPPORT,
    WIDE_PLAYMAKER_SUPPORT,
    WIDE_PLAYMAKER_ATTACK,
    CENTRAL_DEFENDER_DEFEND,
    CENTRAL_DEFENDER_STOPPER,
    CENTRAL_DEFENDER_COVER,
    LIBERO_SUPPORT,
    LIBERO_ATTACK,
    BALL_PLAYING_DEFENDER_DEFEND,
    BALL_PLAYING_DEFENDER_STOPPER,
    BALL_PLAYING_DEFENDER_COVER,
    NO_NONSENSE_CENTER_BACK_DEFEND,
    NO_NONSENSE_CENTER_BACK_STOPPER,
    NO_NONSENSE_CENTER_BACK_COVER,
    WIDE_CENTER_BACK_DEFEND,
    WIDE_CENTER_BACK_SUPPORT,
    WIDE_CENTER_BACK_ATTACK,
    FULL_BACK_DEFEND,
    FULL_BACK_SUPPORT,
    FULL_BACK_ATTACK,
    FULL_BACK_AUTOMATIC,
    WING_BACK_DEFEND,
    WING_BACK_SUPPORT,
    WING_BACK_ATTACK,
    WING_BACK_AUTOMATIC,
    NO_NONSENSE_FULL_BACK_DEFEND,
    COMPLETE_WING_BACK_SUPPORT,
    COMPLETE_WING_BACK_ATTACK,
    INVERTED_WING_BACK_DEFEND,
    INVERTED_WING_BACK_SUPPORT,
    INVERTED_WING_BACK_ATTACK,
    INVERTED_WING_BACK_AUTOMATIC,
    GOALKEEPER_DEFEND,
    SWEEPER_KEEPER_DEFEND,
    SWEEPER_KEEPER_SUPPORT,
    SWEEPER_KEEPER_ATTACK,
  }
}
