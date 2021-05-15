package practiceQueue;

import java.util.Scanner;

public class IntQueue {
	private int max; // ť�� �뷮
	private int front; // ù ��° ��� Ŀ��
	private int rear; // ������ ��� Ŀ��
	private int num; // ���� ������ ��
	private int[] que; // ť ��ü
	
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
			int x = que[front++]; // ������ ���� 
			num--;
			if(front==max)
				front=0;
			return x;
		}
	}
	public int peek() { // ������� Ȯ��
		if(isEmpty())
			return -1;
		else
			return que[front];
	}
	public void indexOf() {
		if(isEmpty())
			System.out.println("ť�� ������ϴ�.");
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
			System.out.println("���� ������ �� : " + s.size() + "/" + s.capacity());
			System.out.print("(1) ��ť (2) ��ť (3) ��ũ (4) ���� (0) ���� : ");
			int menu = sc.nextInt();
			
			if(menu==0) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			int num;
			switch(menu) {
			case 1:
				System.out.print("������ : ");
				num = sc.nextInt();
				
				if(s.enque(num) == -1)
					System.out.println("ť�� ���� á���ϴ�.");
				else
					System.out.println("���������� ���ԵǾ����ϴ�.");
				break;
			case 2:
				int x = s.deque(); 
				if(x == -1)
					System.out.println("ť�� ������ϴ�.");
				else
					System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�.");
				break;
			case 3:
				int pk = s.peek();
				if(pk == -1)
					System.out.println("ť�� ������ϴ�.");
				else
					System.out.println("��ũ�� �����ʹ� " + pk + "�Դϴ�.");
				break;
			case 4:
					s.indexOf();
				break;
			}
		}

	}

}
