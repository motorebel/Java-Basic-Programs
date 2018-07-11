
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class Hourglass {
    
    public static void main(String[] args) {
        
        int i,j,k,n;
        System.out.println("Enter the number of rows");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        
        
        //part 1
        
         for(i=1;i<=n;i++)
        {
            
            for(j=1;j<=i;j++)
            {
                System.out.print("  ");
                
                
            }
            
            for(j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            
            
            for(j=n-1;j>=i;j--)
            {
                System.out.print("* ");
            }
            
            
          
            System.out.println("");
            
        }
        
         
         for(i=n;i>=2;i--)
        {
            
            for(j=1;j<=i-1;j++)
            {
                System.out.print("  ");
                
            }
            
            for(j=n+1;j>=i-1;j--)
            {
                System.out.print("* ");
            }
            
            
            for(j=n-1;j>=i;j--)
            {
                System.out.print("* ");
            }
    
            
            System.out.println("");
            
        }
        
    }
    
}
