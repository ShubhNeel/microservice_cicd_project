package src.test;

public class SubArray {

	public static void main(String[] args) {
       int array[] = new int[] {1,2,3,7,3,5};
       int k= 3;
       long result = findSubArray(array,k);
       }
private static long findSubArray(int[] array, int k) {
		for(int i = 0;i<array.length;i++) {
			
			int subArray[] = new int[k]; 
			//System.out.println(subArray.length);
			int index= 0;
			
			for(int j = 0;j<array.length;j++) {
				
				for(int l = i;l<=k;l++) {
					subArray[index]=array[l];
					
					
					System.out.println("index :" +index);
					System.out.println("i :" +i);
					System.out.println("j :" +j);
					System.out.println("l :" +l);
					System.out.println("subArray[index] :" +subArray[index]);
					index++;
					
				}
				
				
		
			}
			//System.out.println(subArray[index]);
			
			/*
			 * for(int k1=0;k1<=subArray.length;k1++) { System.out.println(subArray[k1]); }
			 */
			  }
			 
	
		
		
		
		// TODO Auto-generated method stub
		return 0;
	}

	

}
