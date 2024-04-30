import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BJ_2747 {
    static int[] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 2];
        dp[1] = 1;
        dp[2] = 1;
        System.out.println(fibo2(n));
    }
    public static int fibo2(int n){
        if(n == 0 || n == 1 || dp[n] != 0 ) return dp[n];
        dp[n] = fibo2(n - 1) + fibo2(n - 2);
        return dp[n];
    }
}