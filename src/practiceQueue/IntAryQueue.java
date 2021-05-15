package practiceQueue;
import java.util.Scanner;

public class IntAryQueue {
	private int max; // ť �뷮
	private int num; // ���� ������ ��
	private int[] que; // ť ��ü

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
			System.out.println("ť�� ������ϴ�.");
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


/*
	������ : IntAryQueue
	���� : enque
	 - ť�� ���� á���� �˻� : max==num����, -1 ��ȯ
	 - ���� : rear index�� �ְ� +1
	 - ���� �� ��ȯ
	���� : deque
	 - ť�� ������� �˻� : num<=0����, -1 ��ȯ
	 - ���� : rear-1 ~ 1���� �� ĭ ������ �����
	 - ������ �� ��ȯ
	���� ���� ������ �� : peek
	 - ������� Ȯ��
	 - front index �� ���
	�˻� : indexOf
	 - ������� Ȯ�� : -1
	 - 0���� < num���� ���
	��� : clear
	 - �迭 �����
	ť ��ü �뷮 ��ȯ : capacity
	 - max ���
	ť�� �ִ� ������ �� ��ȯ : size
	 - num ���
	ť ������� ���� : isEmpty
	 - num<=0�̸� ����� true, �� ������� false
	ť ���� á���� ���� : isFull
	 - max<=num�̸� ����� true, �� ������� false
	ť�� ��� ������ ��� : dump
	 - 0���� < num���� ���
	
	front : �� ��(���)
	rear : �� ��(����)
	max : ť �뷮
	num : ���� ������ ��
	 -> rear = num�� ��
*/