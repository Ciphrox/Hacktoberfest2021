class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0 && nums2.length==1  ) return nums2[0];
        if(nums1.length==1 && nums2.length==0  ) return nums1[0];
        int len1=nums1.length;
        int len2=nums2.length;
        int [] arr=new int[len1+len2];
        int j=0;
        for(int i=0;i<len1;i++){
            arr[j]=nums1[i];
            j++;
        }
        for(int i=0;i<len2 && j<len1+len2 ;i++){
            arr[j]=nums2[i];
            j++;
        }
        
        Arrays.sort(arr);
        
        int mid=(arr.length)/2 ;
        if(arr.length % 2 != 0) return arr[mid];
        else return (Double.valueOf(arr[mid]+arr[mid-1])/Double.valueOf(2));
        
        
    }
}

/*

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
Example 4:

Input: nums1 = [], nums2 = [1]
Output: 1.00000
Example 5:

Input: nums1 = [2], nums2 = []
Output: 2.00000
*/
