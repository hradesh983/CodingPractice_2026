class occurenceonly_1{
    public static int occur_1(int[]arr,int n){
        
        
        for(int i=0;i<n;i++){
            int num=arr[i];
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==num){
                    count++;
                }
                
            }
                if(count==2){
                    return num;
                }
            
        }
        return -1;

    }
    public static void main(String[]args){
        int arr[]={4,1,2,2};
        int ans=occur_1(arr, 4);
        System.out.println(ans);

    }
}