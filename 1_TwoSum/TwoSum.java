
import java.util.HashMap;
import java.util.Map;

// 1.Perulangan For
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){

//                 if(nums[i]+nums[j] == target){
//                     System.out.println("Output:"+i+","+j);
//                     return new int[]{i,j};
//                 }
//             }
//         }

//         return new int[]{};
//     }
// }
// Map
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){

            int component = target - nums[i];

            if(map.containsKey(component)){
                int com = map.get(component);
                System.out.println("Output:"+com+","+i);
                return new int[]{com,i};
            }
            map.put(nums[i], i);

        }

        return new int[]{};
    }
}

public class TwoSum{
    public static void main(String[] args) {
        
        Solution solution = new Solution();

        int[] nums ={2,7,11,15};
        int target = 9;
        solution.twoSum(nums, target);
    }
} 