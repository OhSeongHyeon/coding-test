import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int panels = Integer.parseInt(br.readLine());
		String input = br.readLine();
		int axis = 0;
		
		for (int i = 0; i < panels; i++) {
			char c = input.charAt(i);
			switch (c) {
			case 'A': axis++;
				break;
			case 'B': axis--;
				break;
			}
		}
		
		if(axis == 0) {
			System.out.println("Tie");
		}else {
			System.out.println(axis > 0 ? "A" : "B");
		}
	}

}