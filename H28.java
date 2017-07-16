package GUVI;

import java.util.*;

public class H28 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.print("Enter any word : ");
        String a=s.next();
	    int l = a.length();
        char ch;
        String ans="";
          for(int i=0; i<l; i++)
        {
            ch = a.charAt(i);
            if(ch!=' ')
                ans = ans + ch;
            a = a.replace(ch,' ');         }
 
       System.out.println("Word after removing duplicate characters : " + ans);
	}

}
