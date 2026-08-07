import java.util.*;

public class One {
    static int n, m;
    static int[][] grid;
    static boolean[][] vis;
    static int max = 0;
    static int[] dx = {0, 1};
    static int[] dy = {1, 0};
    static int[] rx = {0, -1};
    static int[] ry = {-1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        vis = new boolean[n][m];
        vis[0][0] = true;

        dfs(0, 0, 0, false);
        System.out.println(max);
    }

    static void dfs(int x, int y, int count, boolean  back) {
        if(x == n-1 && y == m - 1) {
            dfs(x, y, count, true);
            return;
        }

        if(back && x == 0 && y == 0) {
            max = Math.max(max, count);
            return;
        }

        int[] nx, ny;
        if(!back) {
            nx = dx; ny = dy;
        } else {
            nx = rx; ny = ry;
        }
        for(int k = 0; k < 2; k++) {
            int nx1 = x + nx[k];
            int ny1 = y + ny[k];

            if(isValid(nx1, ny1)) {
                int newCount = count + (grid[nx1][ny1] == 1 ? 1 : 0);
                vis[nx1][ny1] = true;
                dfs(nx1, ny1, newCount, back); 
                vis[nx1][ny1] = false;
            }
        }
    }

    static boolean isValid(int x, int y) {
        return x >= 0 && 
               x < n && 
               y >= 0 && 
               y < m && 
               grid[x][y] != -1 &&
               !vis[x][y];
    }
}
