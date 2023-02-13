package assignment7;

class ArrayCopys{
    int arr1[] ={2,3,3,3,2};
    int arr2[] = new int[arr1.length];
    public void copy() {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("Elements of original array: ");
       /* for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }*/
        for(int i: arr1){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Elements of new array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
public class CopyArray {
    public static void main(String[] args) {
        ArrayCopys arraycopys = new ArrayCopys();
        arraycopys.copy();
    }
}
