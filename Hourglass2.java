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
public class Hourglass2 {
    
    public static void main(String args[])
    {
        
        int i,j,k,n;
        System.out.println("enter the number");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
     
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
               
            }
        
            for(k=i;k<=n;k++)
            {
                System.out.print(k+" ");
            }
            
            System.out.println("");
        }
        
        
        
         for(i=n;i>=1;i--)
        {
            if(i==n)
            {
                
            }
            else
            {
                
            
            for(j=i;j>=1;j--)
            {
                System.out.print(" ");
               
            }
            }
        if(i==n)
        {
           
        }
        else
        {
            for(k=i;k<=n;k++)
            {
                System.out.print(k+" ");
            }
        }
            
            if(i==n)
            {
                
            }
            else
            {
            System.out.println("");    
            }
            
        }
         
         
         
    }
}
