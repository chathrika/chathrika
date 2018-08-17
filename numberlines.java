import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 String fname;
        Scanner obj=new Scanner(System.in); 
        System.out.println("Enter any file name:"); 
        fname=obj.nextLine();
        File f1 = new File(fname); 
        int s,nl=0,nc=0; 
        if(f1.exists()) 
        {
            FileReader fs=new FileReader(f1); 
            BufferedReader br=new BufferedReader(fs); 
            while((s=br.read())!=-1) 
            {
                if(s=='\n') 
                nl++;  
               
             
                else
                nc++;
            }
            System.out.println("Number of lines is:"+nl); 
          
            System.out.println("Number of charcter is:"+nc);
        }
        else
        {
            System.out.println("File does not exist"); 
        }
	}
}
