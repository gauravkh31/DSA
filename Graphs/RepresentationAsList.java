import java.util.*;
public class RepresentationAsList{

    class Pair{
        int node;
        int weight;
        Pair(int n, int w){
            node = n;
            weight = w;
        }

        @Override
        public String toString() {
            return "(" +node +"," + weight + ")";
        }
    }

    List<List<Integer>> adjList;
    List<List<Pair>> adjListWithWeight;


    RepresentationAsList(int nodes){
        adjList = new ArrayList<>();
        adjListWithWeight = new ArrayList<>();
        for(int i =0; i < nodes; i++){
            adjList.add(new ArrayList<>());
            adjListWithWeight.add(new ArrayList<>());
        }
    }


    public void addEdgesInList(int [][] edges, boolean isDirected){
        for(int []edge: edges){
            int u = edge[0];
            int v = edge[1];
             
             if(isDirected){
                adjList.get(u).add(v);
             }else{
                adjList.get(u).add(v);
                adjList.get(v).add(u);
             }
        }
    }






    public void addEdgesWithWeightInList(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            //directed
            if(isDirected){
                Pair pair = new Pair(v,w);
                adjListWithWeight.get(u).add(pair);
            }else{
                //undirected
                Pair pair1 = new Pair(v,w);
                Pair pair2 = new Pair(u,w);
                adjListWithWeight.get(u).add(pair1);
                adjListWithWeight.get(v).add(pair2);
            }
        }
    }










    public void printList(){
        for(int i =0; i < adjList.size(); i++){
            System.out.print(i+"->");
            System.out.print("[");
            for(int j =0; j < adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j));
                if(j!=adjList.get(i).size()-1){
                    System.out.print(",");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }




     public void printWeightedList(){
        for(int i=0;i<adjListWithWeight.size();i++){
            System.out.print(i + " -> ");
            System.out.print("[");
            for(int j=0;j<adjListWithWeight.get(i).size();j++){
                System.out.print(adjListWithWeight.get(i).get(j));
                if(j!=adjListWithWeight.get(i).size()-1){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }








    public static void main(String[] args) {
        
            int edges[][]={{0,2},{0,1},{1,3}};
            int [][]edgesWithWeight = {{0,2,10},{0,1,20},{1,3,30}};

            System.out.println("List Representation of directed graph wihtout weight");
            RepresentationAsList graph1 = new RepresentationAsList(4);
            graph1.addEdgesInList(edges, true);
            graph1.printList();


            System.out.println("List Representation of undirected graph wihtout weight");
            RepresentationAsList graph2 = new RepresentationAsList(4);
            graph2.addEdgesInList(edges, false);
            graph2.printList();



            System.out.println("List Representation of directed graph with weight");
            RepresentationAsList graph3 = new RepresentationAsList(4);
            graph3.addEdgesWithWeightInList(edgesWithWeight, true);
            graph3.printWeightedList();




            System.out.println("List Representation of undirected graph with weight");
            RepresentationAsList graph4 = new RepresentationAsList(4);
            graph4.addEdgesWithWeightInList(edgesWithWeight, false);
            graph4.printWeightedList();
    }

}