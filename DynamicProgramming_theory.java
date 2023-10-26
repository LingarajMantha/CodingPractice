Dynamic Programming - 
pre req - Recursion .
what is Dynamic Programming - ?
  DP is same as recursion , as solving the sub problems , and adding them to get the large solution , in a v=bigger picture ,, 
and including the saving the memory of the sub problems ,, as this is not available in the recursion .
- DP reduces the time complexity of the problmes .

DP APPROACHES
1] - TOP DOWN - > RECURSION + MEMOIZATION 
2] BOTTOM UP - > TABULATION 
3] SPACE OPTIMIZATION 
  
DP has 5-6 method as a whole , by which we can solve all the probelms of the DP. 

==========================================================================================================================================================================
probelm1 1] Fibonacci series using DP 

  0 1 1 2 3 5 8 13 ....
in recursion 
fibonacci (int n ){
  if (n==0 || n==1){
    return n;
  }
  else {
    return f(n-1)+f(n-2)
  }

}
Top - Down Approach (recursion + memoization )

The Optimum solution of a big problem is sum of oprimum soln of the sub problem 
ex - f(6) = f(5)+f(4)
Recusrion + Memoization(mostly used here the map ) 

in this - it uses same method as recursion ,, but here we store the value of the sub problem in ths hasmap or in the arrays,, so that we can retrive the sol, and to do the sol of sub problems aggain and again 
ex - f(3)= f(2)+f(1)
now f(4)= f(3)+f(2) - here rather than calculating the whole sol. for the subproblems ,,, we just pick the ans. from the prev. sol (i.e value of f(3), then use it here , rather than solving them again)
usually the ans/sol are stored in teh hashmap or the arrary (in the first series of Love Babber he usued(series 102) 1D array, call this array as dp array,of utility array , etc)
the problem is from code studion - Nth fibonacci Number 

  CODE - >  TOP - DOWN - 

code BOTTOM - UP APPROACH - 
int main (){
  Scanner scanner = new Scanner (System.in);
  int n = scanner.nextLine();
  

  //setp 1 - create a dynamic array 
  ArrayList<Integer> dp = new ArrayList<>(6);

  step 2 // base case :
    dp.add[0]= (0, 0);
  dp[1].add=(1, 1);

  //setp 3 
for (int i=2; i<=n; i++){
  dp[i]=dp[i-1]+dp[i+1]
}
  S.o.pl(dp[]n);
}

=============================================================================================================================================================================

103 - Love babbar - >   MINIMUM COST OF CLIMBING STAIRS --->
  --------------------------------------------------------------



                                                                                                                                    














  

