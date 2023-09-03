package git.jd499.fmsquadbuilder.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaticMappings {
    public static final Map<Integer, SimplifiedPositions> DOT_TO_SimplifiedPositions;
    public static final Map<SimplifiedPositions, List<PlayerRole>> SimplifiedPositions_TO_ROLES;
    public static final Map<String, List<SimplifiedPositions>> PLAYER_POSITION_TO_SimplifiedPositions;
    public static final Map<PlayerRole, Map<String, Double>> ROLE_WEIGHTS;

    static {
        DOT_TO_SimplifiedPositions = new HashMap<>();
        DOT_TO_SimplifiedPositions.put(0, SimplifiedPositions.ST);
        DOT_TO_SimplifiedPositions.put(1, SimplifiedPositions.ST);
        DOT_TO_SimplifiedPositions.put(2, SimplifiedPositions.ST);
        DOT_TO_SimplifiedPositions.put(3, SimplifiedPositions.AML);
        DOT_TO_SimplifiedPositions.put(4, SimplifiedPositions.AMC);
        DOT_TO_SimplifiedPositions.put(5, SimplifiedPositions.AMC);
        DOT_TO_SimplifiedPositions.put(6, SimplifiedPositions.AMC);
        DOT_TO_SimplifiedPositions.put(7, SimplifiedPositions.AMR);
        DOT_TO_SimplifiedPositions.put(8, SimplifiedPositions.ML);
        DOT_TO_SimplifiedPositions.put(9, SimplifiedPositions.MC);
        DOT_TO_SimplifiedPositions.put(10, SimplifiedPositions.MC);
        DOT_TO_SimplifiedPositions.put(11, SimplifiedPositions.MC);
        DOT_TO_SimplifiedPositions.put(12, SimplifiedPositions.MR);
        DOT_TO_SimplifiedPositions.put(13, SimplifiedPositions.WBL);
        DOT_TO_SimplifiedPositions.put(14, SimplifiedPositions.DM);
        DOT_TO_SimplifiedPositions.put(15, SimplifiedPositions.DM);
        DOT_TO_SimplifiedPositions.put(16, SimplifiedPositions.DM);
        DOT_TO_SimplifiedPositions.put(17, SimplifiedPositions.WBR);
        DOT_TO_SimplifiedPositions.put(18, SimplifiedPositions.DL);
        DOT_TO_SimplifiedPositions.put(19, SimplifiedPositions.DC);
        DOT_TO_SimplifiedPositions.put(20, SimplifiedPositions.DC);
        DOT_TO_SimplifiedPositions.put(21, SimplifiedPositions.DC);
        DOT_TO_SimplifiedPositions.put(22, SimplifiedPositions.DR);
        DOT_TO_SimplifiedPositions.put(23, SimplifiedPositions.GK);

        SimplifiedPositions_TO_ROLES = new HashMap<>();
        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.ST, List.of(
            PlayerRole.DEEP_LYING_FORWARD_SUPPORT,
            PlayerRole.DEEP_LYING_FORWARD_ATTACK,
            PlayerRole.ADVANCED_FORWARD_ATTACK,
            PlayerRole.TARGET_FORWARD_SUPPORT,
            PlayerRole.TARGET_FORWARD_ATTACK,
            PlayerRole.POACHER_ATTACK,
            PlayerRole.COMPLETE_FORWARD_SUPPORT,
            PlayerRole.COMPLETE_FORWARD_ATTACK,
            PlayerRole.PRESSING_FORWARD_DEFEND,
            PlayerRole.PRESSING_FORWARD_SUPPORT,
            PlayerRole.PRESSING_FORWARD_ATTACK,
            PlayerRole.TREQUARTISTA_ATTACK,
            PlayerRole.FALSE_NINE_SUPPORT
        ));

        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.AML, List.of(
            PlayerRole.WINGER_SUPPORT,
            PlayerRole.WINGER_ATTACK,
            PlayerRole.INSIDE_FORWARD_SUPPORT,
            PlayerRole.INSIDE_FORWARD_ATTACK,
            PlayerRole.WIDE_TARGET_FORWARD_SUPPORT,
            PlayerRole.WIDE_TARGET_FORWARD_ATTACK,
            PlayerRole.RAMDEUTER_ATTACK,
            PlayerRole.INVERTED_WINGER_SUPPORT,
            PlayerRole.INVERTED_WINGER_ATTACK
        ));

        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.AMC, List.of(
            PlayerRole.ATTACKING_MIDFIELDER_SUPPORT,
            PlayerRole.ATTACKING_MIDFIELDER_ATTACK,
            PlayerRole.ADVANCED_PLAYMAKER_SUPPORT,
            PlayerRole.ADVANCED_PLAYMAKER_ATTACK,
            PlayerRole.ENGANCHE_SUPPORT,
            PlayerRole.SHADOW_STRIKER_ATTACK
        ));

        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.AMR, List.of(
            PlayerRole.WINGER_SUPPORT,
            PlayerRole.WINGER_ATTACK,
            PlayerRole.INSIDE_FORWARD_SUPPORT,
            PlayerRole.INSIDE_FORWARD_ATTACK,
            PlayerRole.WIDE_TARGET_FORWARD_SUPPORT,
            PlayerRole.WIDE_TARGET_FORWARD_ATTACK,
            PlayerRole.RAMDEUTER_ATTACK,
            PlayerRole.INVERTED_WINGER_SUPPORT,
            PlayerRole.INVERTED_WINGER_ATTACK
        ));

        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.ML, List.of(
            PlayerRole.WINGER_SUPPORT,
            PlayerRole.WINGER_ATTACK,
            PlayerRole.INSIDE_FORWARD_SUPPORT,
            PlayerRole.INSIDE_FORWARD_ATTACK,
            PlayerRole.WIDE_TARGET_FORWARD_SUPPORT,
            PlayerRole.WIDE_TARGET_FORWARD_ATTACK,
            PlayerRole.RAMDEUTER_ATTACK,
            PlayerRole.INVERTED_WINGER_SUPPORT,
            PlayerRole.INVERTED_WINGER_ATTACK
        ));

        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.MC, List.of(
            PlayerRole.CENTRAL_MIDFIELDER_DEFEND,
            PlayerRole.CENTRAL_MIDFIELDER_SUPPORT,
            PlayerRole.CENTRAL_MIDFIELDER_ATTACK,
            PlayerRole.CENTRAL_MIDFIELDER_AUTOMATIC,
            PlayerRole.DEEP_LYING_PLAYMAKER_DEFEND,
            PlayerRole.DEEP_LYING_PLAYMAKER_SUPPORT,
            PlayerRole.BOX_TO_BOX_MIDFIELDER_SUPPORT,
            PlayerRole.BALL_WINNING_MIDFIELDER_DEFEND,
            PlayerRole.BALL_WINNING_MIDFIELDER_SUPPORT,
            PlayerRole.ROAMING_PLAYMAKER_SUPPORT,
            PlayerRole.MEZZALA_SUPPORT,
            PlayerRole.MEZZALA_ATTACK,
            PlayerRole.CARRILERO_SUPPORT
        ));

        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.MR, List.of(
            PlayerRole.WINGER_SUPPORT,
            PlayerRole.WINGER_ATTACK,
            PlayerRole.INSIDE_FORWARD_SUPPORT,
            PlayerRole.INSIDE_FORWARD_ATTACK,
            PlayerRole.WIDE_TARGET_FORWARD_SUPPORT,
            PlayerRole.WIDE_TARGET_FORWARD_ATTACK,
            PlayerRole.RAMDEUTER_ATTACK,
            PlayerRole.INVERTED_WINGER_SUPPORT,
            PlayerRole.INVERTED_WINGER_ATTACK
        ));

        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.WBL, List.of(
            PlayerRole.WING_BACK_DEFEND,
            PlayerRole.WING_BACK_SUPPORT,
            PlayerRole.WING_BACK_ATTACK,
            PlayerRole.WING_BACK_AUTOMATIC,
            PlayerRole.COMPLETE_WING_BACK_SUPPORT,
            PlayerRole.COMPLETE_WING_BACK_ATTACK,
            PlayerRole.INVERTED_WING_BACK_DEFEND,
            PlayerRole.INVERTED_WING_BACK_SUPPORT,
            PlayerRole.INVERTED_WING_BACK_ATTACK,
            PlayerRole.INVERTED_WING_BACK_AUTOMATIC
        ));

        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.DM, List.of(
            PlayerRole.DEFENSIVE_MIDFIELDER_DEFEND,
            PlayerRole.DEFENSIVE_MIDFIELDER_SUPPORT,
            PlayerRole.DEEP_LYING_PLAYMAKER_DEFEND,
            PlayerRole.DEEP_LYING_PLAYMAKER_SUPPORT,
            PlayerRole.BALL_WINNING_MIDFIELDER_DEFEND,
            PlayerRole.BALL_WINNING_MIDFIELDER_SUPPORT,
            PlayerRole.ANCHOR_DEFEND,
            PlayerRole.HALF_BACK_DEFEND,
            PlayerRole.REGISTA_SUPPORT,
            PlayerRole.SEGUNDO_VOLANTE_SUPPORT,
            PlayerRole.SEGUNDO_VOLANTE_ATTACK
        ));

        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.WBR, List.of(
            PlayerRole.WING_BACK_DEFEND,
            PlayerRole.WING_BACK_SUPPORT,
            PlayerRole.WING_BACK_ATTACK,
            PlayerRole.WING_BACK_AUTOMATIC,
            PlayerRole.COMPLETE_WING_BACK_SUPPORT,
            PlayerRole.COMPLETE_WING_BACK_ATTACK,
            PlayerRole.INVERTED_WING_BACK_DEFEND,
            PlayerRole.INVERTED_WING_BACK_SUPPORT,
            PlayerRole.INVERTED_WING_BACK_ATTACK,
            PlayerRole.INVERTED_WING_BACK_AUTOMATIC
        ));

        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.DL, List.of(
            PlayerRole.FULL_BACK_DEFEND,
            PlayerRole.FULL_BACK_SUPPORT,
            PlayerRole.FULL_BACK_ATTACK,
            PlayerRole.FULL_BACK_AUTOMATIC,
            PlayerRole.WING_BACK_DEFEND,
            PlayerRole.WING_BACK_SUPPORT,
            PlayerRole.WING_BACK_ATTACK,
            PlayerRole.WING_BACK_AUTOMATIC,
            PlayerRole.NO_NONSENSE_FULL_BACK_DEFEND,
            PlayerRole.INVERTED_WING_BACK_DEFEND,
            PlayerRole.INVERTED_WING_BACK_SUPPORT,
            PlayerRole.INVERTED_WING_BACK_ATTACK,
            PlayerRole.INVERTED_WING_BACK_AUTOMATIC
        ));

        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.DC, List.of(
            PlayerRole.CENTRAL_DEFENDER_DEFEND,
            PlayerRole.CENTRAL_DEFENDER_STOPPER,
            PlayerRole.CENTRAL_DEFENDER_COVER,
            PlayerRole.LIBERO_SUPPORT,
            PlayerRole.LIBERO_ATTACK,
            PlayerRole.BALL_PLAYING_DEFENDER_DEFEND,
            PlayerRole.BALL_PLAYING_DEFENDER_STOPPER,
            PlayerRole.BALL_PLAYING_DEFENDER_COVER,
            PlayerRole.NO_NONSENSE_CENTER_BACK_DEFEND,
            PlayerRole.NO_NONSENSE_CENTER_BACK_STOPPER,
            PlayerRole.NO_NONSENSE_CENTER_BACK_COVER,
            PlayerRole.WIDE_CENTER_BACK_DEFEND,
            PlayerRole.WIDE_CENTER_BACK_SUPPORT,
            PlayerRole.WIDE_CENTER_BACK_ATTACK
        ));

        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.DR, List.of(
                PlayerRole.FULL_BACK_DEFEND,
                PlayerRole.FULL_BACK_SUPPORT,
                PlayerRole.FULL_BACK_ATTACK,
                PlayerRole.FULL_BACK_AUTOMATIC,
                PlayerRole.WING_BACK_DEFEND,
                PlayerRole.WING_BACK_SUPPORT,
                PlayerRole.WING_BACK_ATTACK,
                PlayerRole.WING_BACK_AUTOMATIC,
                PlayerRole.NO_NONSENSE_FULL_BACK_DEFEND,
                PlayerRole.INVERTED_WING_BACK_DEFEND,
                PlayerRole.INVERTED_WING_BACK_SUPPORT,
                PlayerRole.INVERTED_WING_BACK_ATTACK,
                PlayerRole.INVERTED_WING_BACK_AUTOMATIC
        ));

        SimplifiedPositions_TO_ROLES.put(SimplifiedPositions.GK, List.of(
            PlayerRole.GOALKEEPER_DEFEND,
            PlayerRole.SWEEPER_KEEPER_DEFEND,
            PlayerRole.SWEEPER_KEEPER_SUPPORT,
            PlayerRole.SWEEPER_KEEPER_ATTACK
        ));

        PLAYER_POSITION_TO_SimplifiedPositions = new HashMap<>();
        PLAYER_POSITION_TO_SimplifiedPositions.put("ST (C)", List.of(SimplifiedPositions.ST));
        PLAYER_POSITION_TO_SimplifiedPositions.put("AM (L)", List.of(SimplifiedPositions.AML));
        PLAYER_POSITION_TO_SimplifiedPositions.put("AM (C)", List.of(SimplifiedPositions.AMC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("AM (R)", List.of(SimplifiedPositions.AMR));
        PLAYER_POSITION_TO_SimplifiedPositions.put("AM (RLC)", List.of(SimplifiedPositions.AMR, SimplifiedPositions.AML, SimplifiedPositions.AMC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("AM (LC)", List.of(SimplifiedPositions.AML, SimplifiedPositions.AMC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("AM (RC)", List.of(SimplifiedPositions.AMR,SimplifiedPositions.AMC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M/AM (L)", List.of(SimplifiedPositions.AML, SimplifiedPositions.ML));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M/AM (R)", List.of(SimplifiedPositions.AMR, SimplifiedPositions.MR));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M/AM (C)", List.of(SimplifiedPositions.AMC, SimplifiedPositions.MC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M/AM", List.of(SimplifiedPositions.AMC, SimplifiedPositions.MC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M (L)", List.of(SimplifiedPositions.ML));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M (C)", List.of(SimplifiedPositions.MC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M (R)", List.of(SimplifiedPositions.MR));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M (RLC)", List.of(SimplifiedPositions.MR, SimplifiedPositions.ML, SimplifiedPositions.MC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M (RC)", List.of(SimplifiedPositions.MR, SimplifiedPositions.MC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M (LC)", List.of(SimplifiedPositions.ML, SimplifiedPositions.MC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M/AM (RLC)", List.of(SimplifiedPositions.MR, SimplifiedPositions.ML, SimplifiedPositions.MC, SimplifiedPositions.AMR, SimplifiedPositions.AML, SimplifiedPositions.AMC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M/AM (LC)", List.of(SimplifiedPositions.ML, SimplifiedPositions.MC, SimplifiedPositions.AML, SimplifiedPositions.AMC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M/AM (RC)", List.of(SimplifiedPositions.MR, SimplifiedPositions.MC, SimplifiedPositions.AMR, SimplifiedPositions.AMC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("M/AM (LR)", List.of(SimplifiedPositions.MR, SimplifiedPositions.ML, SimplifiedPositions.AMR, SimplifiedPositions.AML));
        PLAYER_POSITION_TO_SimplifiedPositions.put("DM", List.of(SimplifiedPositions.DM));
        PLAYER_POSITION_TO_SimplifiedPositions.put("WB (L)", List.of(SimplifiedPositions.WBL));
        PLAYER_POSITION_TO_SimplifiedPositions.put("WB (R)", List.of(SimplifiedPositions.WBR));
        PLAYER_POSITION_TO_SimplifiedPositions.put("D (L)", List.of(SimplifiedPositions.DL));
        PLAYER_POSITION_TO_SimplifiedPositions.put("D (C)", List.of(SimplifiedPositions.DC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("D (R)", List.of(SimplifiedPositions.DR));
        PLAYER_POSITION_TO_SimplifiedPositions.put("D (RLC)", List.of(SimplifiedPositions.DR, SimplifiedPositions.DL, SimplifiedPositions.DC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("D (RC)", List.of(SimplifiedPositions.DR, SimplifiedPositions.DC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("D (LC)", List.of(SimplifiedPositions.DL, SimplifiedPositions.DC));
        PLAYER_POSITION_TO_SimplifiedPositions.put("GK", List.of(SimplifiedPositions.GK));


        ROLE_WEIGHTS = new HashMap<>();
        ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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
            ROLE_WEIGHTS.put(
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




    }
