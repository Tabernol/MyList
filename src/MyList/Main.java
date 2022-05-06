package MyList;

import MyList.Task1.AList;
import MyList.Task2.RList;

public class Main {

    public static void main(String[] args) {
        AList a = new AList();
        RList r = new RList();
        r.add("rt");
        r.add("2");
        r.add("3");
        r.add("4");
        r.add("5");
        r.add("6");
        r.add("7");
        r.add("8");
        r.moreLength();

        r.showArray();



    }
}
