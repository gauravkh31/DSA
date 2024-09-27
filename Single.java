public class Single {

    public static void main(String[] args) {
        int [] a = {2,3,4,4,7,2,8,3,7,9,9,6,6};

        for(int i = 0; i < a.length;i++){
            for(int j = i+1; j <a.length; j++){
                if(a[i] == a[j]){
                    a[i] = a[j] = -1;
                }
            }
        }

        for(int i = 0;  i < a.length; i++){
            if(a[i] !=-1){
                System.out.println(a[i]);
            }

        }
    }
    
}
