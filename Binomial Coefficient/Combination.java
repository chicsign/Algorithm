import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	static BigInteger br;
	static BigInteger bm;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int r = sc.nextInt();

		BigInteger temp1 = Facto(n);
		BigInteger temp2 = Facto(r);
		BigInteger temp3 = Facto(n-r);
		
		BigInteger result = temp1.divide(temp2.multiply(temp3));
		System.out.println(result);
	}

	private static BigInteger Facto(int f) {
		if (f <= 1)
			return BigInteger.valueOf(f);
		else
			return Facto(f - 1).multiply(BigInteger.valueOf(f));

	}

}
