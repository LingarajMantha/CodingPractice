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

  public Node (int value ){
    this.valye = value ; 
    this.next = next ; 
    
  }
} 
