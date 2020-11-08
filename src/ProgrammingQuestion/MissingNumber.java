package ProgrammingQuestion;

public class MissingNumber {
    public static void main(String[] args) {
        int input[] = {1,4,5,3,0};
        int res;
        res = missingNumber(input);
        System.out.println("res = " + res);
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int res= Math.abs(total-sum);
        return res;
    }

}
