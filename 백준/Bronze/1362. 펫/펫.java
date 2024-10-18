import java.io.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int scenarioNumber = 1;
        while (true) {
            String[] firstLine = reader.readLine().split(" ");
            int optimalWeight = Integer.parseInt(firstLine[0]);
            int currentWeight = Integer.parseInt(firstLine[1]);

            if (optimalWeight == 0 && currentWeight == 0) {
                break;
            }

            boolean isDead = false;

            while (true) {
                String[] command = reader.readLine().split(" ");
                String action = command[0];
                int value = Integer.parseInt(command[1]);

                if (action.equals("#") && value == 0) {
                    break;
                }

                if (!isDead) {
                    if (action.equals("E")) {
                        currentWeight -= value;
                    } else if (action.equals("F")) {
                        currentWeight += value;
                    }

                    if (currentWeight <= 0) {
                        isDead = true;
                    }
                }
            }

            if (isDead) {
                System.out.println(scenarioNumber + " RIP");
            } else if (currentWeight > optimalWeight / 2 && currentWeight < optimalWeight * 2) {
                System.out.println(scenarioNumber + " :-)");
            } else {
                System.out.println(scenarioNumber + " :-(");
            }

            scenarioNumber++;
        }
	}
	
}