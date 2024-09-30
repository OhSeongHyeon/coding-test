import java.io.*;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String[] input = br.readLine().split(" ");
            int day = Integer.parseInt(input[0]);
            int month = Integer.parseInt(input[1]);
            int year = Integer.parseInt(input[2]);
            
            if (day == 0 && month == 0 && year == 0) {
                break;
            }
            
            LocalDate startOfYear = LocalDate.of(year, 1, 1);
            LocalDate targetDate = LocalDate.of(year, month, day);
            
            int daysBetween = (int) (targetDate.toEpochDay() - startOfYear.toEpochDay()) + 1;
            
            System.out.println(daysBetween);
        }
    }
	
}