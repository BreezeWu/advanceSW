package graphy.object.matrix;

public class Vertexs {
    private int numOfVertices;
    private Vertex[] vertices;

    public Vertexs(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        vertices = new Vertex[numOfVertices];

        for(int i = 0; i < numOfVertices; i++) {
            vertices[i] = new Vertex(i);
        }
    }

    public void initializeSingleSource(int startID) {
        for(Vertex item:vertices) {
            item.d = Double.MAX_VALUE;
            item.¦Ð = -1;
        }

        // startID
        vertices[startID].d = 0;
    }
}
