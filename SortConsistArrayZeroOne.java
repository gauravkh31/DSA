import java.util.*;
public class SortConsistArrayZeroOne {
    public static void swap(int array[] , int i , int j){
        int temp = array[i];
        array[i]= array[j];
         array[j] = temp;
    }
    public static void main(String[] args) {
        int array[] = {1,0,0,0,1,1,1,1,0,1,1,0,1,0,1,1,0};
        System.out.println("UnSorted array is : ");
        for(int p =0; p < array.length; p++){
            System.out.println(array[p]);
        }
        int i =0 ;
        int j = array.length-1;
        while(i<j){
            if(array[i]==1 && array[j] == 0){
                swap(array, i, j);
                i++;
                j--;
            }
            if(array[i] ==0){
                i++;
            }
           
           
            if(array[j] == 1){
                j--;

            }
        }
        
        System.out.println("Sorted array is : ");
        for(int k =0; k < array.length; k++){
            System.out.println(array[k]);
        }
    }
    }

