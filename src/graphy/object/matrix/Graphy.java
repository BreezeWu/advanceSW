package graphy.object.matrix;

import graphy.object.matrix.Edgies;
import graphy.object.matrix.Vertexs;

public class Graphy {
    private Vertexs V;
    private Edgies E;
    public Graphy(int numOfVertices, int numOfEdgies) {
        V = new Vertexs(numOfVertices);
        E = new Edgies(numOfEdgies, V);
    }
}
