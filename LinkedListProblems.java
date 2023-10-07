PROBLEMS ON THE LINKED LISTS -- 

REVERSE A LINKED LIST -  

  5->4->3->2->1->NULL     expected output     1->2->3->4->5->null

  cosider 3 pointer prev. present and next ,, prev is on null , present be on the 5,  next be on the 4 ,,, 
  point the 5 on null 

  ListNode prev = null ; 
ListNode present = head; 
ListNode next = present.next;  (both the next are different ,, one )
while(present != null){   // at the end the prev at the head , present at the null
  present.next = prev;    //i.e 5 is pointing to null 
  prev = present;    // 
  present = next ; 

  if (next !=null){
    next= next.next;     //null pointer exception / check 
  }
    
}


==================================================================
  =================================================================
  PROBLEM 2 - LEET CODE - MEDIUM 
  19 REMOVE THE NTH NODE FROM THE END OF THE LIST 


  
  
