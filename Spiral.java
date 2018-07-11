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
public class Spiral {
    
    public static void main(String[] args) {
        
        int i,j,n,k;
        System.out.println("Enter the size if matrix");
        Scanner in = new Scanner(System.in);
        n=in.nextInt();
        int a[][]=new int[n][n];
        
        k=1;
        int c1=0,r1=0,c2=n-1,r2=n-1;
        
        while(k<=n*n)
        {
            for(i=c1;i<=c2;i++)
            {
                a[r1][i]=k;
                k++;
            }
            
            for(j=r1+1;j<=r2;j++)
            {
                a[j][c2]=k;
                k++;
                
            }
            
            for(i=c2-1;i>=c1;i--)
            {
                a[r2][i]=k;
                k++;
            }
                
            for(j=r2-1;j>=r1+1;j--)
            {
                a[j][c1]=k;
                k++;
            }
            r1++;
            c1++;
            r2--;
            c2--;
            
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
            
        
    }
    
}


