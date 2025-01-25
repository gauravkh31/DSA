public class Degree{
    
   public static void findDegreeInUndirectedGraph(int edges[][], int nodes){
        int degree[] = new int[nodes];
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            degree[u]++;
            degree[v]++;
        }

        //print
       for(int i=0;i<nodes;i++){
           System.out.println("node -> " + i + " degree -> "+degree[i]);
       }
   }

    public static void findDegreeInDirectedGraph(int edges[][], int nodes){
        int inDegree[] = new int[nodes];
        int outDegree[] = new int[nodes];
        for(int edge[] : edges){
            int from = edge[0];
            int to = edge[1];
            inDegree[to]++;
            outDegree[from]++;
        }

        //print
        for(int i=0;i<nodes;i++){
            System.out.print("node -> " + i + " in-degree -> "+inDegree[i] + " - ");
            System.out.print("node -> " + i + " out-degree -> "+outDegree[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
         int edges[][] = {{0,2},{0,1},{1,3}};
        int nodes = 4;
       
        System.out.println("UnDirected Graph");
        findDegreeInUndirectedGraph(edges,4);
        // --- directed graph --- //
        //find indegree of nodes using edges
        //find outdegree of nodes using edges
        System.out.println("Directed Graph");
        findDegreeInDirectedGraph(edges,4);

    }






}