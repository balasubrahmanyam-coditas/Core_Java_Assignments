package studentDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Details{
    int rNo;
    String name,city;

    public Details(int rNo, String name, String city) {
        this.rNo = rNo;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Details{" +
                "rNo=" + rNo +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

class Sort implements Comparator<Details> {

    @Override
    public int compare(Details o1, Details o2) {
        return o1.rNo- o2.rNo;
    }
}

class SortString implements Comparator<Details>{

    @Override
    public int compare(Details o1, Details o2) {
        return o1.name.compareTo(o2.name);
    }
}
public class Student{
    public static void main(String[] args) {
        ArrayList<Details> list = new ArrayList<Details>();
        list.add(new Details(1,"rams","Chennai"));
        list.add(new Details(4,"Lucky","Hyderabad"));
        list.add(new Details(3,"Eswar","Hyderabad"));
        list.add(new Details(2,"Phani","Pune"));
        System.out.println("Sorting on bases of Number:");

        Collections.sort(list,new Sort());
        for(Details d : list){
            System.out.println(d);
        }
        System.out.println("Sorting on bases Of Name:");

        Collections.sort(list,new SortString());
        for(Details d1 : list){
            System.out.println(d1);
        }
    }
}