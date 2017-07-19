
public class Test2 {

	public int[] reverseArray(int a[]){
		int b[] = new int[3];
		
		
		for (int i = a.length-1, j =0; i >=0; i--, j++) {
			System.out.println(a[i]);	
			b[j] = a[i];
		
		}
		
	
		for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);	
		}
		
		
		return a;
	}
	
	public int countTotal(int no){
		
		int sum =0;
		for (int i = 0; i <= no; i++) {
			sum = sum + i;
		}
		
		
		System.out.println("sum of 5 is:" + sum);
		return sum;
	}

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		int a [] = new int[3];
		a[0]=0;
		a[1]=1;
		a[2]=2;
		t2.reverseArray(a);
		t2.countTotal(5);
	}

}
