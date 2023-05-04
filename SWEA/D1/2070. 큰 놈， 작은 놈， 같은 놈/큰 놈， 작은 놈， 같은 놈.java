import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        StringBuilder sb = new StringBuilder();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int a = sc.nextInt();
            int b = sc.nextInt();
            sb.append(String.format("#%d ", test_case));
			if(a < b){
                sb.append("<\n");
            }else if(a == b){
                sb.append("=\n");
            }else if(a > b){
                sb.append(">\n");
            }else {
                sb.append("왓더헬?");
            }
		}
        System.out.println(sb.toString());
	}
}