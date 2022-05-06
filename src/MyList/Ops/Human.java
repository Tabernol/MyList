package MyList.Ops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Human implements Comparable<Human>{
    int id;
    String name;
    String surname;
    int age;
    boolean isMan;
    String status;

    public Human(int id, String name, String surname, int age, boolean isMan, String status) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMan = isMan;
        this.status = status;
    }


    public static void main(String[] args) {
        Human max = new Human(42,"Max", "Krasnopolskyi", 31,true,"Alfons");
        Human den = new Human(777,"Den", "Volocha", 32,true,"IT guru");
        Human ira = new Human(7,"Ira", "Krasnopolska", 36,false,"Lady of my heart");

        List<Human> we = new ArrayList<>();
        we.add(max);
        we.add(den);
        we.add(ira);
        System.out.println(we);
        Collections.sort(we);
        System.out.println(we);
    }

    //    @Override
//    public int compareTo(Human human) {
//        return this.id-human.id;
//    }
//    @Override
//    public int compareTo(Human human) {
//        return this.surname.compareTo(human.surname);
//    }
    @Override
    public int compareTo(Human human) {
        if(isMan){
            return 1;
        }
        else return -1;
    }
}

