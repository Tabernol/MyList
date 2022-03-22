package MyList;

import MyList.Task1.AList;

public class Main {

    public static void main(String[] args) {
        AList a = new AList();
        a.add(3);
        a.add(4);
        a.addFirst(8);
        a.add(4);
        a.addFirst(8);
        a.addFirst(9);
        a.add(2);
        a.add(2, 46);
        a.add(0, 1);
        a.add(15, 555);
        a.remove(4);
        a.remove(3);
//        a.clear();
        System.out.println(a.contains(4));
        System.out.println(a.size());
        System.out.println(a.isEmpty());


        a.showArray();

    }
}
