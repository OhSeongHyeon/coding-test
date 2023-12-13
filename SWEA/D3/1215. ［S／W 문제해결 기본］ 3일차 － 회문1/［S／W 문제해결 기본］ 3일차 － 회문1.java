import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int testCaseNum = 10;
        int boardSize = 8;
        
        for (int t = 1; t <= testCaseNum; t++) {
            int wordLength = Integer.parseInt(br.readLine());
            char[][] board = createBoard(br, boardSize);
            int cnt = countingPalindrome(wordLength, boardSize, board);
            
            sb.append(String.format("#%d %d\n", t, cnt));
        }
        
        System.out.println(sb);
    }
    
    private static char[][] createBoard(BufferedReader br, int boardSize) throws IOException {
        char[][] board = new char[boardSize][boardSize];
        
        for (int i = 0; i < boardSize; i++) {
            String input = br.readLine();
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = input.charAt(j);
            }
        }
        
        return board;
    }

    private static int countingPalindrome(int wordLength, int boardSize, char[][] board) {
        StringBuilder horizonWord = new StringBuilder();
        StringBuilder verticalWord = new StringBuilder();
        int cnt = 0;
        
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize - wordLength + 1; j++) {
                for (int k = j; k < j + wordLength; k++) {
                    horizonWord.append(board[i][k]);
                    verticalWord.append(board[k][i]);
                }
                
                cnt += isPalindrome(horizonWord) + isPalindrome(verticalWord);
            }
        }
        
        return cnt;
    }

    private static int isPalindrome(StringBuilder word) {
        String forward = word.toString();
        String reverse = word.reverse().toString();
        word.setLength(0);
        
        if(forward.equals(reverse)) {
            return 1;
        }
        return 0;
    }

}