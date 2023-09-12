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
Time Taken = min=O()
