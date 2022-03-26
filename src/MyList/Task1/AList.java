package MyList.Task1;

import java.util.Arrays;
import java.util.Objects;

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

    public void moreLengh() {
        if (count == array.length) {
            Object[] changeArray = new Object[capacity * 3 / 2 + 1];  // вынеси увеличение массива в одельный метод нафига ты в каждом методе его дублируешь
            for (int i = 0; i < array.length; i++) {
                changeArray[i] = array[i];
            }
            array = changeArray;
            capacity = array.length;
        }
    }

    public boolean add(Object item) {
        moreLengh();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = item;        // --- теперь норм??????????????
                break;
            }
        }
        count++;
        return true;//тут все норм?
    }

    public boolean addFirst(Object item) {
        moreLengh();
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        count++;
        array[0] = item;
        return true;
    }

    public boolean add(int index, Object item) throws IndexOutOfBoundsException {
        moreLengh();
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
            if (array[i] != null && array[i].equals(item)) {//сделай все одним ифом
                array[i] = null;
                findObject = true;
                count--;
            }
        }
        return findObject;
    }

    public Object remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= capacity) {
            throw new IndexOutOfBoundsException();
        }
        Object object = array[index];
        if (array[index] != null) {
            array[index] = null;
            count--;
        }
        return object;
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        count = 0;
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
//        int count2 = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != null) {
//                count2++;
//            }
//        }
        return count;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AList aList = (AList) o;
        return capacity == aList.capacity && count == aList.count && Arrays.equals(array, aList.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(capacity, count);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}

