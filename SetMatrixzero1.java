class SetMatrixzero1{

    public static void setmatrix(int matrix[][]){
        //m=row and n= column
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[] row=new boolean[m];
        boolean[] col=new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i] || col[j]){
                    matrix[i][j]=0;
                }
            }
        }
        
        


    }
    public static void main(String[]args){
        int matrix[][]={{1,1,1,0},{1,0,1,0},{1,1,1,1}};
        setmatrix(matrix);
        for(int [] row:matrix){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
        
        
        
    }
}