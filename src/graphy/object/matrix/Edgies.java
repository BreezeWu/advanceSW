package graphy.object.matrix;

public class Edgies {
    private Vertexs V;

    private int n;
    private double[][] edgies;

    public Edgies(int numOfEdgies, Vertexs v) {
        n = numOfEdgies;
        V = v;

        edgies = new double[n][n];
    }
}
