package graphy.object.matrix;

import java.util.Scanner;

public class Graphy {
    private int numOfVertices;
    private int numOfEdgies;

    private Vertexs v;
    private Edgies e;

    private Graphy(int numOfVertices, int numOfEdgies) {
        this.numOfVertices = numOfVertices;
        this.numOfEdgies = numOfEdgies;

        v = new Vertexs(numOfVertices);
        e = new Edgies(numOfEdgies, v);
    }

    public static Graphy buildMatrixGraphy(Scanner sc, boolean isIDFrom1) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        Graphy g = new Graphy(m, n);

        final int indexOffset;
        if(isIDFrom1) {
            indexOffset = 1;
        } else {
            indexOffset = 0;
        }

        for(int i = 0; i < n; i++) {
            g.e.setEdgy(sc.nextInt() - indexOffset, sc.nextInt() - indexOffset, sc.nextDouble());
        }

        return g;
    }
}
