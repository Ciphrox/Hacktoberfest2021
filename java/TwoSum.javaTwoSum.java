import java.util.*;
class TwoSum {
   /* public static void twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                    System.out.println("arr["+i+"] & arr["+j+"]");
            }
        }
        //return new int[]{};
    }*/

    public static void twoSum(int[] nums, int target) {
              
        HashMap<Integer,Integer> map  = new HashMap();
        
        //Fill HM
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
            
            
        //Searching
         for(int i=0;i<nums.length;i++){ //2 7 11 15  target = 4
            int num = nums[i]; 
            int rem = target - num; 
            if(map.get(rem)!=null){
                int index = map.get(rem);
                if(index==i)continue;
                System.out.println("arr["+i+"] & arr["+index+"]");
            }  
        }
        
        //return new int[]{};
        
    }
    public static void main(String args[]) {

        int nums[]={2,5,14,9,3,8};
        int target= 5;
        twoSum(nums,target);
        
    }
}
