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
/*
このコードは、与えられたリスト内の顧客名を使って、直近 N 日間に来店していない顧客の数をカウントするものです。

まず、Scanner を使用して、N と M の値を入力します。N は直近の日数、M は来店した顧客の総数です。

次に、Map<String, Integer> customerMap = new HashMap<>() を使用して、顧客名とその来店日数をマップに格納します。このマップには、与えられたリスト内の各顧客名がキーとして保存され、その値はリスト内の位置になります。リスト内の位置を値として使用することで、リスト内の順序を維持しながら、直近の来店日数を表現できます。

最後に、Map.Entry<String, Integer> entry : customerMap.entrySet() を使用して、マップ内のエントリを反復処理します。この反復処理では、エントリの値を取得し、それが N より大きい場合、カウントがインクリメントされます。

最終的に、カウントされた顧客の数が出力されます。




Map.Entry<String, Integer> entry : customerMap.entrySet()

Map内のエントリー(key-valueペア)を1つずつ処理するためのループです。
customerMapは、StringキーとInteger値の両方を持つMapです。
entrySet()メソッドを使用することで、マップ内の各キーと値のペアを含むSetを返します。

ループの中で、変数 'entryには、Map.Entryオブジェクトが格納されます。
このオブジェクトには、Map内の1つのエントリーのキーと値が含まれます。
entrySet()メソッドを使用して、すべてのエントリーにアクセスし、各エントリーをループで処理することができます。

*/
