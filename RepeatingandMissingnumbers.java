class RepeatingandMissingnumbers{
    public static int[] repeatingandmissing(int nums[],int n){
        long Sn=n*(n+1)/2;
        long S2n=(n*(n+1)*(2*n+1))/(6);
        long S=0;
        long S2=0;
        for(int i=0;i<n;i++){
            S+=nums[i];
            S2+=((long) nums[i] * (long) nums[i]);

        }
        long xplusy=(S2-S2n) / (S-Sn);
        long xminusy=(S-Sn);
        long x =(xplusy+xminusy)/2;
        long y= xplusy-x;

        return new int[]{(int) x,(int) y};


    }
    public static void main(String[] args) {
        int nums[]={4,3,6,2,1,1};
        int ans[]=repeatingandmissing(nums,6);
        for(int num:ans){
            System.out.print(num+" ");
        }


    }
    
}