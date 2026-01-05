class Maximumsum_subarray{
    public  static int mxsum(int arr[],int k,int n){
        int len=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                        len= Math.max(len,j-i+1);
                }

            }
             
        }
        return len;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,1,1,1,1,3,3};
        int k=3;
        int n=9;
        int ans=mxsum(arr,k,n);
        System.out.println(ans);

    }
}