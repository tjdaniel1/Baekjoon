import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_2606 {
    static Map<Integer, List<Integer>> map = new HashMap<>();
    static boolean[] visited;
    static int answer;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            List<Integer> list1 = map.getOrDefault(a, new ArrayList<>());
            List<Integer> list2 = map.getOrDefault(b, new ArrayList<>());
            list1.add(b);
            list2.add(a);
            map.put(a, list1);
            map.put(b, list2);
//            System.out.println(map);
        }
        visited = new boolean[N + 1];
        visited[1] = true;
        DFS(1);
        System.out.println(answer);
    }

    public static void DFS(int num){
        for (int i: map.getOrDefault(num, new ArrayList<>())){
            if(!visited[i]){
                visited[i] = true;
                answer++;
                DFS(i);
            }
        }
    }
}
