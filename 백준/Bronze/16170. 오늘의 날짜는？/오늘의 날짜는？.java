import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) throws Exception {
		// 서울에서 확인한 현재 시각
        LocalDateTime seoulDateTime = LocalDateTime.now(ZoneId.of("Asia/Seoul"));

        // 서울 시각을 UTC+0으로 변환
        LocalDateTime utcDateTime = seoulDateTime.minusHours(9);

        // 출력 포맷 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy\nMM\nd");

        // 출력
        System.out.println(utcDateTime.format(formatter));
    }
	
}