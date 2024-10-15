import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = 4;
        int[][] edges = {
                {1, 2},
                {2, 3},
                {1, 4}
        };
        int U = 1;
        int V = 3;

        if (isPathExists(N, edges, U, V)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPathExists(int N, int[][] edges, int U, int V) {

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            graph.get(from).add(to);
            graph.get(to).add(from);
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(U);
        visited.add(U);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == V) {
                return true;
            }
            for (int neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return false;
    }
}
