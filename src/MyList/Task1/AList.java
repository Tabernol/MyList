package MyList.Task1;

public class AList {
    int capacity = 10;
    int count = 0;
    Object[] array = new Object[capacity];

    public Object get(int index) throws IndexOutOfBoundsException {
        if (index >= capacity) {
            throw new IndexOutOfBoundsException();
        }
        Object object = array[index];
        return object;
    }

    public boolean add(Object item) {
        array[count++] = item;
        if (count == array.length) {
            Object[] changeArray = new Object[capacity * 3 / 2 + 1];
            for (int i = 0; i < array.length; i++) {
                changeArray[i] = array[i];
            }
            array = changeArray;
            capacity = array.length;
        }
        return true;//тут все норм?
    }

    public boolean addFirst(Object item) {
        count++;
        if (count == array.length) {
            Object[] changeArray = new Object[capacity * 3 / 2 + 1];
            for (int i = 0; i < array.length; i++) {
                changeArray[i] = array[i];
            }
            array = changeArray;
            capacity = array.length;
        }
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = item;
        return true;
    }

    public boolean add(int index, Object item) throws IndexOutOfBoundsException {
        if (index > array.length) {
            Object[] changeArray = new Object[capacity * 3 / 2 + 1];
            for (int i = 0; i < array.length; i++) {
                changeArray[i] = array[i];
            }
            array = changeArray;
            capacity = array.length;
        }
        if(index<0 || index>=capacity){// тут без = викидається перша не моє виключення а Java
            throw  new IndexOutOfBoundsException();
        }
        for (int i = array.length - 2; i >= index; i--) {
            array[i + 1] = array[i];
        }
        count++;
        array[index] = item;
        return true;
    }

    public void showArray() {
        for (Object ob : array) {
            System.out.print(ob + " ");
        }
    }
}

