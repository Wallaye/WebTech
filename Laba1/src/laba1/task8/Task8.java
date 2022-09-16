package laba1.task8;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
    }
    public ArrayList<Integer> getIndex(ArrayList<Integer> A,  ArrayList<Integer> B){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int el : B){
            int index = getFirstHigherIndex(A, el);
            result.add(index);
        }
        return result;
    }
    public int getFirstHigherIndex(ArrayList<Integer> list, int target){
        int index = 0;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) > target){
                index = i;
                break;
            }
        }
        return index;
    }
}
