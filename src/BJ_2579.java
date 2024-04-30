import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] start = new int[n+1];
        int[] dp = new int[n+1];

        for (int i = 1; i <= n; i++) {
            start[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = start[1] + start[0];
        dp[2] = start[2] + start[1];
        for(int i=3; i<=n; i++){
            dp[i] = Math.max(dp[i-2], dp[i-3] + start[i-1]) + start[i];
        }
        System.out.println(dp[n]);

    }
}
