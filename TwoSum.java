class TwoSum{
    public static boolean TwoSum(int arr[],int n,int target){
        int left=0;
        int right=n-1;
        while(left<right){
             int sum=arr[left]+arr[right];
             if(sum==target){
                return true;
             }else if(sum<target){
                left++;
             }else{
                right--;
             }

        }
        return false;


    }
    public static void main(String[]args){
        int arr[]={2,6,5,8,11};
        System.out.println(TwoSum(arr,5,7));
    }
}