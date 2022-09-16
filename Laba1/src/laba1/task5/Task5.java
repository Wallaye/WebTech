package laba1.task5;

public class Task5 {
    public static void main(String[] args){
        System.out.println(_task5(new int[] {1, 3, 2, 4, 5, 6}));
    }
    public static int _task5(int[] arr){
        int len = MaxLength(arr, arr.length);
        return arr.length - len;
    }

    public static int MaxLength(int[] arr, int size){
        int[] lengths = new int[size];
        for (int i = 0; i < size; ++i){
            lengths[i] = 1;
        }

        for (int i = 1; i < size; ++i){
            for (int j = 0 ; j < i; ++j){
                if (arr[i] > arr[j]){
                    if (lengths[i] <= lengths[j]){
                        lengths[i] = lengths[j] + 1;
                    }
                }
            }
        }
        int max = lengths[0];
        for (int i = 1; i < size; ++i){
            if (max < lengths[i]){
                max = lengths[i];
            }
        }
        return max;
    }
}
