
class CountT {
    public void Count(){
        StringTokenizer stringTokenizer = new StringTokenizer("Hello everyone, How are you?"," ");

        int count=0;

        while (stringTokenizer.hasMoreTokens()){
            stringTokenizer.nextToken();
            count++;
        }

//        System.out.println("There are "+count+" tokens");
    }
}
public class CountTokens{
    public static void main(String[] args) {
        CountT t = new CountT();
        System.out.println(t.Count());
    }
}