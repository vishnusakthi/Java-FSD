package Searching;

import java.util.Scanner;

public class LinearSearch {
private static Scanner sc;

public static void main(String[] args) {
        
        int  [] arr= {12,14,16,18,20,22,24};
        
        sc = new Scanner(System.in);
        System.out.println("Enter the Element to  be Searced");
        
        int SearchValue= sc.nextInt();
        
        int result= linearing(arr,SearchValue);
        
        if(result==-1) {
            System.out.println("Element Not Found In The Array");
        }
        else {
            System.out.println("Element Found at index: ["+result+"]  and the Search  key is :"+arr[result]);
        }
        
    }
    
private static int linearing(int[] arr,int searchValue) {
        
            for(int i=0; i<arr.length; i++) {
            
            if(arr[i]==searchValue) {
                return i;
            }
            
        }
        return -1;
    }

}
