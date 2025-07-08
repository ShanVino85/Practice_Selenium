package practice_java2025;

public class Sort_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= {100,20,30,40,50};
          
          for(int i=0;i<arr.length;i++)
          {
        	 for(int j=i+1;j<arr.length;j++) 
        	 {
        		 
        		 if(arr[i]>arr[j]) 
        		 {
        		  int temp=arr[i];
        		  arr[i]=arr[j];
        		  arr[j]=temp;
        	 } 
        }
          }
		
		 for(int sort:arr)
		 {
			 System.out.println("After Sorthing :" + sort + " "); 
		 }
		
	}

}
