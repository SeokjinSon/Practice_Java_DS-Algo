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
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println(num + "의 팩토리얼은 " + factorial(num) + "입니다.");
	}

}
