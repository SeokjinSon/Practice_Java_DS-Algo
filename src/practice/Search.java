package practice;
import java.util.Scanner;

public class Search {
	
	public static int binSearch(int[] a, int key) {
		int pl=0;
		int pr=a.length-1;
		int len=a.length;
		
		do {
			int pc = ((pl+pr)/2);
			
			if(a[pc] == key)
				return pc;
			else if(a[pc] < key)
				pl = pc+1;
			else
				pr = pc-1;
		} while(pl<=pr);
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i=0; i<num; i++)
			arr[i] = sc.nextInt();
		
		System.out.print("검색할 값 : ");
		int searchData = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int l=i; l<num; l++) {
				if(i==l)
					continue;
				else {
					if(arr[i]>arr[l]) {
						int swp = arr[i];
						arr[i] = arr[l];
						arr[l] = swp;
					}
				}
			}
		}
		
		int idx = binSearch(arr, searchData);
		
		if(idx==-1)
			System.out.println("검색 결과가 없습니다.");
		else
			System.out.println(searchData + "은(는)" + "[" + idx + "]에 있습니다.");
	}
}
