/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;


import java.util.Scanner;

/**
 *
 * @author memo
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("how many numbers");
int j=scan.nextInt();
int[] num=new int[j+1];
int temp;
for(int i=0;i<j;i++)
{
    num[i]=scan.nextInt();
    
}for(int xs=0;xs<j;xs++){
for (int x=0;x<j;x++)
{
    if(num[x]>num[x+1]){
        temp=num[x];
        num[x]=num[x+1];
        num[x+1]=temp;
    }
    
}}for(int i=1;i<=j;i++){
        System.out.print(num[i]+" ");
}
    }
    
}
