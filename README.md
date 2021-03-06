# axagd
This project provides an implementation of a simpler and different version of coin change problem.
Using coins of values 1 and 2, we count all possible ways to make changes from a bill of n.
The solution is based on scala tail recursion.

#### Example: Count all combinations
Usage
```scala
val n5_count = combiFun(5)
n5_count = 8
```
Using 1 and 2, there is 8 ways to decompose the number 5 as following:

"enum" : {

    1. 1+1+1+1+1
    
    2. 1+1+1+2
    
    3. 1+1+2+1
    
    4. 1+2+1+1
    
    5. 1+2+2
    
    6. 2+1+1+1
    
    7. 2+1+2
    
    8. 2+2+1
}

#### Example: Execution time 

For n=50, n50_count=20365011074

Elapsed time: 133.966 s

This time must be compare to the implementation that uses loop

Note: The tail recursion implementation of combiFun(n) reuses the memory stack 
and avoids the common out of memory exception.  
