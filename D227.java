import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 口座残高
        int fee = 120; // 手数料

        // 引き出せる金額は、口座残高から手数料を引いた金額
        int amount = n - fee;

        System.out.println(amount); // 引き出せる金額を出力
    }
}

