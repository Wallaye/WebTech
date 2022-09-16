package laba1.task6;

public class Task6 {
    public static void main(String[] args){
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int[][] ans = _task6(arr);
        for (int i = 0; i < ans.length; i++){
            for (int j = 0; j < ans[i].length; j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] _task6(int[] arr){
        int[][] res = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                res[i][j] = arr[(i + j) % arr.length];
            }
        }
        return res;
    }
}
