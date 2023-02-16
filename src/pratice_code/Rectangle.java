package pratice_code;

class Field{
    private int length;
    private int breath;
    private int area;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    public int getArea()
    {
         area=length*breath;
         return area;

    }

    @Override
    public String toString() {
        return "Field{" +
                "length=" + length +
                ", breath=" + breath +
                ", area=" + area +
                '}';
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Field field = new Field();
        int ans;
        field.setLength(43);
        field.setBreath(32);
        ans = field.getArea();
        //System.out.println("area of rectangle is: "+field.getLength()*field.getBreath());
        System.out.println(ans);
    }
}
