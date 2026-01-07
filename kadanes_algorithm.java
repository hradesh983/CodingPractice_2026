class kadanes_algorithm{
    public static int kadens(int arr[],int n){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum>max){
                max=sum;

            }
            if(sum<0){
                sum=0;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int arr[]={2,3,5,-2,7,-4};
        int ans=kadens(arr,6);
        System.out.println(ans);
    }

}