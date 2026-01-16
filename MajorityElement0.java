class MajorityElement0{
    public static int Majority0(int arr[],int n){
        int count=0;
        int el=arr[0];
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                el=arr[i];

            }else if(el==arr[i]){
                count++;

            }else{
                count--;
            }



        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==el){
                count1++;
            }
            if(count1>n/3){
                return el;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[]={3,2,2,1,1,1,3,2,2};
        int ans=Majority0(arr,arr.length);
        System.out.println(ans);

    }
}