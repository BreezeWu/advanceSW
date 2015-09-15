package graphy.object.matrix;

public class Edgies {
    private Vertexs v;

    private int numOfEdgies;
    private double[][] matrix;

    public Edgies(int numOfEdgies, Vertexs v) {
        this.numOfEdgies = numOfEdgies;
        this.v = v;

        matrix = new double[this.numOfEdgies][this.numOfEdgies];
    }

    public void setEdgy(int start, int end, double weight) {
        matrix[start][end] = weight;
    }
}
