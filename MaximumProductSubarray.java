class MaximumProductSubarray{
    public static int maimumproduct_subarray(int arr[],int n){
        int prefix=1; 
        int suffix=1;
        int maxi=0;

        for(int i=0;i<n;i++){

            prefix=prefix*arr[i];
            suffix=suffix*arr[n-i-1];
            if(prefix==0) {
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
            maxi=Math.max(maxi,Math.max(prefix,suffix));
            

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