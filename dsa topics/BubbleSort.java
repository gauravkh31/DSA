import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int [] a = new int[n];
        for(int i =0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        for(int i =0 ; i < n-1; i ++){
            int flag = 0;
            for(int j = 0; j < n-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag==0){
                System.out.println(i);
                return;
            }
        }
        for(int i : a){
            System.out.println(i);
        }

    }
}
