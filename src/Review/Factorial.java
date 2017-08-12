/*
This factorial class accept an integer argument.  
It will automatically calculate the result
when the constructor is called.

 */
package Review;

/**
 *
 * @author Tuan La
 */
public class Factorial {
    int myResult;
    int source;
    
    //Constructor
    Factorial(int n)
    {
        myResult=0;
        source=n;
        myResult=performFactorial(n);
        
    }
    public int performFactorial(int n)
    {
        //n=0 or n = 1 return 1
        if (n <= 1) return 1;
        else
            return n * performFactorial(n-1);
    }
    public String toString()
    {
        return "Factorial(" + source + ") is "+myResult;
    }
}
