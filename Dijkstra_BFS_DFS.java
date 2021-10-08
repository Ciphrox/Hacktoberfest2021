public class Graph
{
   ArrayList<ArrayList<node>> vertices = new ArrayList<>();
   int V;
   public Graph(int V)
   {
      this.V = V;
      for(int i=0; i<V; i++)
         vertices.add(new ArrayList<>());
   }
   public int size()
   {
      return vertices.size();
   }
   
   public boolean containsVertex(int v)
   {
      return vertices.contains(v);
   }
   
   public void addEdge(int u, int v, int w)
   {
      vertices.get(u).add(new node(v,w));
      vertices.get(v).add(new node(u,w));
   }
   
   public void print()
   {
      for(int i=0; i<vertices.size(); i++)
      {
         System.out.print(i + ": ");
         for(node j: vertices.get(i))
         {
            System.out.print(j+", ");
         }
         System.out.println();
      }
   }

   public void DFSUtil(int v, boolean visited[])
   {
      visited[v] = true;
      System.out.print(v + " ");
      for (node i : vertices.get(v))
      {
         int j = i.getVertex();
         if(!visited[j])
            DFSUtil(j, visited);
      }
   }

   public void DFS(int v)
   {
      boolean visited[] = new boolean[V];
      DFSUtil(v, visited);
   }

   public void BFS(int v)
   {
      boolean visited[] = new boolean[V];
      Queue<Integer> q = new LinkedList<>();
      q.add(v);
      visited[v] = true;
      while (q.size()!=0)
      {
         v = q.poll();
         System.out.print(v + " ");
         for (node i : vertices.get(v))
         {
            int j = i.getVertex();
            if (!visited[j])
            {
               visited[j] = true;
               q.add(j);
            }
         }
      }
   }

   public int dijkstra(int src)
   {
      int dist[] = new int[V];
      boolean visited[] = new boolean[V];
      PriorityQueue<node> pq = new PriorityQueue<>();
      pq.add(new node(src, 0));
      for(int i=0; i<V; i++)
      {
         dist[i] = Integer.MAX_VALUE;
      }
      dist[src] = 0;
      while (!pq.isEmpty())
      {
         node cur = pq.remove();
         visited[cur.getVertex()] = true;
         for(node i: vertices.get(cur.getVertex()))
         {
            if (!visited[i.getVertex()] && dist[cur.getVertex()] != Integer.MAX_VALUE
                  && dist[cur.getVertex()] + i.getDistance() < dist[i.getVertex()])
            {
               dist[i.getVertex()] = dist[cur.getVertex()] + i.getDistance();
               pq.add(new node(i.getVertex(), dist[i.getVertex()]));
            }
         }
      }
      for(int i=0; i<V; i++)
         System.out.println("0 to " + i + " = " + dist[i]);
      System.out.println();
      return dist[V-1];
   }

   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      PriorityQueue<Graph> aa = new PriorityQueue<>();
      Graph g = new Graph(5);
      g.addEdge(0,1,9);
      g.addEdge(0,2,6);
      g.addEdge(0,3,5);
      g.addEdge(0,4,3);
      g.addEdge(2,1,2);
      g.addEdge(2,3,4);
      System.out.println(g.dijkstra(0));
   }
}

class node implements Comparable<node>
{
   private final int vertex;
   private final int distance;
   public node(int v, int dist)
   {
      this.vertex = v;
      this.distance = dist;
   }
   @Override
   public int compareTo(node o) {
      return this.distance - o.distance;
   }

   @Override
   public String toString()
   {
      return "v=" + vertex + ", dist=" + distance + '}';
   }

   public int getDistance() {
      return distance;
   }

   public int getVertex() {
      return vertex;
   }
}
