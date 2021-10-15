import java.lang.*;   
import java.util.*;   
import java.io.*;   
  
class Prims_Algorithm{   
     
    private static final int countOfVertices = 7;   //defining the count Of Vertices
    

    int findMinKeyVertex(int keys[], Boolean MST[])   
    {    
        int minimum_index = -1;   
        int minimum_value = Integer.MAX_VALUE;  
          
       
        for (int vertex = 0; vertex < countOfVertices; vertex++)    // //iterate over all vertices to find minimum key-value vertex  
            if (MST[vertex] == false && keys[vertex] < minimum_value) {   
                minimum_value = keys[vertex];   
                minimum_index = vertex;   
            }   
    
        return minimum_index;   
    }   
    
    // create showMinimumSpanningTree for printing the constructed MST stored in mstArray[]   
    void showMinimumSpanningTree(int mstArray[], int graphArray[][])   
    {   
        System.out.println("Edge \t\t Weight");   
        for (int j = 1; j < countOfVertices; j++)   
            System.out.println(mstArray[j] + " <-> " + j + "\t \t" + graphArray[j][mstArray[j]]);   
    }   
    
    void designMST(int graphArray[][])   //for constructing and printing the MST
    {   
        int parent[] = new int[countOfVertices];   //array of size total number of vertices
    
        int key[] = new int[countOfVertices];   //to select an edge having minimum weight in cut 
    
        Boolean MST[] = new Boolean[countOfVertices];   //to represent the set of vertices included in MST 
    
       
        for (int j = 0; j < countOfVertices; j++) {   
            key[j] = Integer.MAX_VALUE;   
            MST[j] = false;   
        }   
    
        
        key[0] = 0;   
        parent[0] = -1; // make first value of mstArray root of MST   
    
       
        for (int i = 0; i < countOfVertices - 1; i++) {   
           
            int edge = findMinKeyVertex(key, MST);   
    
           
            MST[edge] = true;    // Add the selected minimum key vertex to the setOfMST   
    
            for (int vertex = 0; vertex < countOfVertices; vertex++)   
    
                 
                if (graphArray[edge][vertex] != 0 && MST[vertex] == false && graphArray[edge][vertex] < key[vertex]) {   
                    parent[vertex] = edge;   
                    key[vertex] = graphArray[edge][vertex];   
                }   
        }   
    
        showMinimumSpanningTree(parent, graphArray);   
    }   

    public static void main(String[] args)   
    {   
          
        Prims_Algorithm mst = new Prims_Algorithm();   
        int graphArray[][] = new int[][]{   { 1, 2, 2, 3, 3, 0, 0 },   
                                            { 3, 1, 2, 2, 1, 1, 0 },   
                                            { 1, 5, 5, 2, 3, 5, 0 },   
                                            { 3, 0, 2, 2, 5, 6, 2 },   
                                            { 3, 0, 1, 0, 3, 3, 5 },  
                                            { 0, 0, 4, 1, 3, 2, 2 },  
                                            { 1, 2, 1, 3, 2, 0, 1 }};   
    
        mst.designMST(graphArray);   
    }   
}  
