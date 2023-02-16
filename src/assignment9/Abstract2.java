package assignment9;

class Medicine{
    public void displayLabel(){
        String name = "Sai";
        String address = "Vijayawada";
        System.out.println(name +" "+ address);

    }
}
class Tablet extends Medicine{
    public void displayLabel(){
        System.out.println("Store in a cool dry place");
    }
}
class Syrup extends Medicine{
    public void displayLabel(){
        System.out.println("Nice one tastes good");

    }
}
class Ointment extends Medicine{
    public void displayLabel(){
        System.out.println("For external use only");

    }
}
public class Abstract2 {
    public static void main(String[] args) {
        Medicine[] medicines = new Medicine[10];
        for (int i = 0; i < medicines.length; i++) {
            int random = (int) (Math.random() * 3) + 1;
            if (random == 1) {
                medicines[i] = new Tablet();
            } else if (random == 2) {
                medicines[i] = new Syrup();
            } else {
                medicines[i] = new Ointment();
            }
            medicines[i].displayLabel();
            System.out.println();
        }

    }
}
/*
Nice one tastes good

Store in a cool dry place

Nice one tastes good

Nice one tastes good

Store in a cool dry place

Nice one tastes good

For external use only

For external use only

Store in a cool dry place

Store in a cool dry place


Process finished with exit code 0

 */
