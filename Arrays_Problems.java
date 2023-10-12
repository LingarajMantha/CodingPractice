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

 -----------------------------------------------xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-----------------------------------------

   problem 3 - 

27. Remove Element
Array easy problem leet code 


   class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for (int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                 nums[j] = nums[i]; // for this line even if you dont right the retrun value is orrect but the rray value is differeniung,, so its imp. to write this 

                j++;
            }
            
            
        }
        
  return j;  
}
}

--------------------------------------XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX-------------------------------------------------

  35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



  class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right = nums.length-1;
        
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;

      
  
}
}
========================================================================
11. Container With Most Water LEET CODE _ MEDIUM PROBLEM 
  
  
  class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        //index
        int left = 0; 
        int right = height.length - 1; 

        while (left < right ){
            int minHeight = Math.min(height[left],height[right]);
           //finding the area l*b
            int currentWater = minHeight*(right -left);
            maxWater = Math.max(maxWater, currentWater);

            if (left < right){
                left++; 

            }
            else{
                right--;
            }


        }
        return maxWater; 
        
    }
}

============================================================================================================  
