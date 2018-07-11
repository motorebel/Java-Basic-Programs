/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Box {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        
        int i,j,k,n;
        System.out.println("Enter the number of rows");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(i=n;i>=1;i--)
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
        
      
        
        
        
        
        for(i=1;i<=n;i++)
        {
            
            for(j=0;j<=i;j++)
            {
                System.out.print("  ");
                
                
            }
            
            for(j=n-1;j>=i;j--)
            {
                System.out.print("* ");
            }
            
            
            for(j=n-2;j>=i;j--)
            {
                System.out.print("* ");
            }
            
            
          
            System.out.println("");
            
        }
        
        
        
        
        
        
    }
    
}


