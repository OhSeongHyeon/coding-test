import java.util.*;
class Solution {
	public int[] solution(String today, String[] terms, String[] privacies) {
		List<Integer> answer = new ArrayList<>();
		int todayToDays = convertDays(today);
		Map<String, Integer> termsTable = createTermsTable(terms);
		
		for (int i = 0; i < privacies.length; i++) {
			String[] privacieSplit = privacies[i].split("\\s");
			int privaciesDays = convertDays(privacieSplit[0]);
			int storegeDays = termsTable.get(privacieSplit[1]);
			int storegeThreshold = privaciesDays + storegeDays - 1;
			
			if(todayToDays > storegeThreshold) {
				answer.add(i+1);
			}
		}
		
        return answer.stream().mapToInt(n->n).toArray();
    }
	
	private int convertDays(String yyyymmdd) {
		int days = 0;
		
		String[] todaySplit = yyyymmdd.split("\\.");
		int yyyy = Integer.parseInt(todaySplit[0]);
		int mm = Integer.parseInt(todaySplit[1]);
		int dd = Integer.parseInt(todaySplit[2]);
		days += (yyyy - 2000) * 12 * 28;
		days += (mm - 1) * 28;
		days += dd;
		
		return days;
	}
	
	private Map<String, Integer> createTermsTable(String[] terms) {
		Map<String, Integer> termsTable = new HashMap<>();
		
		for (int i = 0; i < terms.length; i++) {
			String[] termsSplit = terms[i].split("\\s");
			int storagePeriod = Integer.parseInt(termsSplit[1]);
			termsTable.put(termsSplit[0], storagePeriod*28);
		}
		
		return termsTable;
	}
}