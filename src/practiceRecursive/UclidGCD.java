package practiceRecursive;

import java.util.Scanner;

public class UclidGCD {

	public static int gcd(int n1, int n2) { // n1>=n2
		if(n2==0)
			return n2;
		else
			return gcd(n2, n1%n2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		System.out.print("������ �Է��ϼ��� : "); int x = sc.nextInt();
		System.out.print("������ �Է��ϼ��� : "); int y = sc.nextInt();
		
		if(x>y)
			System.out.println("�ִ������� " + gcd(x, y) + "�Դϴ�.");
		else
			System.out.println("�ִ������� " + gcd(y, x) + "�Դϴ�.");
	}

}
