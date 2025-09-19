import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int N = Integer.parseInt(br.readLine().trim());

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            // 방어적 처리: 빈 줄이 들어와도 건너뛰지 않도록 trim 후 분기
            if (line == null) break;
            line = line.trim();
            if (line.isEmpty()) { i--; continue; }

            if (line.startsWith("push_back")) {
                // "push_back A"
                // 공백이 여러 개여도 안전하게 처리
                int space = line.lastIndexOf(' ');
                int val = Integer.parseInt(line.substring(space + 1));
                arr.add(val);
            } else if (line.equals("pop_back")) {
                arr.remove(arr.size() - 1);
            } else if (line.equals("size")) {
                out.append(arr.size()).append('\n');
            } else if (line.startsWith("get")) {
                // "get k" (1-based)
                int space = line.lastIndexOf(' ');
                int k = Integer.parseInt(line.substring(space + 1));
                out.append(arr.get(k - 1)).append('\n');
            }
        }

        System.out.print(out.toString());
    }
}
