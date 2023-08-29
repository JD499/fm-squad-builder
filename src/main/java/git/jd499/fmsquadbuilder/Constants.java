package git.jd499.fmsquadbuilder;

import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

public final class Constants {

    // Prevent instantiation of the constants class
    private Constants() {}

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

    // Extracted styles
    public static final String PLAYER_LABEL_STYLE = "-fx-text-fill: white; -fx-font-size: 16;";
    public static final String COMBO_BOX_STYLE = String.format("-fx-background-color: %s; -fx-text-fill: %s; -fx-background-radius: %f; -fx-border-radius: %f; -fx-padding: 5 30 5 30;", BLUE_COLOR, FONT_COLOR, BUTTON_RADIUS, BUTTON_RADIUS);
    public static final String BUTTON_STYLE = String.format("-fx-background-color: %s; -fx-text-fill: %s; -fx-background-radius: %f; -fx-border-radius: %f;", BLUE_COLOR, FONT_COLOR, BUTTON_RADIUS, BUTTON_RADIUS);

    public static final DropShadow SHADOW_EFFECT;

    static {
        SHADOW_EFFECT = new DropShadow();
        SHADOW_EFFECT.setOffsetY(SHADOW_OFFSET);
        SHADOW_EFFECT.setOffsetX(SHADOW_OFFSET);
        SHADOW_EFFECT.setColor(Color.web(DARK_COLOR));
        SHADOW_EFFECT.setRadius(SHADOW_RADIUS);
    }

}
