import java.util.*;
public class HashSetBagTablePairProblem {
    public static int maxElementsOnTableAtATime(int [] bag){
        HashSet<Integer> table = new HashSet<>();
        int tableSize =0; 
        for(int val : bag){
            if(table.contains(val)){
                table.remove(val);
            }else{
                table.add(val);
                if(table.size()>tableSize){
                    tableSize = table.size();
                }
                         }
        }
             return tableSize;
    }

    public static void main(String[] args) {
        int [] bag = {1,1};
        int ans = maxElementsOnTableAtATime(bag);
        System.err.println(ans);
    }
    
}
