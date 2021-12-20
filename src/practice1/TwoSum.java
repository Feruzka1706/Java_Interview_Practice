package practice1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr={3,2,4};
        int target =5;
        System.out.println("twoSum(arr,target) = " + Arrays.toString(twoSum(arr, target) ));
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map=new LinkedHashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if(map.containsKey(target-nums[i] ) ){
                return new int [] {map.get(target-nums[i]),i};
            }

            map.put(nums[i],i );
        }
        return new int[] {-1,1};
    }
}
