package practiceRecursive;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int x) {
		if(x<1)
			return 1;
		else
			return x*factorial(x-1);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.println(num + "�� ���丮���� " + factorial(num) + "�Դϴ�.");
	}

}
