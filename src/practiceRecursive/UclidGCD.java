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
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		System.out.print("정수를 입력하세요 : "); int x = sc.nextInt();
		System.out.print("정수를 입력하세요 : "); int y = sc.nextInt();
		
		if(x>y)
			System.out.println("최대공약수는 " + gcd(x, y) + "입니다.");
		else
			System.out.println("최대공약수는 " + gcd(y, x) + "입니다.");
	}

}
