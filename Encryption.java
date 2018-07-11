/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

import java.util.Scanner;
import sun.text.normalizer.UTF16;

/**
 *
 * @author Student
 */
public class Encryption {
 
    public static void main(String args[])
    {
        int i=1,j,k,l,n=1;
        char a[][],b[][];
        String s="";
        System.out.println("Enter the string");
        Scanner in = new Scanner(System.in);
        s=in.nextLine();
        l = s.length();
     
        System.out.println("");
        
        while((i*i)<l)
        {
            n=i;
            i++;
            
        }
        
        n=n+1;
        k=0;
        
        a=new char[n][n];
        b=new char[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                
                if(k>=l)
                {
                    a[i][j]='.';
                    
                }
                else if(s.charAt(k)==' ')
                {
                   a[i][j]='*';
                }
                else
                {
                    a[i][j]=s.charAt(k);
                }
                
                k++;
            
            }    
        }
        
        
        System.out.println("The matrix is");
        
        System.out.println("");
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("The encrypted code is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[j][i]);
                b[i][j]=a[j][i];
            }
            
        }
         System.out.println("");
         System.out.println("");
        
        System.out.println("The original message is");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
              if(a[i][j]=='*')
              {
                  System.out.print(" ");
              }
              else if(a[i][j]=='.')
              {
                  
              }
              else
              {
                  System.out.print(a[i][j]);
              }
            }
        }
        
        System.out.println("");
    }
}
