package practiceRecursive;

import java.util.Scanner;

public class UclidArrayGCD {

	// ���� ���� �ִ������� ���ؾ� �� ���,
	// �켱 ó�� 2���� ���� �ִ������� ���� ��
	// �� �ִ������� ���� ���� �ִ������� ���ϴ� ���� �ݺ��ϸ� �ȴ�.
	public static int gcdArray(int[] a) {
		int n=a[0];
		
		for(int i=1; i<a.length; i++) {
			if(n>a[i])
				n = gcd(n, a[i]);
			else
				n = gcd(a[i], n);
		}
		return n;		
	}
	public static int gcd(int n1, int n2) { // n1>=n2
		if(n2==0)
			return n1;
		else
			return gcd(n2, n1%n2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ִ������� ���մϴ�.");
		System.out.print("�ִ������� ���� ������ �Է��ϼ��� : "); int num = sc.nextInt();
		int[] a = new int[num];
		for(int i=0; i<a.length; i++)
			a[i] = sc.nextInt();
				
		System.out.println("�ִ������� " + gcdArray(a) + "�Դϴ�.");
	}

}
