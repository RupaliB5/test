
public class Test3 {

	public boolean  swapArray(int a[], int b[]){
		int sum_a = 0, sum_b = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum_a = sum_a +a[i];
		}
		
		System.out.println("Sum of A:" + sum_a);
		
		for (int i = 0; i < b.length; i++) {
			sum_b = sum_b +b[i];
		}
		
		System.out.println("Sum of B:" + sum_b);
		
		int diff = sum_b - sum_a;
		
		System.out.println("Diff is :" + diff);
		
		int adjustableVal =  diff/2;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < b.length; j++) {
				
				/*if(a[i]-b[j] == adjustableVal){
					b[j] = a[i];
					System.out.println("b[j] a[i]" + a[i] + " " + b[j]);
				}*/
				
				if(b[j]-a[i] == adjustableVal){
					 a[i] = b[j];
					System.out.println("B. b[j] a[i]" + a[i] + " " + b[j]);
				}
				
			}
		}
		
		sum_a = 0;
		sum_b = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum_a = sum_a +a[i];
		}
		
		System.out.println("Sum of A:" + sum_a);
		
		for (int i = 0; i < b.length; i++) {
			sum_b = sum_b +b[i];
		}
		
		System.out.println("Sum of B:" + sum_b);
		
		return false;
	}
	
	
	public static void main(String[] args) {
		Test3 t3 =  new Test3();
	
		int a[] = {1,2,2,1};
		int b[] = {4,2,3,1};
		t3.swapArray(a,b);

	}

}
