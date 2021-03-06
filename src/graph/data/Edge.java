package graph.data;

import graph.graphic.GraphicInfo;
import java.awt.Color;

/**
 *
 * @author Daniel
 */
public class Edge {

    public Node origin;
    public Node destiny;
    public double weight;
    public Color color;
    public int stroke;

    public Edge(Node origin, Node destiny, double weight) {
        this.origin = origin;
        this.destiny = destiny;
        this.weight = weight;
        color = GraphicInfo.BLACK;
        stroke = 1;
    }
    
    public Edge inverse(){
        return new Edge(destiny, origin, weight);
    }
}
