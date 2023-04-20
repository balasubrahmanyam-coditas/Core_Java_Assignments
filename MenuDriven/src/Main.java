import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num=0;
        char ch = 'Y';
        while(ch=='y' || ch=='Y')
        {
            System.out.println("Enter 1 for Addition\nEnter 2 for Subtraction\nenter 3 for division");
            System.out.println("Enter your menu number:");
            num = sc.nextInt();
            System.out.println("Enter n1 and n2:");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int ans=0;
            switch (num)
            {
                case 1:
//                    System.out.println("sum");
                    Sum obj1 = new Sum();
                    System.out.println(obj1.sum(n1,n2));
                    break;
                case 2:
                    Subtraction obj2 = new Subtraction();
                    System.out.println(obj2.sub(n1,n2));
                    //System.out.println("Subtraction");
                    break;
                case 3:
                    System.out.println("Division");
                    Division obj3 = new Division();
                    System.out.println(obj3.div(n1,n2));
                    break;
                default:
                    System.out.println("Invalid num");
            }
            System.out.println("Enter Y if u want to continue else enter n");
            ch=sc.next().charAt(0);
        }
        System.out.println("Thank you!");
    }
}