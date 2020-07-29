package chapter10;

public class Ex61 {
	//	public static void main(String[] args) {
	//		int[] array = { 1, 2, 3, 4, 5 };
	//		int cnt = 0;
	//		int key = 3;
	//		int total = 0;
	//		for (int i : array) {
	//			if (i % 2 == 0)
	//				continue;
	//			total += i;
	//		}
	//
	//		System.out.println(total);
	//
	//		for (int i : array) {
	//			if (i != key) {
	//				continue;
	//			}
	//			cnt++;
	//
	//		}
	//		System.out.println(cnt);

	public static void main(String[] args) {
		int[] a = { 9, 6, 2 }; //オリジナル配列

		int[] b; //コピー先配列宣言
		b = new int[a.length]; //オリジナルと同サイズの配列を作成し初期化

		//配列コピー
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}

		//コピー先配列に新しい数字を代入
		b[0] = 22;
		b[1] = 59;
		b[2] = 3;

		//コピー元配列表示
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");

		//コピー先配列表示
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

}
