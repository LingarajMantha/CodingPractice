Arrays ADT - Abstract data type ,, -  form Abdul Bari - 12/9/23
Performing the operations on the Arrays - 
  Display(),, add(x)/append(), insert(index, x), delete(x) , search(x), get(index) , set(index,x), max()/min(), reverse(), shift/rotate()

  -----------------------------------------------xxxxxxx---------------------------------------------------------------------------------------
  1] Dispalying all the elements in an Array - 
  int arr=new int[10];  //{2,3,5,1,7,6, , , , }  (max 10 elements you can add)
 for (i=0; i<Length ; i++){    //arr/length = Length 
   Syso(arr[i]);
 }

2] add()/append()-----------adding an element at the end of an array - 
arr [7] = 99; // added

arr[length]= x;
Length ++;


3] Inserting an element at the given index - like insert (4(position), 15(value at position))
  considering - an arr={8,3,7,12,6,9,10, , , } --> size = 10  ,Length = 7,   (index - 0,1,2,3,4,5,6,7,8,9)
  // so here to insert an element at position 4 (current at th evalue at 6 ),, so now we need to move/shift to next the value from 6, 9, 10 at 1 place ,, so that we can insert an element at position 4 
//this is done by be at the position at 7 and move value of 6 lly the other till you mak ethe value at 4 is empty ,, then you can isert the new value 
i.e. {8,3,7,12,15,6,9,10, , }; Size = 10, Length = 8
  -----------------
insert(){
  for (i=lenght ;i>inde; i--);
  arr[i]=arr[i-1];
}
arr[index]= x;
Lenght ++; //i.e. Length = 8
---------

How much time taken - 
Work done - Shifting of elements (min shifiting = 0 .i.e inserting element at last , n max shifitng is n (i.e shifiting at index 0 ))and copying of elements (this is constant time )
Time Taken = min=O(0),, max=O(n);




----------------------code ------------------------------------------
  public class Display{
  int [] arr = new int[10];
  int size; 
  int length; 

  void display(){
    int i ; 
    Syso("elements are ");
      for (i=0; i<arr.length ; i++){
      syso(arr[i]);
      }
  }
  }

  void append (arr, int x  //value to insert ){
  //new element should come at end ;
if (arr.lenght < arr.size){  // checking fo rthe free space in an array
  arr.length[]= x //stroign the value at postion arr.length -doubt for the code systex- 
    length ++;
}
  
  }

main(){
  int [] arr= {2,3,4,5,6}
    append (int [] arr, 10 );//inserting the element at the end of an array 
    display(arr);
}
--------------------------------------------------------------xxxxxxxxxxxxxxx--------------------------------------
  4] Deleting an element in an array - 
  int [] arr={8,3,7,12,15,6,9,10, , } - size = 10 , Length = 8;

delete(index)-- 

  x=arr[index=3] ;  //i.e element 12 has to removed from arr
  //so when we delete an element in an array, usually we dont leave a blank place in an array , so we move next elements present in an array to pre. place , so place should be blank 
  let i is pointer at index -3  , which moves till length-1 ,, shfiting the i done by for loop 
//Index should not be out of range 
    for (i=0;i<Length-1(8-1=7); i++ ){  //    ------------------------>  copying the elemnt takes one unit of time = 1
    arr[i]=arr[i+1];  //replacing the value of i with i+1;  ----------> the loop Shifting the element takes 1 unit of time = 1 (min shifting is 0 if the shifting is at end and max shifting is at n, when shifitng takes at index 0 , need to move all/n elements )
                                                                          (min time is const =0 n max time is n )
    }
    Length--;  // sp as the 1 element is deleted so the Length is reduced by 1 ,, so Length-- ;   -->reduignthe length takes one unit of time =1


How Much work is done analysing the time complexity    1  + (0-n) + 1= min @0 = 2   and max @n = n+2;
  -

code -
    public int delete (int arr , int index ){
      int x=0;   //this is actually initilising the value at given index to delete
    int i ;
    if (index>=0 && index<arr.length){
      x=arr[index];  // if the above condition is correct , then we assign the value of the x present in tha array 
      for (i=index;i<arr.length-1;i++){   //this helps in the shifting the elements in the arrays 
        arr[i]=arr[i+1];
        arr.length -- ;
        return x;  //returing the deleted  value
      }
    }
    return 0;  // if the value at index is not present then we return 0
    }

mian(){
  Syso(delete(int[] arr, 4));
  display(arr); //it will display the updated array with the deleted the array
}








  


