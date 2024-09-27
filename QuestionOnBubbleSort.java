// array me jitne bhi zeroes hai unhe last me shift krdo, baaki elements ka relative order same rkhte huye.

import java.util.*;
public class QuestionOnBubbleSort {
    public static void swap(int [] a, int i, int j){
        int temp = a[i];
        a[i] =a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int a [] = {0,2,0,3,0,-1,3,1,8};
        int n = a.length;
        for(int i = 0; i < n-1; i++){
            int flag = 0;
            for(int j = 0;   j < n-i-1; j++){
                if(a[j]==0&&a[j+1]!=0){
                    swap(a,j,j+1);
                    flag=1;
                }
            }
            if(flag==0){
                System.out.println("Sorted Array is: ");
        for(int v: a){
            System.out.println(v+" ");
        }
              return;  
            }
        }
        System.out.println("Sorted Array is: ");
        for(int v: a){
            System.out.println(v+" ");
        }
    }
}
