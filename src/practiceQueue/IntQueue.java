package practiceQueue;

import java.util.Scanner;

public class IntQueue {
	private int max; // 큐의 용량
	private int front; // 첫 번째 요소 커서
	private int rear; // 마지막 요소 커서
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체
	
	public IntQueue(int x) {
		max = x;
		num=front=rear=0;
		que = new int[x];
	}
	public int enque(int x) {
		if(isFull())
			return -1;
		else {
			que[rear++]=x;
			num++;
			if(rear==max)
				rear=0;
			return x;
		}
	}
	public int deque() {
		if(isEmpty())
			return -1;
		else {
			int x = que[front++]; // 증가한 값이 
			num--;
			if(front==max)
				front=0;
			return x;
		}
	}
	public int peek() { // 비었는지 확인
		if(isEmpty())
			return -1;
		else
			return que[front];
	}
	public void indexOf() {
		if(isEmpty())
			System.out.println("큐가 비었습니다.");
		else {
			for(int i=0; i<num; i++)
				System.out.print(que[i] + " ");
		}
	}
	public void clear() {
		front=rear=num=0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return num;
	}
	public boolean isEmpty() {
		return num<=0;
	}
	public boolean isFull() {
		return num>=max;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntAryQueue s = new IntAryQueue(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
			System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (0) 종료 : ");
			int menu = sc.nextInt();
			
			if(menu==0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			int num;
			switch(menu) {
			case 1:
				System.out.print("데이터 : ");
				num = sc.nextInt();
				
				if(s.enque(num) == -1)
					System.out.println("큐가 가득 찼습니다.");
				else
					System.out.println("정상적으로 삽입되었습니다.");
				break;
			case 2:
				int x = s.deque(); 
				if(x == -1)
					System.out.println("큐가 비었습니다.");
				else
					System.out.println("디큐한 데이터는 " + x + "입니다.");
				break;
			case 3:
				int pk = s.peek();
				if(pk == -1)
					System.out.println("큐가 비었습니다.");
				else
					System.out.println("피크한 데이터는 " + pk + "입니다.");
				break;
			case 4:
					s.indexOf();
				break;
			}
		}

	}

}
