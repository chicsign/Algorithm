import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[] f;

	//피보나치 재
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		f = new int[input+1];
		
		Arrays.fill(f, 0);

		System.out.println(fibo(input));

	}

	public static int fibo(int n) {

		if (n <= 2)
			return 1;
		else if (f[n] != 0)
			return f[n];
		else
			return f[n] = fibo(n - 1) + fibo(n - 2);

	}
	*/
	
	
	// 피보나치 메모이제이
	/*

	public static void main(String[] args) {

		int input = 8;

		for (int i = 1; i <= input; i++) {
			System.out.println(fibo(i));
		}

	}

	public static int fibo(int n) {

		if (n <=2) {
			return 1;
		}
		else
			return fibo(n - 1) + fibo(n - 2);

	}

*/
	
	// 피보나치 반복문
		public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		f = new long[input + 1];
		f[0] = 0; 
		f[1] = 1;

		for (int i = 2; i < f.length; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		
		System.out.println(f[input]);
		
	}

}
