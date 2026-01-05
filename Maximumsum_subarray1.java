class Maximumsum_subarray1{
    public static int maxsum(int arr[],int n,int k ){
        int left=0;
        int right=0;
        int sum=arr[0];
        int len=0;
        

        while(right<n){
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                len=Math.max(len,right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }

        }
        return len;


    }
    public static void main(String args[]){
        int arr[]={1,2,3,1,1,1,1,3,3};
        int k=3;
        int n=9;
        int ans=maxsum(arr,n,k);
        System.out.println(ans);

    }
}