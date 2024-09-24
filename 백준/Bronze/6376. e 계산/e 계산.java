public class Main {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder("n e\n");
		sb.append("- -----------\n");
		sb.append("0 1\n");
		double ans = 1;
        
        for (int i = 1; i <= 9; i++) {
        	sb.append(i).append(" ");
            ans += 1 / fac(i);

            switch (i) {
			case 1: sb.append("2\n");
				break;
			case 2: sb.append("2.5\n");
				break;
			default: sb.append(String.format("%.9f\n", ans));
				break;
			}
        }
        
        System.out.println(sb);
	}
	
	public static double fac(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fac(n - 1);
    }
}