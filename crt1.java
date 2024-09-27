class crt1 {
    public static int maxArea(int[] height) {
        
        
        int max =Integer.MIN_VALUE;
        for(int i =0; i < height.length; i++){
            for(int j =i+1; j < height.length; j++)
            {
                int ma = (Math.min(height[i],height[j]))*(j-i);
                if(ma>max){
                    max = ma;
                }


            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] a = {1,9,6,2,5,4,8,9,7};
        
        int max = maxArea(a);
        System.err.println(max);
    }
}