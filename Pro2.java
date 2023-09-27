
package com.mycompany.pro2;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author sujiitramurukeshan
 */
public class Pro2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int d,q,x,y,z,i,j;
        int[][] a=new int[n][];
        for(i=0;i<n;i++){
            d = scan.nextInt();
            a[i]=new int[d+1];
            a[i][0]=d;
            //for(j=1; j<=a[i][0]; j++){
            for(j=1; j<=d ; j++){
                a[i][j]=scan.nextInt();  
            } 
        }
        q=scan.nextInt();
        for(int k=0; k<q;k++){
            x=scan.nextInt();
            y=scan.nextInt();
            z=(a[x-1].length)-1;
            if(z<y){
                System.out.println("ERROR!");
            }
            else
            System.out.println(a[x-1][y]);
        }
       scan.close(); 
    }
}
