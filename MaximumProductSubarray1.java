class MaximumProductSubarray1{
    public static int maimumproduct_subarray(int arr[],int n){
        int maxi=arr[0];
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i;j<n;j++){
                product=product*arr[j];
                maxi=Math.max(maxi,product);

            }
            
     

        }
        return maxi;

    }
    public static void main(String[]args){
        int arr[]={2,3,-2,4};
        int n=arr.length;
        int ans=maimumproduct_subarray(arr,n);
        System.out.println(ans);
    }

}
