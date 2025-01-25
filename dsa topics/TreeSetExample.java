import java.util.TreeSet;
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        // System.out.println("Enter no. of elements: ");
        // int z = sc.nextInt();
        // TreeSet<Integer> set = new TreeSet<>();
        // System.out.println("Enter set elements: ");
        // for(int i = 1; i <= z ; i++){
        //     int k = sc.nextInt();
        //     set.add(k);
        // }
    
        // int target = 10;
        // // System.out.println(set.size());

        // for (int num : set){
        //     if(set.contains(target-num)){
        //         System.out.println("found.");
        //         return;
        //     }
        // }
        
        // System.out.println("not found.");



        TreeMap map = new TreeMap();
        map.put(105,"Gaurav");
        map.put(104, "ram");
        System.out.println(map);
        System.out.println(map.firstEntry());
        sc.close();
    }
}