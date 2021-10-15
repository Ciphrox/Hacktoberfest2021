import java.util.*;

public class Bipartite {

    public int[] color;
    public boolean[] marked;
    public LinkedList<Integer>queue = new LinkedList<Integer>();

    Bipartite(Graph g,int s) {

        color = new int[g.V()];
        marked = new boolean[g.V()];

        for ( int i = 0 ; i<g.V(); i++) {
            color[i] = -1;
        }

        color[s] = 0; // 0 is white color and 1 is RED. Intially source vertex is given white color.
    }

    boolean findingBipartite(Graph g, int s) {

        queue.add(s);

        while(!queue.isEmpty()) {
            
            int ss = queue.remove();
            marked[ss] = true;
            for(int w: g.adj(ss)) {
                if(color[w] == -1 && !marked[w]) {
                    color[w] = 1 - color[ss];
                    queue.add(w);
                }
                else if ( color[w] == color[ss])
                    return false;
            }
        }

        return true;
    }
    
    public static void main (String args[]) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        //g.addEdge(0, 3);
        g.addEdge(3, 2);
        g.addEdge(4, 5);

        Bipartite b = new Bipartite(g, 0);
        boolean res =  b.findingBipartite(g, 0);

        System.out.println(res + ", Bipartatie");
    }
}
