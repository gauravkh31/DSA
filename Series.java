public class Series {
    

    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 0;
        arr[1] = arr[0]+5;
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for(int i = 2; i < 10; i=i+2){
            arr[i] = arr[i-1]*2;
            System.out.println(arr[i]);
            arr[i+1] = arr[i]+5;
            System.out.println(arr[i+1]);

            
        }
    }
}
