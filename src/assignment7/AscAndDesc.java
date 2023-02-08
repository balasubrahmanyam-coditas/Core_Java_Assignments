package assignment7;
import java.util.*;

class AscendingAndDescending{
    Integer arr[] = {34,23,56,76,78};

    public void ascending(){
        System.out.println("+++ASCENDING ORDER+++");
        Arrays.sort(arr);
        for(int i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public void descending(){
        System.out.println("+++DESCENDING ORDER+++");
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
public class AscAndDesc{
    public static void main(String[] args) {
        AscendingAndDescending ascendinganddescending = new  AscendingAndDescending();
        ascendinganddescending.ascending();
        ascendinganddescending.descending();
    }
}
