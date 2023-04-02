}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int totalLength = 0; // 渋滞の区間の合計長を格納する変数

        int prevCarDistance = sc.nextInt(); // 先頭の車と2番目の車の間の距離
        for (int i = 1; i < n-1; i++) { // 先頭の車と2番目の車の間の距離以外の距離をループで取得
            int currCarDistance = sc.nextInt();
            if (prevCarDistance + currCarDistance < m) { // 渋滞である場合、渋滞の区間の合計長に加算
                totalLength += currCarDistance;
            }
            prevCarDistance = currCarDistance; // 2つの車間距離を更新
        }
        System.out.println(totalLength);
    }
}
/*


cannerクラスを使って、標準入力から車の数nと渋滞を定義する整数mを取得します。

次に、渋滞の区間の合計長を格納するための変数totalLengthを初期化します。

その後、先頭の車と2番目の車の間の距離を入力し、変数prevCarDistanceに格納します。その後、先頭の車と2番目以降の車同士の距離を入力するためのforループを用意します。forループでは、先頭の車と2番目以降の車同士の距離を順番に入力していき、渋滞の区間を調べています。具体的には、現在の車と前の車との距離を足した値がm未満である場合、渋滞の区間と判定し、渋滞の区間の合計長に現在の車間距離を加算します。また、現在の車間距離を、次の車間距離を取得する前に変数prevCarDistanceに代入して、2つの車間距離を更新しています。

最後に、渋滞の区間の合計長を出力します。

Scannerクラスを使って、標準入力からnとmを受け取ります。

totalLengthという変数を定義し、初期値を0に設定します。この変数は、渋滞している区間の長さの合計を格納します。

次に、prevCarDistanceという変数に、先頭の車と2番目の車の間の距離を読み取ります。その後、forループを使って、残りの車と車の間の距離を順番に読み取ります。
ループの中で、渋滞している区間の長さを求めるために、現在の車と前の車の距離を足して、m未満である場合にtotalLengthに加算します。

prevCarDistanceに現在の車と車の間の距離を代入し、次のループのために更新します。
forループが終了したら、totalLengthを出力します。

このプログラムのアルゴリズムは、渋滞している区間の長さを求めるために、車と車の間の距離を順番に読み取って、現在の車と前の車の距離を足して、m未満である場合に渋滞している区間の長さに加算していくというものです。




