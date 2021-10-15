   public class EulerTour {

    private int[] degree;

    EulerTour(Graph g, int s) {
        degree = new int[g.V()];
        int count;

        for (int i = 0; i < g.V(); i++) {
            count = 0;
            for (int w : g.adj(i)) {
                count++;
            }
            degree[i] = count;
        }
    }

    int findingEulerPath(Graph g) {

        for (int j = 0; j < g.V(); j++) {
            if (degree[j] % 2 == 1)
                return 0;
        }

        return 1;
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 3);
        g.addEdge(1, 2);

        EulerTour e = new EulerTour(g, 0);
        int res = e.findingEulerPath(g);

        if (res == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
