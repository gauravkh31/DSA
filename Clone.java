public class Clone {
    
    
    public static void main(String[] args) {
        int a[]  = { 5,6,7,8};
        // int b[] = a;

        for(int i = 0; i < a.length; i ++){
            System.out.println(a[i]);
            
    
            }
        
        // b[2] = 44;

        // for(int i = 0; i < a.length; i ++){
        // System.out.println(a[i]);
        // // b jo ki  1 ki coppy tha usme change kiya tha fir bhi original array a change ho chuka hai.

        // }

        // upr wale problem ka solution array cloning se hota hai
        int c[] = a.clone();
        c[3] = 89;
        for(int i = 0; i < a.length; i ++){
            System.out.println(c[i]);
            
    
            }
            for(int i = 0; i < a.length; i ++){
                System.out.println(a[i]);
                // actual array me change nhi hua hai..
        
                }
       }
}
