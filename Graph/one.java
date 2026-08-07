import java.util.*;

class One{
    
    public static void main(String[] args) {

        int v = 4;

        ArrayList<Integer>[] graph = new ArrayList[v];

        for(int i = 0; i < v ; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(1);
        graph[0].add(2);


        graph[1].add(0);
        graph[1].add(3);

        graph[2].add(0);
        graph[3].add(1);
    
        for(int i = 0; i < v; i++) {
            System.out.print(i + "->");

            for(int node : graph[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}