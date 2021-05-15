package practiceQueue;
import java.util.Scanner;

public class IntAryQueue {
	private int max; // 큐 용량
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체

	public IntAryQueue(int n) {
		max=n;
		num=0;
		que = new int[max];
	}
	public int enque(int n) {
		if(isFull())
			return -1;
		else {
			que[num++]=n;
			return n;
		}
			
	}
	public int deque() {
		if(isEmpty())
			return -1;
		else {
			int x = que[0];
			for(int i=1; i<num; i++)
				que[i-1] = que[i];
			num--;
			return x;
		}
			
	}
	public int peek() {
		if(isEmpty())
			return -1;
		else
			return que[0];
	}
	public void indexOf() {
		if(isEmpty())
			System.out.println("큐가 비었습니다.");
		else {
			for(int i=0; i<num; i++)
				System.out.print(que[i] + " ");
			System.out.println();
		}
	}
	public void clear() {
		num=0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return num;
	}
	public boolean isEmpty() {
		if(num==0)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if(num==max)
			return true;
		else
			return false;
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


/*
	생성자 : IntAryQueue
	삽입 : enque
	 - 큐가 가득 찼는지 검사 : max==num인지, -1 반환
	 - 삽입 : rear index에 넣고 +1
	 - 넣은 값 반환
	삭제 : deque
	 - 큐가 비었는지 검사 : num<=0인지, -1 반환
	 - 삭제 : rear-1 ~ 1까지 한 칸 앞으로 땡기기
	 - 삭제한 값 반환
	가장 앞의 데이터 봄 : peek
	 - 비었는지 확인
	 - front index 값 출력
	검색 : indexOf
	 - 비었는지 확인 : -1
	 - 0부터 < num까지 출력
	비움 : clear
	 - 배열 지우기
	큐 전체 용량 반환 : capacity
	 - max 출력
	큐에 있는 데이터 수 반환 : size
	 - num 출력
	큐 비었는지 유무 : isEmpty
	 - num<=0이면 비었음 true, 안 비었으면 false
	큐 가득 찼는지 유무 : isFull
	 - max<=num이면 비었음 true, 안 비었으면 false
	큐의 모든 데이터 출력 : dump
	 - 0부터 < num까지 출력
	
	front : 맨 앞(출력)
	rear : 맨 뒤(삽입)
	max : 큐 용량
	num : 현재 데이터 수
	 -> rear = num인 것
*/