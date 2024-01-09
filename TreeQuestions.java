problems - no.3  - google - 
return the suessor the of the given node ,, check book for the diagram 
code part - we are using the queue for the storing the data , and using the arraylist<> to return the data or in the form of List<>

  Paste this in leet code - >  don'n know thw question non from leet code 
  
public TreeNode findSuccessor(TreeNode root, int key) {
  if (root == null) {
    return null;
    
  }
  Queue <TreeNode> queue = new LinkedList<>();
  queue.add(root);

  while (!queue.isEmpty()) {

    int levelSize = queue.size();//it define the size of the level,, ex - level 0 has size = 1 (root node ), lly 1 has 2, 2 level has size = 4
    TreeNode currentNode = queue.poll();//it pop/shows the first element of the queue and removes it ,,
    if (currentNode.left!=null){
      queue.offer(currentNode.left);
    }
    if (currentNode.right!=null){
      queue.offer(currentNode.right); //offer() add the value to the end of the queue
    }
    if (currentNode.val == key){
      break;
    }
  }
  return queue.peek(); //peek(), returns te first value of the key , without removing form the queue.
  
}


//best explaination form chatgpt
int levelSize = queue.size();
/*
    1
   / \
  2   3
 / \
4   5

Queue: [1]
First Iteration:

levelSize = queue.size(); sets levelSize to the current size of the queue, which is 1.
currentNode = queue.poll(); dequeues the front element, and currentNode becomes 1.
As 1 has left child (2) and right child (3), both are enqueued.
The queue becomes: [2, 3].
The loop continues.
Second Iteration:

levelSize = queue.size(); now sets levelSize to the current size of the queue, which is 2.
currentNode = queue.poll(); dequeues the front element, and currentNode becomes 2.
As 2 has left child (4) and right child (5), both are enqueued.
The queue becomes: [3, 4, 5].
The loop continues.
Third Iteration:

levelSize = queue.size(); sets levelSize to the current size of the queue, which is 3.
currentNode = queue.poll(); dequeues the front element, and currentNode becomes 3.
There are no children for node 3, so no new nodes are enqueued.
The queue becomes: [4, 5].
The loop continues.
Fourth Iteration:

levelSize = queue.size(); sets levelSize to the current size of the queue, which is 2.
currentNode = queue.poll(); dequeues the front element, and currentNode becomes 4.
There are no children for node 4, so no new nodes are enqueued.
The queue becomes: [5].
The loop continues.
Fifth Iteration:

levelSize = queue.size(); sets levelSize to the current size of the queue, which is 1.
currentNode = queue.poll(); dequeues the front element, and currentNode becomes 5.
There are no children for node 5, so no new nodes are enqueued.
The queue becomes empty: [].
The loop exits.
In this example, levelSize at each iteration gives you the number of nodes at the current level of the tree. It's particularly useful when you want to process nodes level by level during a BFS traversal.*/


============================================================================
  ==========================================================================================
  ===================================================================================================
  

  
