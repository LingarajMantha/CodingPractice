Linked Lists  -- -> 
important to know how to work with the Head ,, remianing is easy .
  3-->4-->5-->1-->--18(3 is head and 18 is tail ) where each elemnt is of tyoe Node 
  ex. - class Node {
  int val ;
  Node next;

  }

>> how to initiliaze a linked list - 
  LinkedList <Integer> list = new LinkedList<>();
list.add(34); 
In linked List (LL) which ever varibale has the type Node - is jsut kinda pointer refreing to the the other or address - Link Node Head , tail, Node next ,, these are refering to the Node or 
  address 


  insertion in a Singly Linked List -->
  ------------------------------------
  ex - inserting in first positon of list 
    3-->4-->5-->1-->--18  ,, like adding 14 before 3 ,, 
  class Node {
  int val = 14;
  node.next = head
  head=node;
  if(tail == head){
    tail = head
      } 

===================cODE for inseertion in singl linked list ===========
    private Node head;
private Node tail;
  private int size;

  public LL(){
    this.size  =0;
  }

  code for INSERTING THE ELEMNTS IN THE LIST
    ------------------------------------
  public void insertFirst(int val){           //Node = class/Data type, node =[inside the element is present /value ], next= a pointer variable , head= pointer to first element of LL, tail = pointing to last element of LL, 
    Node node = new Node (val);
  node.next=head;
  head=node;

  //if the first element is adding in the list 
  if(tail==null){
    tail = head
  }

  size +=1;
  
    }
---------------------------------------------------------------------------------------
  HOW TO DISPLAY THE LL IF ONLY HEAD IS GIVEN --
the below method is actually wrong ,, beacuse its only prints the value once ,, n the head node sits on the null,, if you want to print again , it will print null, the strcture of th eLL will be changed 
  while (head!=null(actually the symbol i need to use))
  print(head.val)
  head  = head . next 

  the RIGHT METHOD - by using tempory node = temp;
  ------------------------------------------
    3-->4-->5-->1-->--18
  public void display (){
    Node temp = head; 
    while (temp!=null){
      S.o.pln(temp.value + "->" );
      temp=temp.next;
    }
    S.o.pl("END");
  }

private class Node {
  private int value ; 
  private Node next;  //this is just a pointer , pointing to the object/ element which user intilized 

  public Node (int value ){ //constructor 
    this.value = value ; 
    this.next = next ; 
    
  }
} 


  wrting a program using insertFirst and display method ; 

public class Main {
  p s v m (String [] args ){
    LL list = new LL();
    list.insertFirst(3);
    list.insertFirst(2);
    list.insertFirst(8);
    list.insertFirst(17);
    list.insertLast(17);
    list.insert(24(value), 3(index));
    list.display();
    lsit.dleteFirst(val);
     list.display();

    Syso (list.deletelast());
    list.display ();    // to print list after deleting the last element ; 
    
  }
}


      ===================================================================
3-->4-->5-->1-->--18 
INSERTING THE ELEMENT AT THE END---

publiuc void insertLast (int value ){
  
  if (tail==null){
  insertFirst (value);
  return ; 
}
  Node node = new node Node (val);
  tail.next = node ; 
  tail= node ; 
  size++; 
 }

=============================================================================
INSERTING A ELEMENT AT GIVE NTH POSITON IN LL
  

3-->4-->5-->1-->--18 (indexs - 0,1,2,3,4)   inserting next to 5 i.e 9  ;

3-->4-->5-->9-->1-->--18 (inserting at index 3 )

  first reach at the 5 , then next is 9 , i.e. node.next = 9 , and stor the 1 in temp , so not lose address / link of that ,, 

  public void insert (int val, int index ){
  if (index==0){
    insertFirst(val);
    return ;
  }
  if (index==size){
    insertLast(val);
    return ;
   }
//if we need to insert at the index , we need to go till index 2 , then 
  
  Node temp = head ; //currenlty head and tempo is index 0 index 0 
  for (int i=1; i<index; i++){
    temp= temp.next;   ///next is also a pointer , 
  }
  Node node = new Node (val , temp.next)(Node (val , temp.next) , is constructor , just initilizing the values in the constuctor  ,)
    temp.next = node ; 
  size++; 
  }


========================================================================================================================================
  DELETING THE VALUES FROM THE FIRST , LAST AND AT THE GIVE INDEX -->

  3-->4-->5-->1-->--18

1] - Deleting at the Head - i.e head= 4 

just move head to next ,, thats it ,, 


  for a single element in the list - 3 (both the head and tail are pointing to them ,, then after deleting , both the head and tail should point to the null)


  public int deleteFirst (){
int val = head.value ;
  head= head.next; 
  if (head==null){
    tail= null;
  }
  size -- ;
  return val ;
  
  }
-----------------------------------------
How to delete the TAIL -- 

Node secondlast = get (size-2);
ont val = tail.value ; 
tail = secondLast; 
tail.nest= null; 
return val;



  
writing a get function a to get the second the last elemtn in the list -- 

  publuc Node get (int index);
Node node = head ;
for (int = 0 l i<index; i++){
  node = node.next; 
  
}
return node ; 





















  
