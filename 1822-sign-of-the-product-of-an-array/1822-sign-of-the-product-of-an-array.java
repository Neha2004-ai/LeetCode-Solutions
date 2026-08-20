class Solution {
    public static int arraySign(int[] nums) {
        int count  = 0;
        for(int  i = 0;i<nums.length;i++){
            if(nums[i]==0) return 0;
            else if(nums[i]<0)
            count++;
        }
        if(count %2 == 1){
            return -1;
        }else{
            return 1;
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = sc.nextInt();
        int[]nums = new int [n];
        System.out.println("enter the array element:");
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int result = arraySign(nums);
        System.out.println("answer" + result);
        sc.close();
    }
}