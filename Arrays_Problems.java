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

            if ( height[left] < height[right]){
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
34. Find First and Last Position of Element in Sorted Array[LEET CODE MEDIUM QUESTION]
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity

  
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
    int[] result = new int[]{-1, -1};

    // Find the left boundary (starting position)
    int left = findLeftBoundary(nums, target);
    if (left == -1) {
        return result;
    }

    // Find the right boundary (ending position)
    int right = findRightBoundary(nums, target);

    result[0] = left;
    result[1] = right;

    return result;
}

// Helper function to find the left boundary (starting position)
private int findLeftBoundary(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int result = -1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            result = mid;
            right = mid - 1; // Continue searching on the left side
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return result;
}

// Helper function to find the right boundary (ending position)
private int findRightBoundary(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int result = -1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            result = mid;
            left = mid + 1; // Continue searching on the right side
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return result;
}

    }
