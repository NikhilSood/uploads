package session5;

public class SortingInTwodArrays {

	public static void main(String[] args) {
		int[][] a= { 
				
				{ 50,40,30,20,10},
				{ 60,50,40,30,20},
				{ 50,40,30,20,10},
				{ 60,50,40,30,20},
				{ 50,40,30,20,10},
				{ 60,50,40,30,20},
				
				
				
				
		};
		

		
		for(int j=0;j<a.length-1;j++) {
		
		for(int i=0;i<a.length-1;i++) {
			
				
				if(a[i][0]>a[i+1][0]) {
					int temp;
					temp =a[i+1][0];
					a[i+1][0]=a[i][0];
					a[i][0]=temp;
				
				}
			
			}
		}
		
		System.out.println("Confirmed  TotalCases  NewCases  TotalRecovered  ActiveCases");
		
		
		for(int[] array : a) {
			for(int element : array) {
				System.out.print(element+"           ");
			}
			System.out.println();
		}

	}

}
