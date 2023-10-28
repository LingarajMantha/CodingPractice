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
========================================================================================================================================================
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        
        public static int isTheMinNumber(int number){
            while (true); //infinite limit of number 
            number ++;
            
            if (isPalindrome(int number)){
                return number ; 
                
            }
        }
        public static boolean isPalindrome(int num){
            
            String str = Integer.tostring(number);
            left = 0;
            right = str.length()-1;
            
            while (left < right ){
                if (str.charAt(left) != str.charAt(right)){
                    return false;
                }
                left ++; 
                right --;
            }
            retrun number;
            
        }
    }
}
======================================================================================================================
question 3 - > 
You are given a circular array A containing  the N integer . You can perform the following operations on this array any numbers of items. 
-> For each i, replace A[i] by A[i-1], A[i], A[i+1], i.e. you can keep the current element or replae it by afjecnt element . 
   exist even for the forst and teh last element . In PArticular , A[i-1], for i=0 is the last element.

determine the minium number of steps needed to make all the elements of tha array equal .

input format - > 
the first line contains an integer N, denoting the number of elements in A.

Each line of i of the N subsequent lines (where 0<=i<N) contains an integer describing A[i], 

constarints - > 
    i<=N<=10^3 , 

i<=A[i]<=10^5,

smaple input - Size = 4
2,2,1,1  output = 1,, 
size = 4 , input => 1,2,3,4 , output = 2
