import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println((A.length()+B.length()));
        int result=A.compareTo(B);
        if(result>0){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
//        String capitalize = A.charAt(0).toUpperCase();  //errror
//        String capitalize1 = B.charAt(0).toUpperCase(); //errror
        System.out.print(A+" "+B);
        
        
    }
}
             
        
        
        
  
       



