package lesson2.HomeWork2;

public class par_4 {
    public static void main(String[] args) {
        int n = 3;
        int[][] nums = new int[n][n];
        for (int i = 0; i < nums.length; i++){
            for(int j=0; j < nums[i].length; j++){


                if (((j + i) == (n - 1)) | j == i )
                {
                    nums[i][j] = 1;
                    System.out.printf("%d ",nums[i][j]);
                } else {
                    System.out.printf("%d ", nums[i][j]);
                }
            }
            System.out.println();
        }
    }
}
