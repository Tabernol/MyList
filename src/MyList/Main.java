package MyList;

import MyList.Task1.AList;

public class Main {

    public static void main(String[] args) {
        AList a = new AList();
        a.add(3);
        a.add(2);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        a.add(11);
        a.add(12);
        a.add(12);
        a.add(12);
        a.add(12);
        a.add(12);
        a.add(12);
        a.add(12);
//        a.clear();
        System.out.println(a.contains(4));
        System.out.println(a.size());
        System.out.println(a.isEmpty());


        a.showArray();

    }
}
