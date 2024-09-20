
public class CastSample {

    public static void main(String[] args) {
       //int型変数aとbの宣言および初期化
        int a=3;
        int b=2;

        //int型どうしの除算(結果はint)
        System.out.println(a/b);

        //int型変数aを一次的にdouble型に型変形して除算する(結果は、double型)
        System.out.println((double)a/b);

        //int型同時の除算をした結果(int型)をdouble型に変換
        System.out.println((double)(a/b));

    }

}
