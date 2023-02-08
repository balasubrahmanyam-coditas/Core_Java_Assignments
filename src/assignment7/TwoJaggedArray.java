package assignment7;

class Jagged{
    int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
    int arr1[][] = {{9,8,7},{6,5,4},{3,2,1}};
    int num=0;
    public void array(){
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                num = arr[i][j] + arr1[i][j];
                System.out.println("Addition of Array is" + num);
            }
        }

    }
}
public class TwoJaggedArray {
    public static void main(String[] args) {
        Jagged jagged = new Jagged();
        jagged.array();
    }
}
