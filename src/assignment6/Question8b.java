package assignment6;

class Square{
    int i,j,k,l;
    public void design(){
        for(i=6;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }

        for(k=1;k<=6;k++){
            for(l=1;l<=k;l++){
                System.out.print(l);
            }
            System.out.println(" ");
        }
    }
}
public class Question8b {
    public static void main(String args[]){
        Square square = new Square();
        square.design();
    }
}
