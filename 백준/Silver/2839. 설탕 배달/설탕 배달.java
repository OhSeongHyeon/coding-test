import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int sugar = sc.nextInt();
			int fiveKgBag = 5;
			int threeKgBag = 3;
			
			List<Integer> list = new ArrayList<Integer>();
			
			int totalBag = 0;
			int temp = 0;
			
			for (int i = 0; sugar > fiveKgBag * i; i++) {
				temp = sugar - (fiveKgBag * i);
				if( sugar % fiveKgBag == 0 || temp % threeKgBag == 0 ) {
					totalBag = (temp / threeKgBag) + i;
					list.add(totalBag);
				}
			}
			
			if( list.size() == 0 ) {
				System.out.println(-1);
			}else {
				list.sort(Comparator.naturalOrder());
				System.out.println(list.get(0));
			}
		}
	}
}