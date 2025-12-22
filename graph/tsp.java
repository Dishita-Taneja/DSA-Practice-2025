package graph;
    import java.util.*;
public class tsp {
    static final int INF = 999999;
    static int N;
    static int finalCost = INF;
    static List<Integer> finalPath = new ArrayList<>();

    // Node structure for state space tree
    static class Node {
        int[][] matrix;
        int cost;
        int level;
        int vertex;
        List<Integer> path;

        Node(int[][] matrix, int cost, int level, int vertex, List<Integer> path) {
            this.matrix = matrix;
            this.cost = cost;
            this.level = level;
            this.vertex = vertex;
            this.path = new ArrayList<>(path);
        }
    }

    // Step 2 & 3: Reduce matrix and calculate reduction cost
    static int reduceMatrix(int[][] matrix) {
        int reduction = 0;

        // Row reduction
        for (int i = 0; i < N; i++) {
            int min = INF;
            for (int j = 0; j < N; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            if (min != INF && min != 0) {
                for (int j = 0; j < N; j++) {
                    if (matrix[i][j] != INF)
                        matrix[i][j] -= min;
                }
                reduction += min;
            }
        }

        // Column reduction
        for (int j = 0; j < N; j++) {
            int min = INF;
            for (int i = 0; i < N; i++) {
                min = Math.min(min, matrix[i][j]);
            }
            if (min != INF && min != 0) {
                for (int i = 0; i < N; i++) {
                    if (matrix[i][j] != INF)
                        matrix[i][j] -= min;
                }
                reduction += min;
            }
        }
        return reduction;
    }

    // Step 6: Create child node by including edge (i, j)
    static Node newNode(Node parent, int i, int j) {
        int[][] newMatrix = new int[N][N];
        for (int r = 0; r < N; r++)
            newMatrix[r] = parent.matrix[r].clone();

        // (a) Set row i and column j to infinity
        for (int k = 0; k < N; k++) {
            newMatrix[i][k] = INF;
            newMatrix[k][j] = INF;
        }

        // (b) Set A[j][1] = INF (avoid cycle)
        newMatrix[j][0] = INF;

        List<Integer> newPath = new ArrayList<>(parent.path);
        newPath.add(j);

        return new Node(newMatrix, parent.cost, parent.level + 1, j, newPath);
    }

    static void solveTSP(int[][] costMatrix) {

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));

        int[][] rootMatrix = new int[N][N];
        for (int i = 0; i < N; i++)
            rootMatrix[i] = costMatrix[i].clone();

        int rootCost = reduceMatrix(rootMatrix);

        List<Integer> path = new ArrayList<>();
        path.add(0);

        Node root = new Node(rootMatrix, rootCost, 0, 0, path);
        pq.add(root);

        while (!pq.isEmpty()) {
            Node min = pq.poll();

            if (min.cost >= finalCost)
                continue;

            if (min.level == N - 1) {
                int totalCost = min.cost + costMatrix[min.vertex][0];
                if (totalCost < finalCost) {
                    finalCost = totalCost;
                    finalPath = new ArrayList<>(min.path);
                    finalPath.add(0);
                }
                continue;
            }

            for (int j = 0; j < N; j++) {
                if (min.matrix[min.vertex][j] != INF) {
                    Node child = newNode(min, min.vertex, j);
                    int reductionCost = reduceMatrix(child.matrix);
                    child.cost += min.matrix[min.vertex][j] + reductionCost;

                    if (child.cost < finalCost)
                        pq.add(child);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] costMatrix = {
            {INF, 10, 15, 20},
            {5, INF, 9, 10},
            {6, 13, INF, 12},
            {8, 8, 9, INF}
        };

        N = costMatrix.length;
        solveTSP(costMatrix);

        System.out.println("Minimum Cost: " + finalCost);
        System.out.println("Path: " + finalPath);
    }
}
