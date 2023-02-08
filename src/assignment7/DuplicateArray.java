package assignment7;
import java.util.*;

class Array{
    int arr[] = {2,3,2,3,4,5};
    public void show(){
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
    public void remove(){
        public void RemoveDuplicate(){
            for (int i = 0, k = 0; i < arr.length; i++) {
                if (i == arr[i]) {
                    continue;
                }
                arr[k++] = arr[i];
            }
    }
}
public class DuplicateArray {
    public static void main(String[] args) {
        Array array = new Array();
        array.show();
        array.remove();
    }
}
