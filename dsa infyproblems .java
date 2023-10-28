//if you have ana number ,, print the next smallest palinodrom number of the igiven integer.
//example - input - is 122   ---> output - 131 (is the next smallest palindrom number of 122)

public class NextPalindrome {
    public static void main(String[] args) {
        int number = 121; // Replace with the number you want to find the next smallest palindrome for
        int nextSmallestPalindrome = findNextSmallestPalindrome(number);
        
        System.out.println("Next smallest palindrome: " + nextSmallestPalindrome);
    }
    
    public static int findNextSmallestPalindrome(int number) {
        while (true) {
            number++; // Increment the number to check the next one
            
            if (isPalindrome(number)) {
                return number;
            }
        }
    }
    
    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
