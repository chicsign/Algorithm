package eratos;

public class sieveOfEratos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 10000; //범위

		boolean isPrime = true;

		boolean[] arr = new boolean[N + 1];

		for (int i = 0; i < N; i++) {

			arr[i] = true;
		}

		for (int i = 2; i < Math.sqrt(N); i++) {

			if (arr[i]) {

				for (int j = i * i; j <= N; j += i) { // i값을 제외한 i의 배수를 구해서 배열에서 제외시켜서 소수를 구하기

					arr[j] = false;

				}
			}
		}

		for (int i = 0; i < N + 1; i++) {

			if (arr[i])
				System.out.println(i + "는 소수");
		}
	}

}
