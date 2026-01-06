class MajorityElement{
    public static int Majority(int arr[],int n){
        int count=0;
        int el=0;
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
        }
        if(count1>n/2){
            return el;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[]={7,0,0,0,7,7,7,1,1,1,1,1,1,1,1,1,1};
        int ans=Majority(arr,17);
        System.out.println(ans);
        
    }
}