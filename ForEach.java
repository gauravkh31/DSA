

public class ForEach{

    public static void main(String[] args) {
        // int array[] = { 2,3,4,5,6};
        // for(int value : array){
        //     System.out.println(value);
        // }

        int array2[] = {0, 3,4,5,6};
        int i = 0;
        // while(i < array2.length){
        //     System.out.println(array2[i]);
        //     i++;
        // }

        int sum = 0;
        while(i < array2.length){
            sum = sum + array2[i];
            i++;
        }
        System.out.println(sum);
        int min = Integer.MAX_VALUE;
        // System.out.println(min);
        for(int j = 0; j < array2.length; j++){
            if(array2[j] < min){
                min = array2[j];
            }
        }
        System.out.println(min);
        
    }
}