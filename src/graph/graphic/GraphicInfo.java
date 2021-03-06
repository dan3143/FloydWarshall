package graph.graphic;

import java.awt.Color;

public class GraphicInfo {
    public Circle circle;
    public Color color;
    public Color text_color;
    
    public static final Color WHITE = new Color(237, 237, 244);
    public static final Color BLACK = new Color(43, 45, 66);
    public static final Color YELLOW = new Color(244, 241, 187);
    public static final Color RED = new Color(229, 89, 52);
    public static final Color PINK = new Color(255, 196, 209);
    
    public GraphicInfo(Circle circle, Color color, Color text_color){
        this.circle = circle;
        this.color = color;
        this.text_color = text_color;
    }
}