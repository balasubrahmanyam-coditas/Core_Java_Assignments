package assignment8;

abstract class Instrument{
    public abstract void play();
}
class Piano extends Instrument{
    public void play(){
        System.out.println("Piano is playing tan tan tan tan");
    }
}
class Flute extends Instrument{
    public void play(){
        System.out.println("Flute is playing toot toot toot toot");
    }
}
class Guitar extends Instrument{
    public void play(){
        System.out.println("Guitar is playing tin tin tin");
    }
}
public class Abstract1 {
    public static void main(String[] args) {
        Instrument arr[]= new Instrument[10];
        for( int i=0;i<4;i++){
            arr[i] = new Guitar();
            //arr[i].play();
        }
        for(int i=4;i<7;i++) {
            arr[i] = new Piano();
            //arr[i].play();

        }
        for(int i=7;i<10;i++){
            arr[i] = new Flute();
           // arr[i].play();
        }
        for(int i=0;i<10;i++){
            arr[i].play();
        }

    }
}






