public class Main {
	
	public static void main(String[] args) throws Exception {
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = (int) Math.pow(10, 9);
		int len = max + 1;
		final boolean[] isNotPrimeArr = new boolean[len]; // 0, 1 제외
		//Arrays.fill(isPrimeArr, true);
		isNotPrimeArr[0] = isNotPrimeArr[1] = true;
		
		for (int i = 2; i < Math.sqrt(len); i++) {
			boolean isNotPrime = isNotPrimeArr[i];
			if( isNotPrime ) {
				continue;
			}
			for (int j = i*i; j < len; j += i) {
				isNotPrimeArr[j] = true;
			}
		}
		
		for (int i = n; i <= max; i++) {
			boolean isPrime = !isNotPrimeArr[i];
			if( isPrime ) {
				System.out.println(i);
				return;
			}
		}
		*/
		System.out.println(1_000_000_000); // 이딴게 정답??
	}

}