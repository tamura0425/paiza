import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<String, Integer> customerMap = new HashMap<>();
        for (int i = 0; i < M; i++) {
            String customerName = sc.next();
            customerMap.put(customerName, i);
        }
        int count = 0;
        for (Map.Entry<String, Integer> entry : customerMap.entrySet()) {
            if (M - entry.getValue() > N) {
                count++;
            }
        }
        System.out.println(count);
    }
}

