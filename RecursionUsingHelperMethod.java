// public class RecursionUsingHelperMethod {
//     public static int helper(String s, int count){
//         if(s.isEmpty()){
//             return count;
//         }
//         return helper(s.substring(1),count+1);
//     }
//     public static int measure(String s){
//         int count =0; 
//         int value = helper( s,  count);
//         return value;
//     }

//     public static void main(String[] args) {
//         System.out.println(measure("aklsdnf"));
        
//     }
// }







public class RecursionUsingHelperMethod {
    
    public static int measure(String s){
        if(s.isEmpty()){
            return 0;
        }
        int count =1; 
        return count+measure(s.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(measure("aklsdnf"));
        System.out.println(measure("s"));

        
        
    
        
    }
}

