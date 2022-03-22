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
        if (count == array.length) {
            Object[] changeArray = new Object[capacity * 3 / 2 + 1];  // вынеси увеличение массива в одельный метод нафига ты в каждом методе его дублируешь
            for (int i = 0; i < array.length; i++) {
                changeArray[i] = array[i];
            }
            array = changeArray;
            capacity = array.length;
        }
        array[count++] = item; // --- теперь норм
        return true;//тут все норм?
    }

    public boolean addFirst(Object item) {
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
        count++;
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
        if (index < 0 || index >= capacity) {// тут без = викидається перша не моє виключення а Java
            throw new IndexOutOfBoundsException();
        }
        for (int i = array.length - 2; i >= index; i--) {
            array[i + 1] = array[i];  // это не правельная логика на сколько я вижу
        }
        count++;
        array[index] = item;
        return true;
    }

    public boolean remove(Object item) {
        boolean findObject = false;
        for (int i = 0; i < array.length; i++) {// не працювало з циклом FOREACH&?????????? коли брав обєкт а не ячейку массиву
            if (array[i] != null) {
                if (array[i].equals(item)) {  //сделай все одним ифом
                    array[i] = null;
                    findObject = true;
                }
            }
        }


           // вот так не работало???
           /* for (Object obj: array) {
                if(obj != null){
                    if (obj.equals(item)) {
                       obj = null;
                        findObject = true;
                    }
            }*/

        return findObject;
    }

    public Object remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= capacity) {
            System.out.println("my exeption");
            throw new IndexOutOfBoundsException();
        }
        Object object = array[index];
        array[index] = null;
        return object;
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public boolean contains(Object item) {
        boolean availability = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].equals(item)) {
                    availability = true;
                }
            }
        }
        return availability;
    }

    public int size() {
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                count2++;
            }
        }
        return count2;
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                empty = false;
            }
        }
        return empty;
    }

    public void showArray() {
        for (Object ob : array) {
            System.out.print(ob + " ");
        }
    }
}

