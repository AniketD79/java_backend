import java.util.Arrays;
class Leet1 {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0; i<nums.length; i++){
             System.out.print(nums[i]);
            for(int j= i+1; j<nums.length; j++){
                int sum = nums[i]+nums[j];
               
                System.out.println(nums[i]+" + "+ nums[j]+" = "+sum);
                if(sum ==target){
                     arr[0]=i;
                     arr[1]=j;
                   
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        Leet1 l= new Leet1();
        l.twoSum(new int[]{1,2,3,4,5}, 7);
    }
}