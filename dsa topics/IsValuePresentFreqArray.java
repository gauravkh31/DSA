import java.util.Scanner;

public class IsValuePresentFreqArray {

    public static void main(String[] args) {
        
        int [] freqArray = new int[10001];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
    
        int [] array = new int[n];
    
        System.out.println("Enter array elements:");
        for(int i = 0; i < n ; i++){
            array[i] = sc.nextInt();
        }

        for(int i =0 ; i < n; i++){
            freqArray[array[i]]++;
        }

        System.out.println("Enter no. of queries: ");
        int q = sc.nextInt();

    
        Scanner scs = new Scanner(System.in);
    for(int i = 1; i<= q; i++){
        System.out.println("Enter value to check present or not in array: ");
        
        int val = scs.nextInt();
        if(freqArray[val]!=0){
            System.out.println("Present");
        }else{
            System.out.println("Not present.");
        }

        
    }

scs.close();
    sc.close();
}}
    
