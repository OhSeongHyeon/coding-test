import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int fileNum = Integer.parseInt(br.readLine());
		String[] fileSizes = br.readLine().split(" ");
		int clusterSize = Integer.parseInt(br.readLine());
		long diskSpaceUsed = 0;
		
		for (int i = 0; i < fileNum; i++) {
			int fileSize = Integer.parseInt(fileSizes[i]);
			diskSpaceUsed += (fileSize + clusterSize - 1) / clusterSize * clusterSize;
		}
		
		System.out.println(diskSpaceUsed);
	}
	
}