package assignment6;

class Patterns{
    int i,j;
    public void design(){
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
public class Question8a {
    public static void main(String args[]){
        Patterns patterns = new Patterns();
        patterns.design();
    }
}
