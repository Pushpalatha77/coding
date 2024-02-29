package com.coding;
public class Missing {  
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
        int total =0;
        for(int i=0;i<arr1.length;i++) {
        	total += arr1[i];
        }
        int n =arr1.length + 1;
        int sum1 = ((n) * (n+1))/2;        
        System.out.println("Test case a: " + (sum1-total));;   
        int arr2[] = { 2, 4, 6, 10, 12, 14, 16, 18, 20 };
        int total2 =0;
        for(int j=0;j<arr2.length;j++) {
        	total2 += arr2[j];
        }
        int n1 =arr2.length + 1;
        int sum2 = n1 * (n1+1);        
        System.out.println("Test case b: " + (sum2-total2));;            
        int arr3[] = { 1, 3, 5, 9, 11, 13, 15, 17 };
        int total3 =0;
        for(int k=0;k<arr3.length;k++) {
        	total3 += arr3[k];
        }
        int n3 =arr3.length + 1;
        int sum3 = (n3)*(n3);        
        System.out.println("Test case b: " + (sum3-total3));;   
    }
}
