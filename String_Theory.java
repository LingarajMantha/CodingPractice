How to reverse a string - 
  ex = char[] s = new s[];
s = {"M","a","n","t","h","a"}    ===> result -> a h t n a M

  class Solution {
void revrseString (char[] s ){
  //to reverse a string
  int left =0;
  int right = s.length-1;
  while(left < right){
    //swaping the array
    char temp = s[left];
    s[left]= r[right];
    s[right]= temp;

    left++;
    right --; 
  }
}
}
