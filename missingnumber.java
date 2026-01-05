class missingnumber{
    public static int missing(int arr[],int N){
        int sum=N*(N+1)/2;
        int actualsum=0;
        for(int i=0;i<N-1;i++){
            actualsum+=arr[i];
        }
        return sum-actualsum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int ans=missing(arr,5);
        System.out.println(ans);
    }
}