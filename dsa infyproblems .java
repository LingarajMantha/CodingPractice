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
You are given a circular array A containing  the N integer . You can perform the following operations on this array 
any numbers of items. 
-> For each i, replace A[i] by A[i-1], A[i], A[i+1], i.e. you can keep the current element or replae it by adjecnt element . 
   exist even for the first and the last element . In PArticular , A[i-1], for i=0 is the last element.

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

------------------ few test cass are gettin wrong ,, little bit need to check on ----------------------------
import java.util.Scanner;

public class MinimumStepsToEqualizeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int maxDiff = 0;
        for (int i = 0; i < N; i++) {
            int diff = Math.abs(A[i] - A[(i + 1) % N]);
            maxDiff = Math.max(maxDiff, diff);
        }

        System.out.println("Minimum number of steps needed: " + maxDiff);
    }
}
===============================================================================================================================================================
Question 3 -- >

A compact disk can be represented as a abinary strin. Teh CD is divided into N sectors where 0 is adjecent to sector N-1. You are given the initial state of the CD in the string initialState
You store/delete some files on the CD resulting in the state dented by the string finalState.

The CD writer is given to you in the string writer . The 1's in the string denote the sectors above which  fixed writing heads are located . You can write CD by doing the following 
two time  intensive operations.

1. Rotate the CD closk wise or anti clock wir=se by 1 step which takes 2 seconds . Note that the writings heads are fixed while the CD rotates .
    2. Use any fixed writing head to changes the bit under it which takes 3 seconds . Note that you can use only 1 head at a time , 

You can mingle the above operations as you deem fit. rotate the CD a few steps . use some head(s), rotate in other direction , use some head(s) etc. 

Find the minimum time taken to change the CD from initialState to finalState goiven the fixed writing heads are located in the string "writer " return -1,, if you cant use the write 
to achive the goal . All the string have equal lengths . 


INput Firmat - > 
The first line contains a string initialState , denoting teh initial ocntents .
The next line contains a sring , finalState , denoting the final contents 
The next line conatins a string writer, denoting the fixed write heads .

constraints ->

1<= len(initialState )<=50
    1<= len(finalState)<=50;
1<=len(writer)<=50;

smaple input - > 10001, 11101, 01010  sample output - > 8
lly , 11010 , 01010, 00000    --- > 1 
0101010010101,  0101001010101,     1010101010010     - > 4 
