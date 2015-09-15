package graphy.object.matrix;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
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

    public static Graphy buildMatrixGraphy(Scanner sc, boolean isIDFrom1, boolean isUnDirected) {
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
            int start = sc.nextInt();
            int end = sc.nextInt();
            double weight = sc.nextDouble();

            g.e.setEdgy(start - indexOffset, end - indexOffset, weight);

            if(isUnDirected) {
                g.e.setEdgy(end - indexOffset, start - indexOffset, weight);
            }
        }

        return g;
    }

    public static void main(String[] args) throws FileNotFoundException {
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new FileInputStream("res/input_graphy_matrix.txt"));

        Graphy g = Graphy.buildMatrixGraphy(sc, true, true);
    }
 }
