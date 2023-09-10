Arrays - a non-premitive data type that store data of similar datatype in the continious memeory in the heap .
  - In the Stack memory the varibale and function call happens - and in the the heap memory the the actual object storage happens 
  -int[] arr = new int[5]  --- <datatype>[] <reference variable> (on the LHS this happens at the compile time) = <new- keyword that craete objects> <dt><[size of an array] >(on the RHS side this happens while run time ,, i.e dynamic memmory allocation)
  -by default value int dt of an array results in 0 and for the string its null ,, like similar in none in python
  -usually the array is continious memory allocation in the heap,, (like in c++),,  but in the java its depends upon on the jvm , internally it may or may not continious .


  --ARRAY INPUTS --Kunal kushwa|||
  ------------------------------
  -int[] arr = new int [5];
arr[0]=10;  arr[1]=20,, similarly ,, what would you do for the 1000 elements to fill in an array ,, you cant add manually ,, 
-so here we use for loops (for know destination value like we need fill till 1000 or till arr.length,, other wise we would have used while if the end or destination value we dint know)
  
  //input using loops , taking input values - 
  Scanner in = new Scanner {System.in);  // taking input form the user
    int [] arr = new int [100];
  - for (int i=0; i,arr.length; i++){
    arr[i] = in.nextInt();
  -for (int i=0; i<arr.length; i++){
    System.out.println(arr[i] + "");
}

    //using  fo each loop, this is usually used to preint each and every element in the array ,, 
    for (int  num :arr){       // ehnanced for loop , for the every elemnt in array,, for each loop
      System.out.println(num + " ");          //here num represents element of the array
      - 

  ----- toString();   -- toString method 
        defn - Array class has toString() method , when you give array to it , basically it converts to string and prints that strings,
        - 

        ------ Array of objects ---------------
      String[] str = new String[4];   //contin the 4 objects ,, it contains the ref. variable for the objects 
      for (i=0; i<str.length; i++){
        str[i]= in.next();
      }
      Syop(Arrays.toString(str));

      ----------------Array of Objects -----------------------
>>String [] str = new String [4]; // its storing the 4 objects not the 4 elemsnts,, the str array holds the ref. varibale not the values/objects ,, so values can be string  
>>for (i=0;i<arr.length; i++){
>>str[i] =in.next();   // user giving the objects values in the terminal 
  }
      Sop(Arrays.toString(str));


      Sol - // When you give objects 
        aa, bb, cc, dd   or a, b, c, d  // 4 objects  for diagram in storage in the book 
        or - str[1]= "Raj", str[2] ="blue ", str[3]= "rocket" etc.... // here the array str holds the ref. varible (stack)i.e str = [ref.var1, ref.var2, 3, 4],, and each ref. var has its value like raj, blue(objects stored in the heap ,, a run time allocation ) etc ,
    
  ================================================================================================================================================================
  ==========================================================================================================================================================
  Problems on array 
1] revers an given Array - 
  int[] A = new int[1,3,23,9,18];
//using the swap function will be doing it ,, 
//

solution - 
/*reverseAnArray for the given array, [1,3,23,9,18]
from kunal kushwa video
*/
  // calling a reverse function () (in reverse function we are using the swap function and calling it in the reverse function)

import java.util.Arrays;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        reverse(arr);
        //swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0;
        int end=arr.length-1;

        while (start<end){
            //swap
            swap(arr, start,end);
            start++;
            end--;
        }
    }
        static void swap(int [] arr, int index1, int index2){
            int temp = arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
        }

    
    
}

  
