public class RepresentationAsMatrix{
    int adjMatrix[][];



    RepresentationAsMatrix(int nodes){
        adjMatrix = new int[nodes][nodes];
    }







        //function to add edges in matrix without weight
        public void addEdgesInMatrix(int edges[][], boolean isDirected){
            for(int edge[] : edges){
                int u = edge[0];
                int v = edge[1];

                if(isDirected){
                    adjMatrix[u][v] = 1;
                }else{
                    adjMatrix[u][v] = 1;
                    adjMatrix[v][u] = 1;
                }
            }
        }




        //function to add edges in matrix with weight
        public void addEdgesInMatrixWithWeight(int edgesWithWeight[][], boolean isDirected){
            for(int edge[] : edgesWithWeight){
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                if(isDirected){
                    adjMatrix[u][v] = w;
                }else{
                    adjMatrix[u][v] = w;
                    adjMatrix[v][u] = w;
                }
            }
        }



        //function to print matrix
        public void printMatrix(){
            for(int i =0; i < adjMatrix.length; i++){
                System.out.print("row"+i+"->");
                for(int j =0; j < adjMatrix[i].length; j++){
                        System.out.print(adjMatrix[i][j]+",");
                } 
                System.out.println();           
            }
        }






        public static void main(String[] args) {
            
            int edges[][]={{0,2},{0,1},{1,3}};
            int [][]edgesWithWeight = {{0,2,10},{0,1,20},{1,3,30}};

            System.out.println("Matrix Representation of directed graph wihtout weight");
            RepresentationAsMatrix graph1 = new RepresentationAsMatrix(4);
            graph1.addEdgesInMatrix(edges, true);
            graph1.printMatrix();


            System.out.println("Matrix Representation of undirected graph wihtout weight");
            RepresentationAsMatrix graph2 = new RepresentationAsMatrix(4);
            graph2.addEdgesInMatrix(edges, false);
            graph2.printMatrix();



            System.out.println("Matrix Representation of directed graph with weight");
            RepresentationAsMatrix graph3 = new RepresentationAsMatrix(4);
            graph3.addEdgesInMatrixWithWeight(edgesWithWeight, true);
            graph3.printMatrix();




            System.out.println("Matrix Representation of undirected graph with weight");
            RepresentationAsMatrix graph4 = new RepresentationAsMatrix(4);
            graph4.addEdgesInMatrixWithWeight(edgesWithWeight, false);
            graph4.printMatrix();
        }

    }

