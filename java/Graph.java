public class Graph
{

   private double[ ][ ] edges;
   private Object[ ] labels;
     
   public Graph(int n)
   {
      edges = new double[n][n];  // All values initially false
	  for(int i = 0;i<n;i++)
		  for(int j = 0;j<n;j++)
			  edges[i][j] = -1;
      labels = new Object[n];     // All values initially null
   }

   public void addEdge(int source, int target, double value)   
   {
      edges[source][target] = value;
   }
   
   public double getWeight(int source, int target){
	   return edges[source][target];
   }
   public void printTotalPath(int[] path) {
	   double pathLength = 0;
		for (int i = 0; i < path.length - 1; i++){
			if (!isEdge(path[i], path[i + 1])){
				System.out.println("The path from " + getLabel(path[0]) + " to " + 
					getLabel(path[path.length-1]) + " is not valid.");
				return;
			}
			pathLength+=getWeight(path[i],path[i+1]);
		}
		System.out.println("The total path from " + getLabel(path[0]) + " to " + 
			getLabel(path[path.length-1]) + " has a total of " + pathLength);
	}


   public Object getLabel(int vertex)
   {
      return labels[vertex];
   }

   public boolean isEdge(int source, int target)
   {
      return edges[source][target]!=-1;
   }

   public void removeEdge(int source, int target)   
   {
      edges[source][target] = -1;
   }

   public void setLabel(int vertex, Object newLabel)
   {
      labels[vertex] = newLabel;
   }   
}
