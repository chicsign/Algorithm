package gcd;

public class main {

	static int gcd(int a, int b) {

		int tmp, n;

		if (a < b) {

			n = a;
			a = b;
			b = n;
		}

		while (b > 0) {
			n = a;
			a = b;
			b = n % b;
		}
		return a;
	}

	static int gcd1(int a, int b) {

		if (b == 0)
			return a;

		return gcd(b, a % b);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 20;
		int m = 30;

		int result;
		// 반복문
		result = gcd(n, m);

		System.out.println("gcd : " + result);

		// 재귀

		result = gcd1(n, m);

		System.out.println("gcd1 : " + result);
	}
}
