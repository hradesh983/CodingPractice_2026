class RotateImageby90{
    public static int[][] Rotate(int matrix[][]){
        int n=matrix.length;
        
        int rotated_matrix[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated_matrix[j][n-i-1]=matrix[i][j];
            }

        }
        return rotated_matrix;

    }
    public static void main(String[]args){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int[][] rotated = Rotate(matrix);

        // Print the rotated matrix
        for (int[] row : rotated) {
            for (int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    
        
        
        
    }
}