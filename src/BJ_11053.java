import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        int[] arr = new int[n]; //수열
        int[] dp = new int[n]; //최대
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st[i]);
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = 0;
        for(int a:dp){
            max = Math.max(max, a);
        }
        System.out.println(max);




    }
}
