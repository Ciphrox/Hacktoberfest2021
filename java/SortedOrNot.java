public class SortedOrNot 
{
	public static void main(String[]args) 
  {
		int a[]= {1,2,4,5};
		boolean isSorted=true;
		for(int i=0; i<a.length-1; i++) 
    {
			if(a[i]>a[i+1]) 
      {
				isSorted=false;
			}
		}
		if(isSorted) {
			System.out.println("Yes Array is Sorted.");
		}else {
			System.out.println("No Array is not Sorted.");
		}
	}

}
