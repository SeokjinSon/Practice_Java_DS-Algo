package practiceRecursive;

import java.util.Scanner;

public class UclidArrayGCD {

	// 여러 수의 최대공약수를 구해야 할 경우,
	// 우선 처음 2개의 수의 최대공약수를 구한 후
	// 이 최대공약수와 다음 수의 최대공약수를 구하는 것을 반복하면 된다.
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
		
		System.out.println("최대공약수를 구합니다.");
		System.out.print("최대공약수를 구할 개수를 입력하세요 : "); int num = sc.nextInt();
		int[] a = new int[num];
		for(int i=0; i<a.length; i++)
			a[i] = sc.nextInt();
				
		System.out.println("최대공약수는 " + gcdArray(a) + "입니다.");
	}

}
