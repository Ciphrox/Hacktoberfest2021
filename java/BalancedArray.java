// Java program to Find the minimum value
// to be added so that array becomes balanced

class Minimum
{
	// Returns minimum value that need to
	// be added to make array balanced.
	public static int minValueToBalance(int a[], int n)
	{
		// Calculating sum of first half
		// elements of an array
		int sum1 = 0;
		for (int i = 0; i < n / 2; i++)
			sum1 += a[i];

		// Calculating sum of other half
		// elements of an array
		int sum2 = 0;
		for (int i = n/2; i < n; i++)
			sum2 += a[i];

		// calculating difference
		return Math.abs(sum1 - sum2);
	}
	
	// driver code
	public static void main(String[] args)
	{
		int arr[] = {1, 7, 1, 1, 3, 1};
		int n = 6;
		System.out.print(minValueToBalance(arr, n));
	}
}
