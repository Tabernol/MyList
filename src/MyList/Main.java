package MyList;

import MyList.Task1.AList;

public class Main {

    public static void main(String[] args) {
        AList a = new AList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(3, "ghjk");
        a.add(0, "0");
        a.add(7, "78");
        a.add(15, "78");
        a.remove(1);
        a.remove(((Object) 78));
        System.out.println(a.size());

//        a.clear();
        a.showArray();

    }
}
