class PascalTriangle{
    public static long Pascal(int r, int c){
        long res=1;
        //numnber of rows and columns due to N-1 C R-1 approach
        int rows=r-1;
        int column=c-1;
        for(int i=0;i<column;i++){
            res=res*(rows-i);
            res=res/(i+1);
            
        }
        return res;
    }
    public static void main(String[]args){
        long ans=Pascal(5,3);
        System.out.println(ans);

    }
}