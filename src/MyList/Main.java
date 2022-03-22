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
        a.add(2,46);
        a.add(0,1);
        a.add(16,555);




        a.showArray();

    }
}
