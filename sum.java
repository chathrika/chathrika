import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
 
       int num = 100, sum = 0;
 
        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }
 
        System.out.println("Sum = " + sum);
 
	}
}
