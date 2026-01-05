class occurenceonly_1_1{
    public static int occur_1(int arr[],int n){
        int xor=0;
        for(int num:arr){
            xor^=num;

        }
        return xor;
    }
    public static void main(String[]args){
        int arr[]={4,4,1,2,2};
        int ans=occur_1(arr,5);
        System.out.println(ans);
    }
}