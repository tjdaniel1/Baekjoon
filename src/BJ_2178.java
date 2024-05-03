import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BJ_2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n,m;
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        int[][] map = new int[n][m];
        for(int i=0;i<n;i++){
            s = br.readLine().split(" ");
            for(int j=0;j<m;j++){
                map[i][j] = Integer.parseInt(s[j]);
            }
        }
        int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
        //DFS = 무조건 Queue 부터 선언
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{0,0,1}); //y,x,count
        while(!queue.isEmpty()){
            Integer[] poll = queue.poll();
            if(poll[0] == n-1 && poll[1] == m-1){
                System.out.println(poll[2]);
                break;
            }
            int y = poll[0];
            int x = poll[1];
            for(int[] d : directions){
                if (isaBoolean(d, y, n, x, m)
//                        && map
                ){
                    queue.add(new Integer[]{y + d[0], x + d[1], poll[2] + 1});
                }
            }
        }
        System.out.println(Arrays.deepToString(map));
    }

    private static boolean isaBoolean(int[] d, int y, int n, int x, int m) {
        return y + d[0] >= 0 && y + d[0] < n && x + d[1] >= 0 && x + d[1] < m;
    }
}
