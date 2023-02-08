package assignment7;

import java.util.Arrays;

class ArrayList{
    int arr[] = {1, 2, 3, 4, 5};
    int arra1[][] = {{2,3,4,4,2}};
    int arra2[][] = {{3,2,4}};

    public void show() {
        System.out.println("Integer array as list:" + Arrays.asList(arr));
    }
    public void differ(){
        System.out.println("Integer Arrays: "+ Arrays.deepEquals(arra1,arra2));

    }
    public void equals(){
        System.out.println("Integer Arrays: " + Arrays.equals(arra1,arra2));
    }
}

public class ArraysMethods {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        arraylist.show();
        arraylist.differ();
        arraylist.equals();

    }
}
