import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1010 {
    static int[][] dp = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            System.out.println(combi(Integer.parseInt(s[1]), Integer.parseInt(s[0])));
        }



    }
    public static int combi(int n, int m){
        if(n == m || m == 0 ) return dp[n][m]=1;
        if(dp[n][m] != 0) return dp[n][m];j
        return dp[n][m] =  combi(n - 1, m - 1) + combi(n - 1, m);
    }
}
