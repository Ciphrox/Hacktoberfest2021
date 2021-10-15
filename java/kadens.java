public class kadens {
    public static int longestsumsubarray(int[] a)
    {
//        kaden's Algorithm
        int cursum = a[0];
        int maxsum = a[0];
        for(int i=1;i<a.length;i++)
        {
            cursum = Math.max(a[i]+cursum,a[i]);
            maxsum = Math.max(cursum,maxsum);
            if(cursum<0)
                cursum=0;
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] a ={-2,4,1,-3,7,-4};
        System.out.println(longestsumsubarray(a));
    }
}
