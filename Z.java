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
public class Z {
    
    public static void main(String[] args) {
        
        int i,j,n;
        System.out.println("Enter the size of Z");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || i==n-1 || i+j==(n-1))
                {
                    System.out.print("* ");
                    
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
         
        
    }
    
}
