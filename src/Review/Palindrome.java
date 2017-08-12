/* This class check for Palindrome.  It automatically check if is Palindrome.

Ex:
Palindrome test = new Palindrome ("abba");
System.out.println(test);
 */
package Review;

/**
 *
 * @author Tuan La
 */
public class Palindrome {
    String source;  //source of string
    boolean result; 
    
    //constructor
    Palindrome (String some)
    {
        this.source=some;this.result=true;
        check();
    }
    public void check()
    {
        int leftIndex,rightIndex; //declare my left and right index
        leftIndex=0;//initialize the first index of the string
        rightIndex=source.length()-1; //initialize the last index of the string
        if (rightIndex <= 0) result =false;  //if there is one character it returns as false
        //while the left index is smaller than the right index
        while (leftIndex < rightIndex)
        {
            //if there is a character that does not match it automatically exit the loop
            if (source.charAt( leftIndex) != source.charAt(rightIndex))
            {
                result=false; break;
            }
            //increment the left index and decrement the right index
            leftIndex++; rightIndex--;
        }
        
    }
    //display the result when this is call
    //ex. System.out.println(test);
    public String toString()
    {
        //if result is true
        if (result)
            return source + " : This is Palindrom.\n";
        else //result is false
            return source + " : Not Palindrome.\n";
    }
    
}
