Arrays Pronblems ----

  problem 2 - 
  Q]2 - Remove the duplicates from the given array - Leet code - 
26. Remove Duplicates from Sorted Array - leet code easy problem 

  class Solution {
    public int removeDuplicates(int[] nums) {
         int j=1;
         for(int i=0; i<nums.length-1; i++){
             if (nums[i]!=nums[i+1]){
                 nums [j]=nums[i+1];
                 j++;
             }
         }
         return j;
        
    }
}

  
