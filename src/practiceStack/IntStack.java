package practiceStack;

public class IntStack {
	int max;
	int ptr;
	int[] stk;
	
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException();
	}
	
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException();
	}
	
	public IntStack(int capacity) {
		max = capacity;
		ptr = 0;
		try {
			stk = new int[max];
		} catch(OutOfMemoryError e) {
			max=0;
		}
	}
	public int size() {
		if(ptr<=0)
			return 0;
		else
			return ptr;
	}
	public int capacity() {
		return max;
	}
	public int push(int x) throws OverflowIntStackException{
		if(ptr>=max)
			throw new OverflowIntStackException();
		return stk[ptr++]=x;
	}
	public int pop() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	public int peek() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();			
		else
			return stk[ptr-1];
	}
	public void dump() {
		if(ptr<=0)
			System.out.println("스택이 비었습니다.");
		else {
			for(int i=ptr-1; i>=0; i--)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
	
	
	
	/*
	 * 1. 스택에 넣을 수 있는지 검사 
	 * 2. 스택에 값을 넣기
	 * 3. 스택 포인터 증가
	 */

	
	
	public static void main(String[] args) {

	}

}