class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Null");
        }
        if (nums.length <= 1) {
            return;
        }

        int insertloc = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (insertloc != i) {
                    nums[insertloc] = nums[i];
                    nums[i] = 0;
                }
                insertloc++;
            }
        }
    }
}


/*
Time Complexity: O(N)
 Space Complexity: O(1)
 N = Length of input array.
  */
