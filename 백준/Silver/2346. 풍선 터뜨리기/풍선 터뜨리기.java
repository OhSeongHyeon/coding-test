import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("1 ");
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Balloon> deque = new ArrayDeque<>();
		int moving = Integer.parseInt(st.nextToken());
		
		for (int i = 2; i <= n; i++) {
			deque.offerLast(new Balloon(i, Integer.parseInt(st.nextToken())));
		}
		
		while( !deque.isEmpty() ) {
			moving = moving > 0 ? orderMoveForward(sb, deque, moving) : orderMoveBack(sb, deque, moving);
		}
		
		System.out.println(sb.toString());
	}

	private static int orderMoveForward(StringBuilder sb, Deque<Balloon> deque, int moving) {
		for (int i = 0; i < moving-1; i++) {
			deque.offerLast(deque.pollFirst());
		}
		return getMoving(sb, deque.pollFirst());
	}

	private static int orderMoveBack(StringBuilder sb, Deque<Balloon> deque, int moving) {
		for (int i = 0; i < Math.abs(moving)-1; i++) {
			deque.offerFirst(deque.pollLast());
		}
		return getMoving(sb, deque.pollLast());
	}
	
	private static int getMoving(StringBuilder sb, Balloon balloon) {
		sb.append(balloon.getIndex()).append(" ");
		return balloon.getMoving();
	}
}

class Balloon {
	private int index;
	private int moving;
	
	public Balloon(int index, int moving){
		this.index = index;
		this.moving = moving;
	}
	
	public int getIndex() {
		return index;
	}
	
	public int getMoving() {
		return moving;
	}
}