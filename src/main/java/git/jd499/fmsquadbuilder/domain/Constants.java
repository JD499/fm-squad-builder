package git.jd499.fmsquadbuilder.domain;

import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

public final class Constants {
    // File constants
    public static final String SQUAD_CSV_FILE_PATH = "src/main/resources/Squad.csv";

    // Color constants
    public static final String DARK_COLOR = "#222232";
    public static final String LIGHT_COLOR = "#65656B";
    public static final String BLUE_COLOR = "#246BF8";
    public static final String FONT_COLOR = "white";
    // Size and style constants
    public static final double FONT_SIZE = 16;
    public static final double BUTTON_PADDING = 10;
    public static final double BUTTON_RADIUS = 10;
    public static final double SHADOW_OFFSET = 5.0;
    public static final double SHADOW_RADIUS = 5.0;
    public static final String COMBO_BOX_STYLE = String.format("-fx-background-color: %s; -fx-text-fill: %s; -fx-background-radius: %f; -fx-border-radius: %f; -fx-padding: 5 30 5 30;", BLUE_COLOR, FONT_COLOR, BUTTON_RADIUS, BUTTON_RADIUS);
    public static final String BUTTON_STYLE = String.format("-fx-background-color: %s; -fx-text-fill: %s; -fx-background-radius: %f; -fx-border-radius: %f;", BLUE_COLOR, FONT_COLOR, BUTTON_RADIUS, BUTTON_RADIUS);
    public static final DropShadow SHADOW_EFFECT;
    public static final double[][] playerCirclePositions = {
            {0.42, 0.2},
            {0.5, 0.2},
            {0.58, 0.2},
            {0.1, 0.35},
            {0.42, 0.35},
            {0.5, 0.35},
            {0.58, 0.35},
            {0.9, 0.35},
            {0.1, 0.5},
            {0.42, 0.5},
            {0.5, 0.5},
            {0.58, 0.5},
            {0.9, 0.5},
            {0.1, 0.65},
            {0.42, 0.65},
            {0.5, 0.65},
            {0.58, 0.65},
            {0.9, 0.65},
            {0.1, 0.8},
            {0.42, 0.8},
            {0.5, 0.8},
            {0.58, 0.8},
            {0.9, 0.8},
            {0.5, 0.9}
    };

    static {
        SHADOW_EFFECT = new DropShadow();
        SHADOW_EFFECT.setOffsetY(SHADOW_OFFSET);
        SHADOW_EFFECT.setOffsetX(SHADOW_OFFSET);
        SHADOW_EFFECT.setColor(Color.web(DARK_COLOR));
        SHADOW_EFFECT.setRadius(SHADOW_RADIUS);
    }

    // Prevent instantiation of the constants class
    private Constants() {}

}
