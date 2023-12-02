import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String schoolAbbreviation = br.readLine();
        System.out.println(getSchoolFullName(schoolAbbreviation));
    }

    private static String getSchoolFullName(String abbreviation) {
        switch (abbreviation) {
            case "NLCS": return "North London Collegiate School";
            case "BHA": return "Branksome Hall Asia";
            case "KIS": return "Korea International School";
            case "SJA": return "St. Johnsbury Academy";
            default: return "알 수 없는 학교 약칭입니다.";
        }
    }
}
